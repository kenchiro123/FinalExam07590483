package com.example.finalexam07590483;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private static final String EMAIL = "";
    private static final String PASSWORD = "";
    private static final String Username = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login_button = findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                EditText username = findViewById(R.id.username_edit_text);
                                                EditText password = findViewById(R.id.password_edit_text);

                                                String inputUsername = username.getText().toString();
                                                String inputPassword = password.getText().toString();

                                                if (inputUsername.equals(Username) || inputPassword.equals(PASSWORD)) {
                                                    Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                                                    intent.putExtra(inputUsername, inputPassword);

                                                    Toast.makeText(LoginActivity.this,
                                                            R.string.Login_failed,
                                                            Toast.LENGTH_SHORT).show();
                                                    

                                                } else {

                                                }

                                            }
                                        }

        );

        Button register_button = findViewById(R.id.register_button);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });

    }
}