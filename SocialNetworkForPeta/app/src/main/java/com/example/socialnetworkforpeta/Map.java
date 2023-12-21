package com.example.socialnetworkforpeta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        findViewById(R.id.profile).setOnClickListener(v -> {

            startActivity(new Intent(this, Home.class));
        });

        findViewById(R.id.friends).setOnClickListener(v -> {

            startActivity(new Intent(this, friends.class));
        });

        findViewById(R.id.loved).setOnClickListener(v -> {

            startActivity(new Intent(this, chat.class));
        });

        findViewById(R.id.time1).setOnClickListener(v -> {

            startActivity(new Intent(this, Clocky1.class));
        });
 }
}

