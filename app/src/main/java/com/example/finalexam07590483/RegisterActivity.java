package com.example.finalexam07590483;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;

public class RegisterActivity extends AppCompatActivity {

    private static final String Fullname = "";
    private static final String Username = "";
    private static final String PASSWORD = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button reegister = findViewById(R.id.register_button);
        reegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText fullname = findViewById(R.id.full_name_edit_text);
                EditText username = findViewById(R.id.username_edit_text);
                EditText password = findViewById(R.id.password_edit_text);

                String inputFullname = username.getText().toString();
                String inputUsername = username.getText().toString();
                String inputPassword = password.getText().toString();

                if (inputFullname.equals("") || inputUsername.equals(Username) || inputPassword.equals(PASSWORD)) {
                    Intent intent = new Intent(RegisterActivity.this, RegisterActivity.class);
                    intent.putExtra(inputUsername, inputPassword);

                    AlertDialog.Builder dialog = new AlertDialog.Builder(RegisterActivity.this);
                    // dialog.setTitle("All fields are required");
                    dialog.setMessage(R.string.Login_failed);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();

                }
                else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(RegisterActivity.this);
                    // dialog.setTitle("All fields are required");
                    dialog.setMessage(R.string.Register_successfully);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                }

            }
        });


    }
}