package com.example.sublrn;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chem extends AppCompatActivity {

    private Button backchem;
    private Button chem1;
    private Button chem2;
    private Button chem3;
    private Button chem4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        backchem = findViewById(R.id.backchem);
        chem1 = findViewById(R.id.chem1);
        chem2 = findViewById(R.id.chem2);
        chem3 = findViewById(R.id.chem3);
        chem4 = findViewById(R.id.chem4);

        chem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chem.this, TChem1.class);
                startActivity(intent);
                Chem.this.finish();
            }
        });

        chem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chem.this, TChem2.class);
                startActivity(intent);
                Chem.this.finish();
            }
        });

        chem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chem.this, TChem3.class);
                startActivity(intent);
                Chem.this.finish();
            }
        });

        chem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chem.this, TChem4.class);
                startActivity(intent);
                Chem.this.finish();
            }
        });

        backchem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chem.this, Subjects.class);
                startActivity(intent);
                 Chem.this.finish();
            }
        });
    }
}