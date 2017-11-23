package com.ondigital.backend.platzigram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ondigital.backend.platzigram.view.ConteinerActivity;
import com.ondigital.backend.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);

        startActivity(intent);

    }

    public void goConteiner (View view){
        Intent intent1 = new Intent(this, ConteinerActivity.class);

        startActivity(intent1);
    }
}
