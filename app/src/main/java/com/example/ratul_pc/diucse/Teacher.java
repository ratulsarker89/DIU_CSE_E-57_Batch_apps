package com.example.ratul_pc.diucse;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Teacher extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        String[] name = {"DR. A.T.M Mahbubur Rahman","Md. Abdul Based","Mst. Jhanara Akhtar",
                "Md. Anisur Rahman Pramanik","Md. Habibullah Belali","Md. Tahzib UL Islam","Md Saifuzzaman","Ms. Saraboni Borua",
                "Md. Solaiman Mia","Mr. Samrat Kumar Dey","Md. Mahmudul Hasan","Md. Kawsar Ahmed",
                "Md. Ashraful Islam","Md. Al Imran","Md. Riaz Uddin","Md. Zahidul Islam","Md. Firoz Sarker",
                "Ms. Arpita Howlader","Mr. Suman Mazumder","Md. Shariful Islam","Md. SK Fahim Abrar","Md. Shibly Sadique",
                "Md. Ashfaqul Islam Tonmoy","Md. Shafiur Rahman","Md. Mahbubur Rahman","Md. Khandakar Mohammad Mohiuddin",
                "Md.Ibrahim Khalil" };

        listView = findViewById(R.id.listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

       listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

           //--------------Show details -------------------
           @Override
           public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
               Fragment fragment;
               if (position ==0){
                   fragment =new MahbubSirDetFragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 1){
                   fragment = new Based_Sir_Det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 2){
                   fragment = new jahanaraSir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }

               if (position == 3){
                   fragment = new jahanaraSir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }

               if (position == 4){
                   fragment = new Belali_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 5){
                   fragment = new Tahjib_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 6){
                   fragment = new Saifuzzaman_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 7){
                   fragment = new Sraboni_Sir_Det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 8){
                   fragment = new SolaimanMia_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 9){
                   fragment = new Samrat_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 10){
                   fragment = new Tuhin_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 11){
                   fragment = new Kawsar_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 12){
                   fragment = new Ashraful_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 13){
                   fragment = new AlImran_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 14){
                   fragment = new Riaz_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 15){
                   fragment = new ZahidulIslam_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 16){
                   fragment = new FirozSarker_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 17){
                   fragment = new Arpita_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 18){
                   fragment = new SumanMajumder_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 19){
                   fragment = new SharifulIslam_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 20){
                   fragment = new Fahim_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 21){
                   fragment = new Shibly_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 22){
                   fragment = new Tonmoy_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 23){
                   fragment = new ShafiurRahman_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 24){
                   fragment = new Mahbubur_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 25){
                   fragment = new Mohiuddin_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }
               if (position == 26){
                   fragment = new Ibrahim_Sir_det_Fragment();
                   getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
               }

               //Toast.makeText(Teacher.this, "Click on "+position, Toast.LENGTH_LONG).show();
               return true;
           }
       });
    }
//-----------Show Image and name in Fragment---------
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(Teacher.this, "view details, press on 3 second", Toast.LENGTH_SHORT).show();

        Fragment fragment;
        if (position == 0){
            fragment =new MahbuburSirFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 1){
            fragment =new Based_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }

        if (position == 2){
            fragment =new JahanaraSir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 3){
            fragment =new AnisurRahman_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 4){
            fragment =new Belali_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 5){
            fragment =new TahzibSirFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 6){
            fragment =new SaifuzzamanSirFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 7){
            fragment =new Sraboni_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 8){
            fragment =new SolaimanMia_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 9){
            fragment =new Samrat_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 10){
            fragment =new Tuhin_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 11){
            fragment =new Kawsar_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 12){
            fragment =new Ashraful_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 13){
            fragment =new AlImran_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 14){
            fragment =new Reaz_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 15){
            fragment =new ZahidulIslam_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 16){
            fragment =new FerozSarker_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 17){
            fragment =new Arpita_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 18){
            fragment =new SumonMojumder_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 19){
            fragment =new SharifulIslam_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 20){
            fragment =new Fahim_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 21){
            fragment =new Shibly_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 22){
            fragment =new TonmoySirFragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 23){
            fragment =new ShafiurRahman_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 24){
            fragment =new Mahbubur_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 25){
            fragment =new Mohiuddin_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }
        if (position == 26){
            fragment =new Ibrahim_Sir_Fragment();
            getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
        }

    }

}

