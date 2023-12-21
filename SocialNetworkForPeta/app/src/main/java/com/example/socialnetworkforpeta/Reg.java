package com.example.socialnetworkforpeta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Reg extends AppCompatActivity {

    private EditText LoginEditText;
    private EditText PasswordEditText;
    private Button RegButton;

    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        RegButton = findViewById(R.id.RegButton);
        LoginEditText = findViewById(R.id.LoginEditText);
        PasswordEditText = findViewById(R.id.PasswordEditText);

        RegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, password;
                email = String.valueOf(LoginEditText.getText());
                password = String.valueOf(PasswordEditText.getText());

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(Reg.this, "Введите почту", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(Reg.this, "Введите пароль", Toast.LENGTH_SHORT).show();
                    return;
                }

                firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(Reg.this, "Регистрация успешна!", Toast.LENGTH_SHORT).show();
                                }
                                else {
                                    Toast.makeText(Reg.this, "Регистрация не успешна!", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });


        findViewById(R.id.textView5).setOnClickListener(v -> {

            startActivity(new Intent(this, Login.class));
        });
        findViewById(R.id.main000).setOnTouchListener(new OnSwipeTouchListener(this) {
        });
    }
}