package com.example.ratul_pc.diucse;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Student extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        String[] name = {"Sabuj Kumar Roy",
                "Hira Harsha",
                "Rezaul Karim",
                "Arifur Tuhin",
                "Shehab Ahmed",
                "MD. Mehedi Hasan",
                "Jahangir Alam",
                "S M Melon Ahmad",
                "Ratul Sarkar",
                "Sunmoon Khondokar",
                "MD. Rahat Shahin",
                "Mahajabin Doli",
                "Mahabuba Rahman Mili",
                "Shahriaz Ahmed",
                "Shanzida",
                "Jannatul Ferdus",
                "Halima Shreti",
                "Ruma Akther",
                "Sufal Kumar Mondol",
                "Salim Hossain",
                "Mayashing Marma",
                "Md. Osman Goni",
                "Jahid Hasan",
                "Mehedi Hasan",
                "Sujit Kumar Adhikari",
                "Habibur Rahman",
                "Zahirul Islam",
                "Rubel Hasan",
                "Tumpa Akther",
                "Liza Akther",
                "Bishawjit Kumar",
                "Mizanur Rahman(Shuvo)",
                "Abdul Malek Zihadi",
                "Naziur Rahman",
                "Razia Sultana Urmi",
                "Sanarul Islam",
                "Nadir Al Mamun",
                "Dewan Zony"};

        listView = findViewById(R.id.listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment;

        if (position == 0) {

            fragment = new SabujFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 1) {

            fragment = new HiraFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 2) {

            fragment = new RezaFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 3) {

            fragment = new TuhinFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 4) {

            fragment = new ShehabFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 5) {

            fragment = new Mehedi9Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 6) {

            fragment = new JahangirFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 7) {

            fragment = new MelonFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 8) {

            fragment = new RatulFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 9) {

            fragment = new SunmoonFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 10) {

            fragment = new RahatFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 11) {

            fragment = new DoliFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 12) {

            fragment = new MiliFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 13) {

            fragment = new Shahriaz();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 14) {

            fragment = new SanjidaFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 15) {

            fragment = new JannatFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }
        if (position == 16) {

            fragment = new HalimaFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 17) {

            fragment = new RumaFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 18) {

            fragment = new SufolFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 19) {

            fragment = new SalimFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 20) {

            fragment = new MarmaFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 21) {

            fragment = new OsmanFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 22) {

            fragment = new JahidFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 23) {

            fragment = new Mehedi34Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 24) {

            fragment = new SujitFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 25) {

            fragment = new HabibFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 26) {

            fragment = new ZahirFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 27) {

            fragment = new RubelFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 28) {

            fragment = new TumpaFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 29) {

            fragment = new LizaFragmen();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 30) {

            fragment = new BishawjidFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 31) {

            fragment = new MizanurFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 32) {

            fragment = new ZihadiFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 33) {

            fragment = new NaziurFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 34) {

            fragment = new UrmiFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 35) {

            fragment = new SanarulFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 36) {

            fragment = new nadirFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

        if (position == 37) {

            fragment = new ZonyFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId, fragment).commit();
        }

    }
}