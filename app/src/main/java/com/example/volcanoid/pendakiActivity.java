package com.example.volcanoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class pendakiActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;

    private TextView nameHandler;
    private TextView asalHandler;
    private TextView genderHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaki);
        nameHandler = findViewById(R.id.textView51);
        asalHandler= findViewById(R.id.textView52);
        genderHandler = findViewById(R.id.textView53);
    }

    public void pendakiClicked(View view) {
        Intent intent = new Intent(this, inputActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST){
            if(resultCode == RESULT_OK){
                String nama = data.getStringExtra(inputActivity.NAMA);
                String asal = data.getStringExtra(inputActivity.ASAL);
                String gender = data.getStringExtra(inputActivity.GENDER);
                nameHandler.setText(nama);
                asalHandler.setText(asal);
                genderHandler.setText(gender);
            }
        }
    }
}
