package com.zihadhossain.islamigojolbangla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class OpenActivity extends AppCompatActivity {


    DrawerLayout drawerLayout;
    Toolbar materialToolbar;
    FrameLayout frameLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lancher_activity);

        drawerLayout =findViewById(R.id.drawerLayout);
        frameLayout =findViewById(R.id.frameLayout);
        materialToolbar =findViewById(R.id. materialToolbar);
        navigationView =findViewById(R.id.navigationView);

        ConnectivityManager connectivityManager= (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();

        if (networkInfo !=null && networkInfo.isConnected() ){
            Toast.makeText(OpenActivity.this,"Internet Connected.",Toast.LENGTH_LONG).show();
        }else {
            new AlertDialog.Builder(OpenActivity.this)
                    .setTitle("No Internet!!")
                    .setMessage("Please Connect your Internet.")
                    .show();
        }



        //=========fragment manager=============

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, new HomeFragment());
        fragmentTransaction.commit();


        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(
                OpenActivity.this, drawerLayout,materialToolbar, R.string.drawer_close,R.string.drawer_open);
        drawerLayout.addDrawerListener(toggle);



        materialToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId()==R.id.share){
                    // ============== share apps =================
                    ShareApp(OpenActivity.this);
                }

                return true;
            }
        });
        //=======================================================================================


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                 if (item.getItemId()==R.id.shareApps) {
                    // ============== share apps =================
                    ShareApp(OpenActivity.this);
                    drawerLayout.closeDrawer(GravityCompat.START);

                }else if(item.getItemId()==R.id.moreApps) {
                    // ============= more apps =============
                    MoreApps();
                    drawerLayout.closeDrawer(GravityCompat.START);

                }else if(item.getItemId()==R.id.rateUs) {
                    // ============= Rate Us =============
                    RateUs();
                    drawerLayout.closeDrawer(GravityCompat.START);

                }else if (item.getItemId()==R.id.exit) {
                    //======================= exit =================
                    onBackPressed();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else if (item.getItemId()==R.id.privacy) {
                    //======================= Privacy Policy ============
                    startActivity(new Intent(OpenActivity.this,Privacy_policy.class));
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return true;
            }
        });




    }
    //============== end onctreate method ===================================


    //========================================================================
    //================ CREATE MORE APPS MEHTOD ===============================

    private void MoreApps(){
        // code here
        String developerName ="Zihad Hossain";
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://search?q=pub:"+ developerName)));

        }catch (ActivityNotFoundException e){

            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id="+developerName)));
        }


    }


    //=============================================================================
    // ===========================CREATE SHARE APPS METHOD =========================
    private  void ShareApp(Context context){
        final String appPackageName= context.getPackageName();
        Intent myIntent= new Intent();
        myIntent.setAction(Intent.ACTION_SEND);
        myIntent.putExtra(Intent.EXTRA_TEXT,"Download Now : https://play.google.com/store/apps/details?id=" + appPackageName);
        myIntent.setType("text/plain");
        context.startActivity(myIntent);

    }
    //============================================================================
    //================= Rate us  Method============================================

    private void RateUs(){
        Uri uri= Uri.parse("https://play.google.com/store/apps/details?id="+ getApplicationContext().getPackageName());
        Intent RateIntent= new Intent(Intent.ACTION_VIEW,uri);

        try {
            startActivity(RateIntent);
        }catch ( Exception e){
            Toast.makeText(OpenActivity.this,"Unable to Open\n"+e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }


    //========================================================================
    //====================== START  onBackPress Method=========================


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        new AlertDialog.Builder(OpenActivity.this)
                .setTitle("Warning !")
                .setMessage("Do you really want to exit?")
                .setIcon(R.drawable.baseline_report_problem_24)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finishAndRemoveTask();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Toast.makeText(OpenActivity.this,"Cancled",Toast.LENGTH_LONG).show();
                    }
                })
                .show();
    }

    //==================================================================
    //==================END ON BACK PRESS ==============================
    //==================================================================
}