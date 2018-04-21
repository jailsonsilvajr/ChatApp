package com.chatapp.jailson.chatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button acess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        this.username = (EditText) findViewById(R.id.activity_login_edittext_username);
        this.password = (EditText) findViewById(R.id.activity_login_edittext_passaword);
        this.acess = (Button) findViewById(R.id.activity_login_button_login);

        this.acess.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                login();
            }
        });
    }

    public void login(){

        //String text = "Username: " + this.username.getText() +"\n" + "Senha: " + this.password.getText();
        //Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
        Intent intent = new Intent (this, BaseActivity.class);
        startActivity(intent);
    }
}
