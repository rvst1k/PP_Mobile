package com.example.socialnetworkforpeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class friends extends AppCompatActivity {


    private LinearLayout linearLayout, linearLayout1;
    private Button deleteButton, deleteButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        deleteButton = findViewById(R.id.frienddelete2);
        deleteButton1 = findViewById(R.id.frienddelete1);
        linearLayout = findViewById(R.id.friend2);
        linearLayout1 = findViewById(R.id.friend1);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup parentView1 = (ViewGroup) linearLayout.getParent();
                parentView1.removeView(linearLayout);
            }
   });
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Удаляем элемент
                ViewGroup parentView1 = (ViewGroup) linearLayout.getParent();
                parentView1.removeView(linearLayout);
            }
        });
        deleteButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup parentView2 = (ViewGroup) linearLayout1.getParent();
                parentView2.removeView(linearLayout1);
            }
        });
        deleteButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Удаляем элемент
                ViewGroup parentView2 = (ViewGroup) linearLayout1.getParent();
                parentView2.removeView(linearLayout1);
            }
        });

        findViewById(R.id.geo).setOnClickListener(v -> {

            startActivity(new Intent(this, Map.class));
        });

        findViewById(R.id.profile).setOnClickListener(v -> {

            startActivity(new Intent(this, Home.class));
        });

        findViewById(R.id.loved).setOnClickListener(v -> {

            startActivity(new Intent(this, chat.class));
        });
        findViewById(R.id.time1).setOnClickListener(v -> {

            startActivity(new Intent(this, Clocky1.class));
        });


    }



}