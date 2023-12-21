package com.example.socialnetworkforpeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {


    private TextView LoginTextView;
    private TextView PasswordTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        LoginTextView = findViewById(R.id.LoginTextView);
        PasswordTextView = findViewById(R.id.PasswordTextView);
        String text = getIntent().getStringExtra("text");
        String text1 = getIntent().getStringExtra("text1");
        LoginTextView.setText(text);
        PasswordTextView.setText(text1);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String savedValue = sharedPreferences.getString("savedValue", "");
        String savedValue1 = sharedPreferences.getString("savedValue1", "");
        if (!savedValue.isEmpty())
        {
            LoginTextView.setText(savedValue);
            PasswordTextView.setText(savedValue1);
        }
        editor.putString("savedValue", text);
        editor.putString("savedValue1", text1);
        editor.apply();
        findViewById(R.id.LK_EXIT).setOnClickListener(v -> {

            startActivity(new Intent(this, Login.class));
        });

        findViewById(R.id.geo).setOnClickListener(v -> {

            startActivity(new Intent(this, Map.class));
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