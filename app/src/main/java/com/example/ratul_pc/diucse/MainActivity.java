package com.example.ratul_pc.diucse;

import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private Button mStudent,mTeacher,mCourse_outline,mLink,mNews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStudent = findViewById(R.id.studentBtnId);
        mTeacher = findViewById(R.id.teacherBtnId);
        mCourse_outline = findViewById(R.id.courseOutlineBtnId);
        mLink = findViewById(R.id.linkBtnId);
        mNews = findViewById(R.id.newsBtnId);

        mStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Student.class);
                startActivity(i);
            }
        });
        mTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,Teacher.class);
                startActivity(i);
            }
        });
        mCourse_outline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,Tab_Course.class);
                startActivity(i);
            }
        });
        mLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,Link.class);
                startActivity(i);
            }
        });
        mNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,News.class);
                startActivity(i);
            }
        });
    }
}
