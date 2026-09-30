package com.zihadhossain.islamigojolbangla;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyInterstitial;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class HomeFragment extends Fragment {


      AdView mAdView;


    LinearLayout layBottomBanner;
    public static int CategoryClicked = -10;
    ImageSlider imageSlider;
    ExpandableHeightGridView mainGrid;
    RelativeLayout rLayRateUs;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View my_view= inflater.inflate(R.layout.home_activity, container, false);

        mAdView = my_view.findViewById(R.id.adView);
        imageSlider = my_view.findViewById(R.id.image_slider);
        mainGrid = my_view.findViewById(R.id.mainGrid);
        layBottomBanner=my_view.findViewById(R.id.layBottomBanner);
        rLayRateUs = my_view.findViewById(R.id.rLayRateUs);
        mAdView.setVisibility(View.GONE);


        if (getString(R.string.show_admob_ad).contains("ON")){
            initAdmobAd();
            loadBannerAd();
            loadFullscreenAd();
        }

        createSlider();
        MakeVideoList.createMyAlbums();
        rateUsOnGooglePlay();

        MyAdapter adapter = new MyAdapter();
        mainGrid.setExpanded(true);
        mainGrid.setAdapter(adapter);
        adapter.notifyDataSetChanged();



        return  my_view;
    }

    //------------------------------onCreate (bundle) ENDS here
    // ================================================================
    // ================================================================
    // ================================================================

    private void createSlider(){

        ArrayList<SlideModel> imageList = new ArrayList<>();
        //imageList.add(new SlideModel(R.drawable.slide_1, null));
        imageList.add(new SlideModel(R.drawable.kolorab2, "ইসলামী গজল বলে দেয় ধর্মের অগ্রদূতের বাণী।", null));
        imageList.add(new SlideModel(R.drawable.sayed_ahmed, "সহজেই মনের নানা পাতা খুলে দেয় ইসলামী সঙ্গীত।", null));

        imageList.add(new SlideModel(R.drawable.abu_rayhan, "ইসলামী গজলে বেঝে উঠে আল্লাহর স্বর্গীয় বাণী।", null));
        imageList.add(new SlideModel(R.drawable.sadman, "ইসলামী গজল বলে দেয় প্রেম এবং শান্তির সন্ধান।", null));
        imageList.add(new SlideModel(R.drawable.badruzzaman, "ইসলামী গজলে পাওয়া যায় পবিত্রতা ও নৈতিকতার প্রশংসা।", null));
        imageList.add(new SlideModel(R.drawable.ubayda, "গজলে পাওয়া যায় বেহেশতের আশা।", null));
        imageList.add(new SlideModel(R.drawable.kolorab3, "গজলে পাওয়া যায় ধর্মীয় ব্যক্তিত্বের আকর্ষণ।", null));
        //imageList.add(new SlideModel(R.drawable.bachcu2, "গজল বলে দেয় নৈতিকতা এবং পরিশ্রমের মূল্য।", null));
        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);

    }
    // ================================================================
    // ================================================================
    // ================================================================



    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public  MyAdapter(){
            this.inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return MakeVideoList.catArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.grid_item, parent, false);


            ImageView imgIcon = convertView.findViewById(R.id.imgIcon);
            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            LinearLayout layItem = convertView.findViewById(R.id.layItem);

            HashMap<String, String> mHashMap = MakeVideoList.catArrayList.get(position);
            String catName = mHashMap.get("category_name");
            String img = mHashMap.get("img");



            if (tvTitle!=null) tvTitle.setText(catName);
            if (imgIcon!=null && img!=null) {
                int drawable = Integer.parseInt(img);
                imgIcon.setImageResource( drawable );
            }

            Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.anim_grid);
            animation.setStartOffset(position*300);
            convertView.startAnimation(animation);



            if (layItem!=null){
                layItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //We are tracking the category postion. So that we can call the intent after ad loads
                        CategoryClicked = position;

                        if (mInterstitialAd==null){
                            MainActivity.arrayList = MakeVideoList.rootArrayList.get(position);
                            startActivity(new Intent(getActivity(), MainActivity.class));
                        }else{
                            mInterstitialAd.show(getActivity());
                        }

                    }
                });
            }



            return convertView;
        }
    }




    //=============================================
    //=============================================
    //=============================================









    int BANNER_AD_CLICK_COUNT =0;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private void loadBannerAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                if (BANNER_AD_CLICK_COUNT >=2){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }else{
                    if(mAdView!=null) mAdView.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                BANNER_AD_CLICK_COUNT++;

                if (BANNER_AD_CLICK_COUNT >=2){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>













    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // loadFullscreenAd method starts here.....
    AdColonyInterstitial mInterstitialAd;

    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdColony adRequest = new AdColony().configure().build();
        AdColonyInterstitial.load(getActivity(),getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull AdColonyInterstitial interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setListener(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        loadFullscreenAd();

                        if (CategoryClicked>=0){
                            MainActivity.arrayList = MakeVideoList.rootArrayList.get(CategoryClicked);
                            startActivity(new Intent(getActivity(), MainActivity.class));
                        }

                    }

                }); // FullScreen Callback Ends here


            }
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }

        });

    }


    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    private void initAdmobAd(){

        if (getString(R.string.device_id).length()>12){
            //Adding your device id -- to avoid invalid activity from your device
            List<String> testDeviceIds = Arrays.asList(getString(R.string.device_id));
            RequestConfiguration configuration =
                    new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
            MobileAds.setRequestConfiguration(configuration);
        }




        //Init Admob Ads
        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

    }


    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    private void rateUsOnGooglePlay(){
        rLayRateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String appPackageName = getActivity().getPackageName(); // getPackageName() from Context or Activity object
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }

            }
        });
    }

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

}