package com.example.volcanoid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class inputActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.volcanoid.extra.REPLY";
    public static final String NAMA = "nama";
    public static final String ASAL =  "asal";
    public static final String GENDER = "gender";
    private EditText inputName;
    private EditText inputAsal;
    private RadioGroup gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        inputName = findViewById(R.id.inputName);
        inputAsal = findViewById(R.id.inputAsal);
        gender = findViewById(R.id.rg_gender);
    }

    public void submitClicked(View view) {
        String name = inputName.getText().toString();
        String asal = inputAsal.getText().toString();
        RadioButton radioSelected = findViewById(gender.getCheckedRadioButtonId());

        Intent send = new Intent();
        send.putExtra(NAMA, name);
        send.putExtra(ASAL, asal);
        send.putExtra(GENDER, radioSelected.getText().toString());
        setResult(RESULT_OK, send);
        finish();
    }
}
