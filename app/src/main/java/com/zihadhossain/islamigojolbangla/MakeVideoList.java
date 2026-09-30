
package com.zihadhossain.islamigojolbangla;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();



		//==========================================================================
		//============================ ABU RAYHAN GOJOL ==========================
		//==========================================================================
		addVideoItem("7V86hGMarkE", "", "করুন সুরের হৃদয়স্পর্শী নতুন গজল ২০২০ | Prarthona | প্রার্থনা | Abu Rayhan Kalarab");
		addVideoItem("CQvOtzLK5B4", "", "হৃদয়স্পর্শী মরমী গজল | Musafir | মুসাফির | Abu Rayhan | New Islamic Song 2021");
		addVideoItem("UWdXkG766aQ", "", "সময়ের সেরা নতুন গজল | তুমি নাবী সুন্দর | Tumi Nabi Sundor | Abu Rayhan | Kalarab | New Gojol");
		addVideoItem("ViWAM7MfAg8", "", "কুরআন নিয়ে অসাধারণ একটি গজল । QURAN । قرآن । কুরআন । Abu Rayhan & Husain Adnan");
		addVideoItem("3N978LzX4Ow", "", "TASBIH By Abu Rayhan | Kalarab | 4K New Islamic Song 2022");
		addVideoItem("HhwUtivqOCI", "", "Qalbi Muhammad | নবী প্রেমের সেরা গজল | Bangla Gojol | Abu Rayhan Kalarab");
		addVideoItem("YTHx4mwJYqI", "", "ও আল্লাহ কালিমা নসীবে মোর দিয়ো | Bangla New Islamic Song 2021");
		addVideoItem("cAMQppiUR7Y", "", "আলোচিত নতুন নাশিদ | Antal Mawla | আনতাল মাওলা | Abu Rayhan | Kalarab | New Gojol 2022");
		addVideoItem("dY6FRStAPJE", "", "জানাযা নিয়ে হৃদয়স্পর্শী গজল । Janaza । জানাযা । Abu Rayhan Kalarab | Kalarab Gojol 2020");
		addVideoItem("atQxJYVRpvA", "", "নতুন ইসলামী সংগীত । Ami Chaina Bachte - Kalarab । Abu Rayhan And Mahfuzul Alam");
		addVideoItem("xObewCKUCnU", "", "New Islamic Song 2020 | Na Bola Kotha | না বলা কথা | Abu Rayhan | Heart Touching Song | Kalarab ");
		addVideoItem("Un0GpB8VQmA", "", "নতুন ইসলামী গজল | Sajda | সিজদা | By Abu Rayhan | kalarab | Tarana 2021");
		addVideoItem("IRILRcGlXS8", "", "হৃদয়স্পর্শী মরমি গজল । Poripati Prithibi chere zete hobe । Abu Rayhan । Tarana । New Islamic Song");
		addVideoItem("ZnLXftDJq70", "", "রমজানের নতুন গজল | Nekir Bahar By Abu Rayhan | Kalarab | Ramadan Song 2023");

		createPlayList("আবু রায়হান গজল ", R.drawable.rayhan);


		//=========================================================================
		//===========================SADMAN SAKIB GOJOL =================================
		//==========================================================================
		addVideoItem("Aj1wu1L5glA", "", " O Nodire By Sadman sakib || ও নদীরে || Vangli Amer Ghor || Iqra shilpigosthi new song");
		addVideoItem("b96V8m7FyIs", "", "Briddhashram by Sadman Sakib || বৃদ্ধাশ্রম || New bangla song 2020 || Iqra Shilpigosthi");
		addVideoItem("jpYEUZC_RVI", "", "আমার যত স্বপ্ন আশা | Sadman Sakib | Iqra Shilpigosthi");
		addVideoItem("KH0tbkSGmHw", "", "হৃদয়কাড়া নাতে রাসুল। Rasuler Rowja । রাসূলের রওজা। Sadman Sakib। New Islamic gojol 2022।");
		addVideoItem("8oi8sTGP6pI", "", "New Islamic Song 2021| Amantu Billahi By Sadman Sakib | Iqra Shilpigosthi");
		addVideoItem("0ALpMPl0t9s", "", "নতুন গজল ২০২০ || O Amar Malik || Sadman Sakib || iqra shilpigosthi || tune hut || ও আমার মালিক");
		addVideoItem("jkdBk8_wy1s", "", "হৃদয় শীতল করা গজল | ওগো মোর পেয়ারা নাবী | Ogo Mor Peyara Nabi | Sadman Sakib | Iqra Shilpigosthi");
		addVideoItem("HrYleYeY_8U", "", "মায়ের নতুন গজল 2020 || Ogo Maa || Sadman Sakib || Iqra Shilpigoshthi | ওগো মা || Tune Hut");
		addVideoItem("Yuvkr1k1pYc", "", "এক মিনিটের নাই ভরসা | Ek Miniter Nai Vorosa Gojol 2023 | Sadman Sakib | Sopne Bivor ");
		addVideoItem("LBD2TjA-YLE", "", "New Mother Song 2023 | Mayer Moto Apon Keho Nai | Sadman Sakib | Iqra Shilpigoshthi | Tune Hut");
		addVideoItem("AbsaC1Ph0Ug", "", "এই মিছে দুনিয়ায় তুমি থাকবা কতদিন | Ai Miche duniya | Iqra shilpigosthi | Sadman Sakib ");
		addVideoItem("2Rpw6EpCE5k", "", "কবর | Kobor | Bangla gojol | 4k | Sadman Sakib | Iqra Shilpigosthi | Tune Hut | New gojol 2022");
		addVideoItem("byYB5FBgZYo", "", "Tora Dekhe Ja Amina Mayer Kole || Sadman Sakib || Iqra Shilpigosthi ||তোরা দেখে যা আমিনা মায়ের কোলে");
		addVideoItem("KH0tbkSGmHw", "", "হৃদয়কাড়া নাতে রাসুল। Rasuler Rowja । রাসূলের রওজা। Sadman Sakib। New Islamic gojol 2022। Tune Hut ");
		addVideoItem("0j0Hvr8LjF8", "", "Chad Mukh | Top Bangla Gojol 2023 | Sadman Sakib | New Gojol | Tune Hut");
		createPlayList("সাদমান সাকিব গজল ", R.drawable.sadman);



		//=====================================================================
		//======================== MAHFUZUL ALAM GOJOL =========================
		//=====================================================================
		addVideoItem("A7sYguVMWHA", "", "নতুন ইসলামিক গজল ২০২১ | ক্লান্ত হৃদয় | Klanto Hridoy | Mahfuzul Alam | কলরব | Kalarab Gojol ২০২১");
		addVideoItem("pEH6b4Aw7J8", "", "নতুন ইসলামিক গজল ২০২০ | এক ফোটা রহমের | Kalarab Gojol | মাহফুজুল আলম ২০২০ | কলরব গজল");
		addVideoItem("BHUNDWO5NhI", "", "বাবাকে নিয়ে হৃদয়স্পর্শী গজল । Prio Baba । প্রিয় বাবা । Mahfuzul Alam । Baba Song 2020");
		addVideoItem("9ZOisQRYiA8", "", "আজাদের সেরা গজল । Podma Meghna । পদ্মা মেঘনা । Mahfuzul Alam । Azad Song 6");
		addVideoItem("95uqMWvTrk4", "", "নতুন ইসলামি গজল | কালেমা নসীবে মোর দিও | Kalima Nosibe Mor Dio | কলরব গজল | Holy Tune 2021");
		addVideoItem("6fxHP8fJ3Lc", "", "নতুন ইসলামীক গজল ২০২০ | পরের জায়গা পরের জমি | Porer jayga porer jomi | Kalarab Shilpigosthi 2020");
		addVideoItem("s5sObuWg6Es", "", "মাহফুজুল আলম (রহ.)এর কন্ঠে মরমী গজল । Miche Jibon । মিছে জীবন । Mahfuzul alam (RH) New Nasheed 2021");
		addVideoItem("qAPZkpbbQj8", "", "মরমী গজল || আপন কারে ভাবো তুমি || Bangla Gojol || Apon Kare Vabo Tumi || Mahfuzul Alam Kalarab");
		addVideoItem("FCaJ7S6Rbvk", "", "মনকাড়া নতুন গজল । Ei Prithibir Pranto Chuye । Mahfuzul Alam । Tawhidul Islam । Kalarab Song 2020");

		createPlayList("মাহফুজুল আলম গজল", R.drawable.mahfujul);


		//=====================================================================
		//======================== BADRUZZAMAN GOJOL =========================
		//=====================================================================

		addVideoItem("dG8DRBH5FGw", "", "নতুন গজল 2021 । Shedino Emon Kore । সেদিনও এমন করে । Hujaifa Islam । Muhammad Badruzzaman | Kalarab");
		addVideoItem("MorkVe8s5oA", "", "Valo Lage - চমৎকার নতুন গজল - ভালো লাগে | Muhammad Badruzzaman | Bangla Gojol");
		addVideoItem("QVNi8lsPZ-A", "", "হৃদয় ছুঁয়ে যাওয়া নতুন ইসলামিক গজল । Jikrullah । Muhammad Badruzzaman । Bangla Islamic Song 2019");
		addVideoItem("V_WVTmfoFR4", "", "নতুন গজল l Munajat - মুনাজাত l Muhammad Badruzzaman | Kalarab | Official Gojol Video 2019");
		addVideoItem("2mux0Hqu5T4", "", "হৃদয় ছোঁয়া নতুন গজল । Khujigo Tomay । খুঁজিগো তোমায় । Muhammad Badruzzaman । Islamic Gojol");
		addVideoItem("gF3G_ogGUhM", "", "হৃদয়স্পর্শী বাছাইকৃত গজল। Bangla Selected Gojol। Muhammad Badruzzaman। Best Islamic Song");
		addVideoItem("dVabS5VtDaU", "", "বিরহের গজল | Kichu Rat Ache | কিছু রাত আছে | Muhammad Badruzzaman");
		addVideoItem("_iYGC4sTShs", "", "ইতিহাস সৃষ্টিকারী গজল । Oli Allahor Bangladesh । ওলি আল্লাহর বাংলাদেশ । Kalarab Shilpigosthi");
		addVideoItem("VSbirn3AQjc", "", "Bangla Gojol | মইরা গেলে ফিইরা আসেনা | Moira Gele Fira Asena | Misa Sawdagar | Muhammad Badruzzaman");
		addVideoItem("Ki_7wiGUlRw", "", "Priyotoma Wife | Muhammad Badruzzaman | Bangla Islamic Song 2017");
		addVideoItem("srU9CCeGtwU", "", "টাকা নিয়ে ফাটাফাটি গজল | Ajob Taka | আজব টাকা | Muhammad Badruzzaman | Kalarab | Bangla Song 2021");

		createPlayList("বদরুজ্জামান গজল", R.drawable.badruzzaman);

		//=====================================================================
		//======================== HUJAIFA ISLAM GOJOL =========================
		//=====================================================================
		addVideoItem("MgorLU6b6sI", "", "হৃদয়স্পর্শী বাছাইকৃত গজল । Hujaifa Islam । Best Selected Islamic Song");
		addVideoItem("LhXjfdDzFIQ", "", "যাদুকরী কণ্ঠে হৃদয়স্পর্শী গজল । Amaro Chilo Sob Ekadin । Hujaifa Islam Kalarab ।Heart Touching Song");
		addVideoItem("TG3Ux2elYg8", "", "চমৎকার ইসলামী সংগীত । Oi Dur Simanay । ঐ দূর সীমানায় । Hujaifa Islam । Bangla Islamic Song");
		addVideoItem("c4-vMStPQhM", "", "হৃদয় তোলপাড় করা মরমি গজল । Miche Jibon । মিছে জীবন । Hujaifa Islam Kalarab");
		addVideoItem("8wD-iSe25CU", "", "কোকিল কণ্ঠে হুজাইফার গজল । Bare Bare Vabi Eka । বারে বারে ভাবি একা । Hujaifa Islam");
		addVideoItem("e8nuX0JChio", "", "জাদুকরী কণ্ঠে নতুন গজল । Shono Musolman । শোন মুসলমান । Hujaifa Islam । কলরব | Bangla Gojol 2022");
		addVideoItem("lnhcAb3mmZc", "", "তাক লাগানো গজল । Ami Khudro Tai । আমি ক্ষুদ্র তাই । Hujaifa Islam Kalarab");
		addVideoItem("U_uf_LAwEmQ", "", "সুরের পাখি হুজাইফার নতুন গজল। Moner Majhe Dheu Utheche। মনের মাঝে ঢেউ উঠেছে। Hujaifa Islam। Gojol");
		addVideoItem("TYDRQ-JxBgE", "", "মায়াবী সুরে মায়ের নতুন গজল । Vulte Parina Ma । Hujaifa Islam । Ma Song");

		createPlayList("হুযাইফা ইসলাম গজল", R.drawable.hujaifa);



		//============================================================
		//====================  SAYED AHMED GOJOL ==========================
		//============================================================
		addVideoItem("8DnoQnyQm4U", "", "প্রিয় নবীর অবমাননার প্রতিবাদে জ্বালাময়ী গজল ।Nobijir Dushmon । Sayed Ahmad Kalarab");
		addVideoItem("J8xh_s9EDzM", "", "সময়ের সেরা প্রতিবাদী গজল | ওরা শিক্ষিত শয়তান | Sayed Ahmad Kalarab | Bangla New Song 2022 ");
		addVideoItem("LyLtZWVzlxw", "", "সাঈদ আহমাদের নতুন গজল | মানুষ মানুষের জন্য । Manush Manusher Jonno | Sayed Ahmad 2023");
		addVideoItem("LcXsJORM2Oc", "", "সাঈদ আহমাদের বাস্তবমুখী পরিবেশনা | Tumi Ki Parbe | তুমি কী পারবে ? | Sayed Ahmad | Kalarab 2023");
		addVideoItem("TUNgt5P0Bac", "", "দিল নরম করা গজল | Shukriya Ogo Allah | শুকরিয়া ওগো আল্লাহ তোমার | Sayed Ahmad Kalarab | New Song");
		addVideoItem("aaRZ5hWvp90", "", "Heart Touching Beautiful Naat Sharif 2021 । Shehar E Madina । Sayed Ahmad Kalarab");
		addVideoItem("USIZ1-YCauA", "", "সময়ের সেরা ঈমান জাগানিয়া গজল । Tumi Kemon Musolman । তুমি কেমন মুসলমান । Sayed Ahmad Kalarab ");
		addVideoItem("OUub8-7cqYI", "", "পর্দা নিয়ে সময়ের সেরা গজল । Porda Narir Ruper Vushon । Sayed Ahmad Kalarab । Muhammad Badruzzaman");
		addVideoItem("VSiIcLF_rTQ", "", "ফেইসবুক নিয়ে সময়ের সেরা গজল । Facebook । Sayed Ahmad Kalarab । সমসাময়িক সংগীত 2020");
		addVideoItem("FWoAAPGIUMU", "", "Naat Shareef । Salli Ala Kaho । Sayed Ahmad Kalarab । Holy Tune । Urdu Gojol");
		addVideoItem("nMUV41lmiio", "", "সময়ের সেরা জাগরণী সংগীত । Muktir Songram । মুক্তির সংগ্রাম । Sayed Ahmad । Badruzzaman Kalarab ");
		addVideoItem(" kGlTwqMmFgI", "", "হৃদয় ছুঁয়ে যাওয়া নতুন গজল। Dile Jar Premer Abad। দিলে যার প্রেমের আবাদ। Sayed Ahmad Kalarab।Gojol ");
		addVideoItem("J8xh_s9EDzM", "", "সময়ের সেরা প্রতিবাদী গজল | ওরা শিক্ষিত শয়তান | Sayed Ahmad Kalarab | Bangla New Song 2022");
		addVideoItem("CVt2IzznouI", "", "2024 এটাই সেরা গজল | Sayed Ahmad Kalarab | Kalarab Gojol | Islamic Song | Kolorob Ghazal | Bangla");

		createPlayList("সাঈদ আহমেদ গজল", R.drawable.sayed_ahmed);






		//==========================================================================
		//============================ ABU UBAYDA  =========================
		//==========================================================================
		addVideoItem("w33GxwqbnyU", "", "The Most Beautiful Nasheed | Humne Ankhoon Se | Abu ubayda");
		addVideoItem("3RgnHxdunzA", "", "Jodi Naat Likhte Likhte | যদি নাত লিখতে লিখতে | Abu Ubayda");
		addVideoItem("FiHbFdWMtHc", "", "Matir Deho | Abu Ubayda | মাটির দেহ | আবু উবায়দা");
		addVideoItem("Cqj7szSOTC0", "", "লোকে আমায় পাগল বলে | Loke Amay Pagol Bole | Abu ubayda");
		addVideoItem("g1HK6NdE7Js", "", "লুকোনো ফুল | LUKONO FUL | Abu ubayda | Official Video");
		addVideoItem("vJSOpRAqZGs", "", "হে রাসুল বুঝি না আমি I আবু উবায়দা I He Rasul Bujhina Ami | Abu Ubayda");
		addVideoItem("9AdS_BXEcY4", "", "তুমি চাঁদের আলোর চেয়ে বেশি আলো | Tumi Chader Alor Chye | Abu Ubayda | ইয়া রাসুল ইয়া হাবিবাল্লাহ।");
		addVideoItem("2nm-1O4fAQw", "", "মায়ের মত হয় না | Mayer Moto Hoyna | Abu Ubayda");
		addVideoItem("k9abCTN9Dqk", "", "Hoyechi Nikhoj | হয়েছি নিখোঁজ | আবু উবায়দা | Ubayda production");
		addVideoItem("Uj3WpwiUHHM", "", "কতদূর ঐ মদীনার পথ I আবু উবায়দা I Koto Dur Oi Modinar Poth | Abu Ubayda I Taaqwaa");
		addVideoItem("b_aQtNWdqK8", "", "নবী প্রেমের সেরা গজল | Marhaba | মারহাবা | Abu ubayda");
		addVideoItem("Wri_fzOvSX4", "", "shada kafon | abu ubayda| সাদা কাফন | আবু উবায়দা | মন ভরে যাবে যে গানে");
		addVideoItem("nsdN0cNQwmc", "", "Mon Amar Deho Ghori | মন আমার দেহ ঘড়ি | Abu Ubayda");

		createPlayList(" আবু উবায়দা গজল ", R.drawable.ubayda);



		//=========================================================================
		//======================== BABY NAJNIN GOJOL================================
		//=========================================================================
		addVideoItem("QvtA4z9yzqM", "", "কুরআন মধুর বানী গজল | Quran Modhur Bani | গজলটি শুনলে হৃদয় ছুঁয়ে যাবে | Baby Najnin | New Gojol 2022");
		addVideoItem("uBqt73ancqQ", "", "হৃদয় ছুঁয়ে যাওয়া একটি গজল | Baby Najnin | হৃদয়ের রজনীগন্ধা | Hridoyer Rajanigandha | New Gojol");
		addVideoItem("mGqmmoa8zU8", "", "আজ আছি কাল যদি না থাকি | Baby Najnin | Aj Achi Kal Jodi Na Thaki | New Ghazal 2022 ");
		addVideoItem("0w5lb7mZWHQ", "", "দাজ্জাল আসিবে এবার | Baby Najnin | Dajjal Asibe Ebar | New Gojol 2022 | নিউ গজল");
		addVideoItem("SJbJfkzwjOk", "", "Baby Najnin - Mayar A Prithibi - মায়ার এ পৃথিবী - Official Video 2020");
		addVideoItem("Gnid1dYi0CM", "", "নতুন বছরের সেরা গজল | Baby Najnin | Madinate Jai | মদিনাতে যাই | New Gojol 2024");
		addVideoItem("titS7BPqxdk", "", "এ বছরের শেষ গজল | Baby Najnin | লা-ইলাহা ইল্লাল্লাহ | La ilaha illallah | New Gojol 2024");
		addVideoItem("493nmAsYtHQ", "", "সময়ের সেরা জাগরনী গজল | Baby Najnin | Eso Imam Mahdi | এসো ইমাম মাহদী | Stand With Palestine | Gojol");
		addVideoItem("XomjuQ4PWuM", "", "হার মোমিনের জান নবী কামলিওয়ালা রে | Baby Najnin | Amar Antor Jure Royeche Vore | New Gojol 2023");
		addVideoItem("3UjfCb86WBE", "", "মনমুগ্ধকর একটি গজল | Baby Najnin | Duniya Ta Sundor | New Gojol 2023");
		addVideoItem("vjrezBVMqcw", "", "মা-বাবাকে নিয়ে চমৎকার একটি গজল | Baby Najnin | Maa O Baba | Official Video | গজল | New Gojol");
		addVideoItem("EfgNVwjJQdM", "", "বেবী নাজনীনের কন্ঠে চমৎকার একটি গজল | Amar Dil Baguchar Ful | আমার দিল বাগিচার ফুল | New Gojol 2022");

		createPlayList("বেবি নাজনীন গজল", R.drawable.baby_najnin);

		//========================================================================
		//========================== QARI ABU RAYHAN =============================
		//========================================================================

		addVideoItem("pd0nogrj-38", "", "হৃদয় ছুঁয়ে যাওয়া নতুন গজল । Eto Bhalobaso Keno Malik । Qari Abu Rayhan । Bangla Islamic Song 2022");
		addVideoItem("HGOrEjP9ZY4", "", "হৃদয় ছোঁয়া মরমি গজল । Ekdin Pranpakhi Ural Dibe । Qari Abu Rayhan | Holy Tune | Bangla Gojol 2020");
		addVideoItem("nvY4v8m4gGI", "", "যদি নাত লিখতে লিখতে || Jodi Naat Likhte Likhte || Qari Abu Rayhan New Song ২০২৩ ");
		addVideoItem("eNjs0ugk50M", "", "হৃদয় ছোঁয়া নতুন ইসলামি গজল। Biday। বিদায়। Qari Abu Rayhan। Islami Gojol। Holy Tune 2023");
		addVideoItem("GNVshEOIaco", "", "ক্বারী আবু রায়হানের কন্ঠে নতুন গজল ২০২৩ || দেখা দাও রাসুলাল্লাহ || Dekha Dao Rasulallah || 4k ");
		addVideoItem("cwASfUe9dGo", "", "Zameen Meli Nahi Hoti Zaman Mela Nahi Hota। Qari Abu Rayhan। Heart Touching Naat 2022");
		addVideoItem("yVgcOG9ldb4", "", "হৃদয় স্পর্শ করার মত গজল । Ei Jibone Kichui Chawar Neito Ar । এই জীবনে কিছুই চাওয়ার নেইতো আর");
		addVideoItem("AQMvvj5BIcg", "", "মায়ের গজল শুনে হৃদয় ভাঙ্গা কান্না । মা ছাড়া দুনিয়ায় । ক্বারী আবু রায়হান। Abu Rayhan new gojol 2023");
		addVideoItem("Fx3zA38Wteo", "", "কারী আবু রায়হানের নতুন গজল 2023 || ত্রিভুবনের প্রিয় মুহাম্মদ || New Islamic song || Trivuboner 4K");
		addVideoItem("hSzbldhSobA", "", "হৃদয়কে শান্ত করা নতুন গজল 2023 || আল্লাহু আল্লাহু || Allahu Allahu || by Qari Abu Rayhan");
		addVideoItem("bRyOw66koHg", "", "কোরআনের সাথে রেখো | কারী আবু রায়হানের নতুন গজল 2023 || Qari Abu Rayhan New Song");
		addVideoItem("KBo8UD-XK4Q", "", "হৃদয়স্পর্শী নাতে রাসুল । Biday Bela । বিদায় বেলা । Qari Abu Rayhan");
		addVideoItem("GK2ippphNnM", "", "হৃদয়স্পর্শী মরমি গজল | Hariye Jabo Ekdin | হারিয়ে যাবো একদিন | Qari Abu Rayhan");

		createPlayList("ক্বারী আবু রায়হান গজল", R.drawable.qari_rayhan);



		//==========================================================================
		//===================== TAWHID JAMIL GOJOL  ================================
		//==========================================================================

		addVideoItem("HsEIKQ5nbuI", "", "kdin Matir Vitore Hobe Ghor । একদিন মাটির ভিতরে হবে ঘর । Tawhid Jamil । Gojol 2023 । Kalarab । গজল");
		addVideoItem("cpwpSvD3fF4", "", "হৃদয় ছোঁয়া গজল । Allahu । আল্লাহু । Tawhid Jamil । Holy Tune । Kalarab । Islamic Song 2022");
		addVideoItem("DWYGW12jvMA", "", "মরমি ইসলামিক গজল । Bhober Khela । ভবের খেলা । Kalarab | Holy Tune");
		addVideoItem("0pBxPZlUsok", "", "নতুন ইসলামিক গজল । Ei Gan Ei Sur Tomari । এই গান এই সুর তোমারি । Tawhid Jamil । Kalarab । Holy Tune ");
		addVideoItem("cNMyUl0xwEI", "", "নতুন গজল 2023 । Tomake Daki Jodi Ekbar । তোমাকে ডাকি যদি একবার । Tawhid Jamil । New Gojol");
		addVideoItem("vQL2DXMAdJM", "", "সময়ের সেরা ইসলামিক গজল । Shopno Amar । স্বপ্ন আমার । Mahfuzul Alam । Tawhid Jamil । Holy Tune");
		addVideoItem("HVL4LC07f2k", "", "মনমাতানো ইসলামিক গজল । Hridoyer Patay Tomari Chobi । Tawhid Jamil । Salman Sadi । Bangla Gojol 2020");
		addVideoItem("jhLEj7_Y6hQ", "", "হৃদয় ছোঁয়া নাতে রাসুল । Diba Nishi Tomay Vebe Hoyechi Bekul । Tawhid Jamil ।Kalarab New Islamic Song");
		addVideoItem("Ly2VwYc2D6s", "", "নতুন ইসলামিক গজল । Shudhui Tumi । Tawhid Jamil । Islamic Song 2020");
		addVideoItem("osNFo8IrWv4", "", "হৃদয় ছোঁয়া নাতে রাসুল 2023। Amar Moner Kabay। আমার মনের কাবায়। Tawhid Jamil। Gojol 2023 ");
		addVideoItem("iFDhWXSW7ig", "", "নতুন ইসলামী সংগীত । Imla Qalbi । ইমলা কলবি । Tawhid Jamil । Kalarab । Holy Tune। Bangla Islamic Song");
		addVideoItem("BLG-DuNFlkU", "", "হৃদয় ছুঁয়ে যাওয়া নতুন গজল | Nabijir Madina | নবিজির মদিনা | Tawhid Jamil, Kalarab Gojol 2024");
		addVideoItem("e2bDArWMDSk", "", "হৃদয় ছোঁয়া নতুন গজল। Nabir Deshe। নবীর দেশে জন্ম কেন হলনা আমার। Tawhid Jamil। Bangla Gojol 2023");
		addVideoItem("utbr_bTaTks", "", "হৃদয় ছোঁয়া নাতে রাসুল । Jodi Chotto Ekta Pakhi Hoitam । যদি ছোট্ট একটা পাখি হইতাম । Tawhid Jamil");
		addVideoItem("8nlzS5fq8Y4", "", "হৃদয়স্পর্শী মরমি গজল । Ekdin Hobe Lash । একদিন হবে লাশ । Tawhid Jamil । Kalarab Bangla Gojol 2021");
		createPlayList("তাওহিদ জামিল গজল", R.drawable.tawhid);


		//======================================================================
		//====================== GAZI ANAS GOJOL      ==========================
		//======================================================================

		addVideoItem("DMLCypUFXKU", "", "সম্পূর্ণ আয়াত নির্ভর শ্রেষ্ঠ হামদ | সম্মান | Somman | Respect | Gazi Anas Rawshan | Heaven Tune |");
		addVideoItem("q_-wSKCtJn0", "", "BILASHI JIBON | বিলাসী জীবন | Gazi Anas Rawshan | Heaven Tune | Exclusive Nasheed");
		addVideoItem("-MpjcGbf7z8", "", "একদিন তোমারী নাম মসজিদে হবে এলান | Ekdin tumari name masjide hobe elan ᴴᴰ | Gazi Anas | মরমী গজল ");
		addVideoItem("NRJ9ItV4wEo", "", "সেরা মরমী গজল | মরিলে কান্দিসনা | Morile Kandisna | Gazi Anas Rawshan | Mahmud Faysal | Islamic Song");
		addVideoItem("VrmckdLfmKQ", "", "শুকরিয়া মেহেরবান | Shukria Meherban | Gazi Anas Rawshan | Heaven Tune Official Video | Islamic Song");
		addVideoItem("hV2voKK3NJw", "", "শীতার্ত মানুষের কষ্টের গান | পথের ধারে | Pother Dhare | Gazi Anas Rawshan | Heaven Tune Foundation");
		addVideoItem("f6htMa90_Zk", "", "নতুন ইসলামিক গজল 2020 | কোন মহামারীকে আর ভয় করি না | Voy | Gazi Anas Rawshan | Bangla Islamic Song");
		addVideoItem("XkN7L_dSbec", "", "রাজকন্যা আকসা | Rajkonna By Gazi Anas Rawshan | The Princess | Best song for all daughter");
		addVideoItem("TSNhKFmSBd4", "", "Best Duff Nasheed Of Gazi Anas | Madinawala | মাদিনা ওয়ালা | Qawwali | SM Moin | Heaven Tune ");
		addVideoItem("BcEbhKRY41I", "", "নতুন ইসলামিক গজল ২০২০ | Tala Al Badru Alayna | طلع البدر علينا | Gazi Anas | Popular Arabic Song");
		addVideoItem("WFBmP0XFe-Y", "", "দে দে পাল তুলে দে | De De Pal Tule De | Gazi Anas Rawshan Exclusive | Heaven Tune");
		addVideoItem("5J-4G0_0gpc", "", "হৃদয়স্পর্শী মরমী গজল | মৃত্যুর হাতছানি | Mrittur Hatchani | Gazi Anas Rawshan | New Islamic Gojol ");
		addVideoItem("trpDh5ojV5Q", "", "হামদে বারী তায়ালা | আল্লাহ মহান | Allah Mohan | Gazi Anas Rawshan | Kutub uddin | ইসলামিক গজল |");
		createPlayList("গাজী আনাস রওশান গজল", R.drawable.gazianas);




		//============================================================
		//=================== MUHIB KHAN GOJOL==============================
		//============================================================
		addVideoItem("V1yUVk4zkPs", "", "জঙ্গি । মুহিব খান । jongi । Muhib khan । i am muslim");
		addVideoItem("s21NZ19thvw", "", "কালজয়ী দেশাত্মবোধক গান | Eta Bangladesh | Muhib Khan | Holy FM");
		addVideoItem("kqCdt3JvYn0", "", "সময়ের সেরা জ্বালাময়ী গজল। Sajao Tomar Desh। সাজাও তোমার দেশ। Muhib Khan। Kalarab Shilpigosthi");
		addVideoItem("v29Tas1NEGc", "", "ডাকছে ফিলিস্তিন । Dakche Filistin । Muhib Khan । New Song 2023");
		addVideoItem("YpX5CIrShOE", "", "কেন - ৩ | Keno - 3 | মুহিব খান | Muhib Khan | New Bangla Song 2023");
		addVideoItem("NkDaXRh5PNY", "", "এদেশে আল্লাহু আকবারের সুরে । E Deshe Allahu Akbarer Sure । Muhib Khan । Bangla Islamic Song ");
		addVideoItem("WZ_Epffakx8", "", "এক হও । Ek Hou । Muhib Khan । 2020 । Holy Media");
		addVideoItem("G0SUhQS0UWM", "", "জাগরণী ইসলামী সংগীত | Islam Thakbei | ইসলাম থাকবেই | Muhib Khan | Holy FM");
		addVideoItem("W3-477nhU98", "", "Islam thakbei | Muhib Khan | ইসলাম থাকবেই | মুহিব খান | With Lyrics |");
		addVideoItem("2_QT6eDahUY", "", "গজল তো নয় যেনো গোলাবারুদ ২০২৩ | Muhib Khan Gojol | Muhib khan | Gojol | Ghazal | Islamic Song 2023");
		addVideoItem("sQxVN0gY_VU", "", "উঠবে নতুন ঝড় | Uthbe Notun Jhor | Muhibe Khan | Holy Media");
		addVideoItem("P2vvn0QiLmo", "", "মুহিব খানের নতুন গজল ২০২৩। Muhib khan New Gojol 2023 | Bangla New Islamic song 2023। Nashid FM");

		createPlayList(" মুহিব খান গজল", R.drawable.muhib_khan);




		//=================================================================
		//=========================MUNAYEM BILLAH =========================
		//=================================================================
		addVideoItem("k3GcOuxM0Oo", "", " Meherban Liveᴴᴰ by Munaem Billah | Alokito Geani 2019| Live 2019");
		addVideoItem("r39RqoAAsLM", "", "যে গান শুনে কেঁদেছিল মঞ্চের সবাই জনপ্রিয় নাশিদ মালিক | MALIK | MUNAEM BILLAH | new islamic song 2021 ");
		addVideoItem("wmt--PlisSY", "", "Radhitu Billah ᴴᴰ by Munaem Billah | Official Full Video | New Bangla Islamic Song 2018");
		addVideoItem("SYg6CIcdoF8", "", "জিকির - ZIKIR | Official Video | MUNAEM BILLAH |4k | 2022 |");
		addVideoItem("ChDyktmkXxM", "", "মুনায়েম বিল্লাহ এর কন্ঠে | আরশের ঠিকানায় | AROSHER THIKANAY | MUNAEM BILLAH | NASHEED STAR 2023");
		addVideoItem("FsQUcxwUPrY", "", "FsQUcxwUPrY  FULLTITTLE  সুবহানাল্লাহ - SUBHANALLAH - سبحان الله | Official Video | MUNAEM BILLAH | 4k | 2022 |");
		addVideoItem("QeEG3tGGVQI", "", "হৃদয় জুড়ে তুমি | HRIDOY JURE TUMI | Official Video | MUNAEM BILLAH | 4k | 2022 |");
		addVideoItem("YSJ6O-1YcJY", "", "আলোচিত নাশিদ KALIMAH by Munaem Billah || কালিমা || 4k Video | New Bangla Islamic Song 2021");
		addVideoItem("X6CuirQwEBw", "", "SUN of LIGHTᴴᴰ | BALAGAL ULA BE KAMALIHI | Munaem Billah | Official Video | New Song 2017");
		addVideoItem("zFkR9LvN3gk", "", "অনুতাপের নাশিদ মালিক || MALIK ᴴᴰ By Munaem Billah | Official Full Video | 4k | 2020");
		addVideoItem("MXDIAS9BFPk", "", "রমাদান স্পেশাল নাশিদ | ইয়্যা-কা না’বুদু | إِيَّاكَ نَعْبُدُ | Official Video | MUNAEM BILLAH | 2023");

		createPlayList(" মুনায়েম বিল্লাহ গজল", R.drawable.munaem);






		//=====================================================================
		//======================== HUSSAIN ADNAN  ======================================
		//=====================================================================
		addVideoItem("2XvMf_7cPb0", "", "নতুন ইসলামী গজল |Tumi Rahoman | তুমি রহমান | By | Husain Adnan & Shafin Ahmad | Kalarab|Tarana 2021");
		addVideoItem("Q_K3pS-Eslg", "", "আলোচিত নতুন ইসলামী সেরা গজল | Ya Gafur | ইয়া গফুর | By | Husain Adnan | Kalarab Shilpigoshthi 2021");
		addVideoItem("dPrh3mcQM3w", "", "সময়ের সেরা আল্লাহ প্রেমের গজল | Shukor Gujar | শুকর গুজার । হুসাইন আদনান | Hossain Adnan Kalarab ");
		addVideoItem("SDGd974u4fY", "", "Mere Qismat Jagane Ko Khuda Ka Nam Kafi He | হুসাইন আদনান | Hossain Adnan Kalarab");
		addVideoItem("-qW-WZkY10Y", "", "সময়ের সেরা ইসলামিক গজল | Didar | দিদার | Husain Adnan | Kalarab Shilpigoshthi 2021");
		addVideoItem("pkF_gzVaBjI", "", "পৃথিবীর জান্নাতে দারুণ সুরের গজল | Allahu Akbar | আল্লাহু আকবার | Hossain Adnan Kalarab");
		addVideoItem("WszeFIQZF2Q", "", "সময়ের সেরা আকর্ষণীয় গজল | Tasbih | তাসবীহ | Husain Adnan Kalarab | New Islamic Song 2023");
		addVideoItem("Ly5hi1edAak", "", "নবী প্রেমের পাগল করা গজল | | din rat kadi sudhu।দিন রাত কাঁদি শুধু নবীকে পেতে Hossain Adnan Kalarab");
		addVideoItem("8izWsNEL4I0", "", "আল্লামা সাঈদী গজল | Emon Jibon | এমন জীবন | Hossain Adnan Kalarab");
		addVideoItem("GDU7P8SvSM8", "", "নতুন আলোচিত ইসলামি নাশীদ | Hasbi Rabbi|হাসবি রাব্বি | Husain Adnan & Shehzaad | Kalarab | 2021");
		addVideoItem("EKYD41xc7VI", "", "সাহাবাদের নিয়ে নতুন গজল | Sahaba | সাহাবা | By Husain Adnan & Others | kalarab | Tarana 2021");
		createPlayList("হুসাইন আদনান গজল", R.drawable.hossain_adnan);


		//=====================================================================
		//======================== IQBAL MAHMUD GOJOL ==========================
		//=====================================================================
		addVideoItem("hhw-UaV1Na0", "", "Iqbal HJ - Valobasa Vocal - LOVE for Allah || আল্লাহর জন্যে ভালোবাসা ");
		addVideoItem("sl-frM5sOm8", "", "ইকবাল মাহমুদের ভাইরাল মায়ের গজল | Iqbal Mahmud Song | Ma Song | New Ma Gojol | Imotional Ma Song ");
		addVideoItem("zfAplrmlZTc", "", "ইকবাল মাহমুদের নতুন গজল । Khoma Kore Dao । Iqbal Mahmud Kalarab");
		addVideoItem("sochBVha9w8", "", "একটি সুন্দর মজার গজল। Namer Bahar। নামের বাহার। Iqbal Mahmud। Kalarab");
		addVideoItem("7aIllBDok8Q", "", "ইকবাল মাহমুদের যে মায়ের গজলে কান্না চলে আসে | Je Ma Amay | যে মা আমায় | Iqbal Mahmud New Maa Song");
		addVideoItem("3yL1nsKWf8I", "", "যদি জীবনটা বিলাতে চাও IQBAL MAHMUD | AYNUDDIN AL AZAD RH. | Kalarab Shilpigosthi | New Islamic Song");
		addVideoItem("WBmtO-cQ0uE", "", "সন্ধ্যার তারাগুলো | Iqbal Mahmud | Aynuddin Al Azad | Kalarab | Bangla Beautiful Islamic Song");
		addVideoItem("uGcCAbB5H6g", "", "Priyotoma Jannat 4 | Iqbal Mahmud | Dedicated To My Wife | New Wedding Song 2021 | Wife Song | Gojol");
		addVideoItem("WclkTckShkE", "", "বেদনাভরা মায়ের গজল | Iqbal Mahmud | New Bangla Ma Song | Bangla New Gojol 2021 | Bangla Islamic Song");
		addVideoItem("WwRzrFaAzEQ", "", "বিরহের গান | আজকে মরলে কালকে দুই দিন | Ajke Morle Kalke Dui Din | Iqbal Mahmud Kalarab | i FILM ");

		createPlayList("ইকবাল মাহমুদ গজল", R.drawable.iqbal_mahmud);

		//=====================================================================
		//======================== AKSA BINTE AKASH  =========================
		//=====================================================================
		addVideoItem("rp1hqa9Lp3Y", "", "ফিলিস্তিন নিয়ে সময়ের সেরা গজল | পুড়ছে ফিলিস্তিন | Purche Filistine By Aqsa Binte Anas");
		addVideoItem("WGYCxmVb4hc", "", "Ya Muhammad ﷺ Noore Mujassam | Aqsa Binte Anas | Urdu Nasheed");
		addVideoItem("3eaoF28XGFs", "", "সালাত | Salat| Child Islamic Song | আম্মু তোমার থাকলে সালাত | Aqsa Binte Anas | Heaven Tune");
		addVideoItem("YNBjBID7mtM", "", "কার ইশারায় | Kar Isharay - Official Video | @Aqsa BInte Anas Exclusive");
		addVideoItem("dibY11ARfhU", "", "Tu Kitni Acchi Hai | Ma | Aqsa Binte Anas | तू कितनी अच्छी है");
		addVideoItem("BM6Fa71VLBk", "", "আমি বাংলায় গান গাই | Ami Banglar Gaan Gai | Gazi Aksa Binte Anas | Gazi Anas Rawshan | Desh Song");
		addVideoItem("OBu9UvDqlH4", "", "Muhammad Nabina (محمد نبينا) full Naat | Aqsa Binte Anas | Heaven Tune |");
		addVideoItem("oadwx-utfas", "", "বর্তমান প্রেক্ষাপট নিয়ে প্রতিবাদী গজল | পুড়ছে বেনাপোল | Purche Benapole | Aqsa Binte Anas | Gojol");
		addVideoItem("uMJDYVtItng", "", "Allah Hi Allah Kiya Karo || Hamd || Aqsa Binte Anas & Shayla Binte Bashar");
		addVideoItem("Dv5IM6UrqSE", "", "Aqsa Exclusive | মন ভালো নেই | Mon Valo Nei | Aqsa Binte Anas | Heaven Tune Nasheed Band");
		createPlayList("আকসা বিনতে আকাশ গজল", R.drawable.aksa_binte);

		//=====================================================================
		//======================== AHMOD ABDULLAH GOJOL =========================
		//=====================================================================
		addVideoItem("wDieOi_HCBg", "", "Tamanna | তামান্না। Ahmod Abdullah | পল্লী বাংলার কালজয়ী নাশিদ");
		addVideoItem("7dQm6HM38_E", "", "Khalis Neeyat | Ahmod Abdullah | খালিস নিয়ত | আহমদ আবদুল্লাহ");
		addVideoItem("rF7HHBMn4Ww", "", "কাবা প্রেমের হৃদয়ছোঁয়া গজল ‘আমার কাবা’ | আহমদ আবদুল্লাহ | Ahmod Abdullah | Lyric Video");
		addVideoItem("N4RrWoC9tLs", "", "Zoban। Ahmod Abdullah। যবান। আহমদ আব্দুল্লাহ");
		addVideoItem("-CRJ4tDsjug", "", "আহমদ আব্দুল্লাহর নতুন গজল । Hridoyer Kham । হৃদয়ের খাম । Ahmod Abdullah Kalarab Song");
		addVideoItem("hIVTVDqzR4I", "", "Tarana Ban gaya | Ahmod Abdullah x Masum Billah");
		addVideoItem("RkVz2CJPxhM", "", "চেনা সুরের নতুন গজল । দয়ার সীমা নাই । Ahmod Abdullah । Doyar Sima Nai । New Nasheed 2024");
		addVideoItem("VsJqNtwQhtI", "", "সমাজের বাস্তবতা নিয়ে সংগীত I Afsos I আফসোস I Ahmod Abdullah");
		addVideoItem("at2Z_Zi4ZBg", "", "জীবনের গান | আশার গান | একদিন সব ঠিক হবে | আহমদ আবদুল্লাহ | Ahmod Abdullah");
		addVideoItem("_EEhCJW2N_4", "", "ঈমান জাগানিয়া নতুন গজল । Hayre Imanwala । হায়রে ঈমানওয়ালা । Ahmod Abdullah । Kalarab । Holy Tune");
		addVideoItem("sU0VvLEzMMI", "", "বারবার শোনার মতো গজল । Kalimar Nay । কালিমার নায় । Ahmod Abdullah");
		createPlayList("আহমদ আবদুল্লাহ গজল", R.drawable.ahmod_abdullah);



		//=====================================================================
		//======================== JAIMA NUR GOJOL ==================
		//=====================================================================

		addVideoItem("3wbgQcZo7mE", "", "আমার একটা মন ছিল । জাইমা নূর । Amar Ekta Mon Chilo । Jaima Noor । Vocal Only । Jaima Noor New Song");
		addVideoItem("Y6eoXyq2qZ0", "", "তারাগুলো আজ যেন নিভে গেছে সব । জাইমা নূর । Taragulo Aj Jeno । Jaima Noor । Jaima Noor New Song 2022");
		addVideoItem("_HHa7asQJIQ", "", "মাহে রমজানের গান : রহমের বৃষ্টি | জাইমা নূর");
		addVideoItem("XgeNW9tqlR4", "", "জাইমা নূরের লাইভে গাওয়া শেষ গান । সময়ের ঝরা পাতা । জাইমা নূর । Somoyer Jhora Pata । Jaima Noor");
		addVideoItem("57mQxYdK2Es", "", "জাইমা নূর গাইলো কবি মল্লিকের কালজয়ী গান । ঈমানের দাবী যদি । জাইমা নূর । Imaner Dabi । Jaima Noor");
		addVideoItem("a7X8cMKOtig", "", "মতিউর রহমান মল্লিকের জনপ্রিয় নাশীদ আশাহত হয়ো নাকো তুমি | Ashahoto Hoyo Nako Tumi | Jaima Noor");
		addVideoItem("O5hfE2Debro", "", "জাইমা নূরের বিদায়ী গান | তোমাদের মাঝে আর গাইবো না গান | Tomader Majhe Ar Gaibo Na Gaan | Jaima Noor");
		addVideoItem("8dADjhuGUBQ", "", "জাইমা নূরের কন্ঠে কালজয়ী নাত । আকাশ হতে চাঁদ নেমেছে । জাইমা নূর । Akash Hote Chad Nemeche। JaimaNoor");
		addVideoItem("RxQL11bxvrs", "", "এই বেলা ফুরাবার আগে । জাইমা নূর । Ai Bela Furabar Age । Jaima Noor । JaimaNoor Official । Only Vocal");

		createPlayList("জাইমা নূর গজল", R.drawable.jaimanur);





		//=====================================================================
		//======================== RIJIYA RISA  GOJOL =========================
		//=====================================================================
		addVideoItem("OYEqgHUYU8U", "", "নবীর রওজা শরীফ | আরশের মেহমান করেছেন আল্লাহ | Nabir Rowza Sharif | Arosher Mehoman");
		addVideoItem("7GVa6zrwLSw", "", "মায়ের নতুন গজল || Ma Jononi || মা জননী || Ma Song || New Ghazal || Rajiya Risha Gojol");
		addVideoItem("4-DVY5qbGpo", "", "দিন দুপুরে পার ঘাটেতে | Din Dupure Par Ghatate | New Islamic Song | Rajiya Risha Gojol");
		addVideoItem("qdwFsX2lH80", "", "গুনার বোঝা মাথায় লইয়া কানতেছি | Gunar Bojha Mathay Loiya Kantechi | Rajiya Risha | New Gojol 2023");
		addVideoItem("cUKvZ7mw3LU", "", "ঘুম যদি না আসে গভীর রাতে গজলটি শুনুন | Ghum Jodi Na Ase Govir Rate | Rajiya Risha | Bangla New Gojol");
		addVideoItem("Eu2pev2_5wI", "", "নয়ন মেলিয়া দেখিনি চাহিয়া | Noyon Meliya Dekhini Chahiya | Rajiya Risha | New Islamic Song");
		addVideoItem("oLy9DBrkKhM", "", "New Heart Touching Gojol | নবীজির মেরাজের যাওয়ার গজল | Rajiya Risha | New Islamic Song");
		addVideoItem("f8e3Y-eAWyg", "", "যদি ছোট একটা পাখি হইতাম | Jodi Choto Akta Pakhi Hoitam | New Ghazal | Rajiya Risha Gojol");
		addVideoItem("IbFzANpasoY", "", "হৃদয়স্পর্শী একটি ইসলামিক গজল | হারিয়ে যাবো একদিন আমি | hariye jabo ekdin ami | cover rajiya risha");
		addVideoItem("IVGasVKGLKg", "", "রাজিয়া রিশার সেরা নতুন বাংলা গজল একবার শুনেই দেখুন || New Bangla Gojol 2020 || Rajiya Risha Gojol");
		addVideoItem("FEYpRPYRLXo", "", "Amar Moron Asibe Kokhon | আমার মরন আসিবে কখন | Rajiya Risha | Bangla Islamic Song 2020");
		createPlayList("রিজিয়া রিশা গজল", R.drawable.rijiya);


         //=====================================================================
		//======================== MOSIUR RAHMAN GOJOL =========================
		//=====================================================================
		addVideoItem("_JvNtbt9ufA", "", "Baba Sudhu Baba Noy (Father Song) | বাবা | Mosiur Rahman || Bangla Islamic Song");
		addVideoItem("NnvNWgGPqIc", "", "তুমি মেসওয়াক করার ফজিলত তো জানো || মশিউর রহমান");
		addVideoItem("7z_k5myHHJ0", "", "Sunnat I Islamic Nasheed I Mosiur Rahman I Bngla Islamic Song I 4K");
		addVideoItem("jIjHJ0GrvUE", "", "Prithibi Na Januk || পৃথিবী না জানুক || Mosiur Rahman");
		addVideoItem("TUDW19zwBYU", "", "আলেমের বিভেদ | Mosiur Rahman | Bilal Hossain Nuri | Bangla Islamic Song");
		addVideoItem("bXAC4VvRMuE", "", "যে ঈমান প্রয়োজনে জ্বলে ওঠে না - je iman proyojone jole uthe na (Mosiur Rahman)");
		addVideoItem("eHPtdtn3RAk", "", "Mortei Hobe Jokhon | Moshiur Rahman | Bangla Islamic Song 2019 HD");
		addVideoItem("5t3XVUBJ7e4", "", "এক কালেমায় রুটি রুজি আর এক কালেমায় ফাঁসি | মশিউর রহমান");
		addVideoItem("8Pb67T_fLTM", "", "ঈমানের পথে অবিচল থেকে । মশিউর রহমান । Imaner Pothe । Mosiur Rahman । New Mosiur Rahman । Spondon");
		createPlayList("মশিউর রহমান গজল", R.drawable.moisur);

		//=====================================================================
		//======================== TAREQ MONOWAR  GOJOL =========================
		//=====================================================================
		addVideoItem("jVFgLv49wX0", "", "রাসুল আমার ভালোবাসা - RASUL AMAR VALOBASHA- Allama Tariq Munawar & Iqbal HJ [Official Video]");
		addVideoItem("o_XwDBL1TKk", "", "তারেক মনোয়ারের কণ্ঠে নতুন গজল | তোমারি জন্য মন কাঁদে | Tomari Jonno Mon Kade | Tarek Monawar");
		addVideoItem("OhygUzW_wug", "", "তারেক মনোয়ারের কণ্ঠে নতুন সঙ্গীত | বেদনা ভুলায় | Bedona Vulay | Tarek Munawar | New Nasheed 2021");
		addVideoItem("sbdDXluJgpY", "", "মন আমার কাঁদে রে | Jete Sonar Madina | Mawlana Tarek Monawar | Heaven Tune | New Islamic Song");
		addVideoItem("I4vptqxCtsA", "", "জনপ্রিয় নাশিদ | তুমি আছো হৃদয়ের গভীরে | তারেক মুনাওয়ার | Tumi Acho Ridoyer Govire | Tarek Monawar");
		addVideoItem("RO9C8k_oe8I", "", "তারেক মুনাওয়ারের মায়াবী কন্ঠে | আমার এ জীবন তরী | Amar E Jibon Tori | Tarek Monawar | Islamic Gojol");
		addVideoItem("PUbv-G8xno0", "", "আমার যখন ফুরাবে দিন | Amar Jokhon Furabe Din | Tarik Monowar | Bangla Gojol | Islamic Song");
		addVideoItem("FLV-heiGkzo", "", "রাতে হেডফোনে শুনুন | আমার যখন ফুরাবে দিন আসবে গহীন রাতি | Amar Jokhon furabe Din | Tarek Monawar");
		addVideoItem("J_CfrOFukM0", "", "আল্লামা সাঈদীকে নিয়ে নতুন গান · He Priyo Rahbar · হে প্রিয় রাহবার · তারিক মুনাওয়ার · Allama Sayedee");

		createPlayList("তারেক মনোয়ার গজল", R.drawable.tareq_manowar);





	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

