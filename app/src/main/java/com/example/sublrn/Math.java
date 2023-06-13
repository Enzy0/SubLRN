package com.example.sublrn;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Math extends AppCompatActivity {

    private Button backmath;
    private Button math1;
    private Button math2;
    private Button math3;
    private Button math4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        backmath = findViewById(R.id.backmath);
        math1 = findViewById(R.id.math1);
        math2 = findViewById(R.id.math2);
        math3 = findViewById(R.id.math3);
        math4 = findViewById(R.id.math4);

        math1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, TMath1.class);
                startActivity(intent);
                Math.this.finish();
            }
        });

        math2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, TMath2.class);
                startActivity(intent);
                Math.this.finish();
            }
        });

        math3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, TMath3.class);
                startActivity(intent);
                Math.this.finish();
            }
        });

        math4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, TMath4.class);
                startActivity(intent);
                Math.this.finish();
            }
        });

        backmath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Math.this, Subjects.class);
                startActivity(intent);
                Math.this.finish();
            }
        });
    }
}