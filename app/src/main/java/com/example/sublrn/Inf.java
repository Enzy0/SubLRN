package com.example.sublrn;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inf extends AppCompatActivity {

    private Button backinf;
    private Button inf1;
    private Button inf2;
    private Button inf3;
    private Button inf4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        backinf = findViewById(R.id.backinf);
        inf1 = findViewById(R.id.inf1);
        inf2 = findViewById(R.id.inf2);
        inf3 = findViewById(R.id.inf3);
        inf4 = findViewById(R.id.inf4);

        inf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inf.this, TInf1.class);
                startActivity(intent);
                Inf.this.finish();
            }
        });

        inf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inf.this, TInf2.class);
                startActivity(intent);
                Inf.this.finish();
            }
        });

        inf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inf.this, TInf3.class);
                startActivity(intent);
                Inf.this.finish();
            }
        });

        inf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inf.this, TInf4.class);
                startActivity(intent);
                Inf.this.finish();
            }
        });

        backinf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inf.this, Subjects.class);
                startActivity(intent);
                Inf.this.finish();
            }
        });
    }
}