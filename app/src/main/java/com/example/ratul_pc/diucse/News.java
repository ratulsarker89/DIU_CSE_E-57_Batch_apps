package com.example.ratul_pc.diucse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class News extends AppCompatActivity {

    private ListView listView;
    private String[] nName;
    private String[] nNameLink;
    private int[] nPic ={R.drawable.thedailystar_1,R.drawable.prothomalo_2,R.drawable.amardesh_3,
    R.drawable.ittefak_4,R.drawable.noyadigonto_5,R.drawable.bbcbangla_6,R.drawable.bangladeshprotidin_7,
    R.drawable.kalerkontho_8,R.drawable.jonokonthow_9,R.drawable.jugantor_10,R.drawable.somokal_11,
    R.drawable.incalub_12,R.drawable.dinkal_13,R.drawable.bdnew24_14,R.drawable.manobjomin_15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        listView =findViewById(R.id.newsListViewId);

        nName =getResources().getStringArray(R.array.news_Name);
        nNameLink =getResources().getStringArray(R.array.news_Link_Name);

        NewsAdapter adapter =new NewsAdapter(this,nName,nNameLink,nPic);
        listView.setAdapter(adapter);

    }
}
