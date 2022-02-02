package com.example.appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText et_getal1, et_getal2;
    TextView tv_resultaat;
    MaterialButton btn_optellen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_getal1 = findViewById(R.id.ed_getal1);
        et_getal2 = findViewById(R.id.ed_getal2);
        btn_optellen = findViewById(R.id.btn_optellen);

        btn_optellen.setOnClickListener(view -> {
// TODO: 2-2-2022 wat gaat de button doen?  
            // TODO: 2-2-2022 aanroepen rekenen class 
            // TODO: 2-2-2022 presenteren uitkomst 
            // TODO: 2-2-2022 toevoegen extra button (vermenigvuldigen) en TDD toepassen 


        });

    }
}