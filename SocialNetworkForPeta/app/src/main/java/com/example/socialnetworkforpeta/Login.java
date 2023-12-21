package com.example.socialnetworkforpeta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    private EditText LoginEditText;
    private EditText PasswordEditText;
    private Button RegButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        RegButton = findViewById(R.id.RegButton);
        LoginEditText = findViewById(R.id.LoginEditText);
        PasswordEditText = findViewById(R.id.PasswordEditText);

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        RegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, password;
                email = String.valueOf(LoginEditText.getText());
                password = String.valueOf(PasswordEditText.getText());

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(Login.this, "Введите почту", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(Login.this, "Введите пароль", Toast.LENGTH_SHORT).show();
                    return;
                }

                firebaseAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(Login.this, "Авторизация успешна!", Toast.LENGTH_SHORT).show();
                                    SharedPreferences.Editor editor = getSharedPreferences("MyPrefs", MODE_PRIVATE).edit();
                                    String text = LoginEditText.getText().toString();
                                    String text1 = PasswordEditText.getText().toString();
                                    Intent intent = new Intent(Login.this, Home.class);
                                    intent.putExtra("text", text);
                                    intent.putExtra("text1", text1);
                                    startActivity(intent);
                                }
                                else {
                                    Toast.makeText(Login.this, "Авторизация не успешна!", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        findViewById(R.id.textView5).setOnClickListener(v -> {

            startActivity(new Intent(this, Reg.class));
        });
        findViewById(R.id.main000).setOnTouchListener(new OnSwipeTouchListener(this) {
        });
    }
}