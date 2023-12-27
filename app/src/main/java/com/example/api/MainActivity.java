package com.example.api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Login (View view){
        EditText txtusuario= findViewById(R.id.txtUser);
        EditText txtpass= findViewById(R.id.txtPass);
        Intent intent =new Intent(MainActivity.this, SaludoActivity.class);
        startActivity(intent);



    }
}