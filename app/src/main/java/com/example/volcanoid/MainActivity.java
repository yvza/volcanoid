package com.example.volcanoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void gunungClicked(View view) {
        Intent intent = new Intent(this, gunungActivity.class);
        startActivity(intent);
    }

    public void pendakiClicked(View view) {
        Intent intent = new Intent(this, pendakiActivity.class);
        startActivity(intent);
    }

    public void infoDaruratClicked(View view) {
    }

    public void newsClicked(View view) {
    }
}
