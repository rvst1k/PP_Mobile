package com.example.socialnetworkforpeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class chat extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        EditText editText = findViewById(R.id.EditTextxd);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    editText.setText("");
                }
            }
        });

        findViewById(R.id.geo).setOnClickListener(v -> {

            startActivity(new Intent(this, Map.class));
        });

        findViewById(R.id.friends).setOnClickListener(v -> {

            startActivity(new Intent(this, friends.class));
        });

        findViewById(R.id.profile).setOnClickListener(v -> {

            startActivity(new Intent(this, Home.class));
        });

        findViewById(R.id.time1).setOnClickListener(v -> {

            startActivity(new Intent(this, Clocky1.class));
        });
    }
}