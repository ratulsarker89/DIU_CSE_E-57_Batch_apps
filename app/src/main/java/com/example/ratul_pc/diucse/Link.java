package com.example.ratul_pc.diucse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Link extends AppCompatActivity {

    private ListView listView;
    private String[] header_Name;
    private String[] header_Link;
    private int[] icone ={R.drawable.diu_logo1,R.drawable.facebook2,R.drawable.facebook3,
                R.drawable.actibities4,R.drawable.eng_practic_club5,R.drawable.eng_language_club6,
                R.drawable.facebook7,R.drawable.std_unity8,R.drawable.facebook9,R.drawable.book_library10,
                R.drawable.facebook11,R.drawable.career_pln_club12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        header_Name =getResources().getStringArray(R.array.headingName);
        header_Link = getResources().getStringArray(R.array.heading_Link);

        listView =findViewById(R.id.list_ViewId);

        CustomAdapter adapter = new CustomAdapter(this,header_Name,header_Link,icone);
        listView.setAdapter(adapter);
    }
}
