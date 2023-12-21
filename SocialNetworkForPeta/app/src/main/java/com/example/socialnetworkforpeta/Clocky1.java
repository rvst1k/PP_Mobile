package com.example.socialnetworkforpeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

public class Clocky1 extends AppCompatActivity {


    private ImageView deleteButton1, deleteButton2, deletebutton3;

    private Switch aSwitch, bSwitch, cSwitch;

    private LinearLayout linearLayout1, linearLayout2, linearLayout3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clocky1);



        deleteButton1 = findViewById(R.id.deletebutton11);
        deleteButton2 = findViewById(R.id.deletebutton22);
        deletebutton3 = findViewById(R.id.deletebutton33);
        linearLayout1 = findViewById(R.id.make11);
        linearLayout2 = findViewById(R.id.make22);
        linearLayout3 = findViewById(R.id.make33);
        aSwitch = findViewById(R.id.switch11);
        bSwitch = findViewById(R.id.switch22);
        cSwitch = findViewById(R.id.switch33);

        deleteButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup parentView1 = (ViewGroup) linearLayout1.getParent();
                parentView1.removeView(linearLayout1);
            }
        });
        deleteButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Удаляем элемент
                ViewGroup parentView1 = (ViewGroup) linearLayout1.getParent();
                parentView1.removeView(linearLayout1);
            }
        });
        deleteButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup parentView2 = (ViewGroup) linearLayout2.getParent();
                parentView2.removeView(linearLayout2);
            }
        });
        deleteButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Удаляем элемент
                ViewGroup parentView2 = (ViewGroup) linearLayout2.getParent();
                parentView2.removeView(linearLayout2);
            }
        });
        deletebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup parentView2 = (ViewGroup) linearLayout3.getParent();
                parentView2.removeView(linearLayout3);
            }
        });
        deletebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Удаляем элемент
                ViewGroup parentView2 = (ViewGroup) linearLayout3.getParent();
                parentView2.removeView(linearLayout3);
            }
        });
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Изменить фон на один цвет
                    linearLayout1.setBackgroundResource(R.drawable.layout_bg1);
                } else {
                    // Изменить фон на другой цвет
                    linearLayout1.setBackgroundResource(R.drawable.layout_bg);
                }
            }
        });
        bSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Изменить фон на один цвет
                    linearLayout2.setBackgroundResource(R.drawable.layout_bg1);
                } else {
                    // Изменить фон на другой цвет
                    linearLayout2.setBackgroundResource(R.drawable.layout_bg);
                }
            }
        });
        cSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Изменить фон на один цвет
                    linearLayout3.setBackgroundResource(R.drawable.layout_bg1);
                } else {
                    // Изменить фон на другой цвет
                    linearLayout3.setBackgroundResource(R.drawable.layout_bg);
                }
            }
        });

        findViewById(R.id.profile).setOnClickListener(v -> {

            startActivity(new Intent(this, Home.class));
        });

        findViewById(R.id.friends).setOnClickListener(v -> {

            startActivity(new Intent(this, friends.class));
        });

        findViewById(R.id.loved).setOnClickListener(v -> {

            startActivity(new Intent(this, chat.class));
        });

        findViewById(R.id.geo).setOnClickListener(v -> {

            startActivity(new Intent(this, Map.class));
        });
    }
}