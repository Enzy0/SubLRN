package com.example.sublrn;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Phys extends AppCompatActivity {

    private Button backphys;
    private Button phys1;
    private Button phys2;
    private Button phys3;
    private Button phys4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phys);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        backphys = findViewById(R.id.backphys);
        phys1 = findViewById(R.id.phys1);
        phys2 = findViewById(R.id.phys2);
        phys3 = findViewById(R.id.phys3);
        phys4 = findViewById(R.id.phys4);


        phys1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Phys.this, TPhys1.class);
                startActivity(intent);
                Phys.this.finish();
            }
        });

        phys2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Phys.this, TPhys2.class);
                startActivity(intent);
                Phys.this.finish();
            }
        });

        phys3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Phys.this, TPhys3.class);
                startActivity(intent);
                Phys.this.finish();
            }
        });

        phys4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Phys.this, TPhys4.class);
                startActivity(intent);
                Phys.this.finish();
            }
        });


        backphys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Phys.this, Subjects.class);
                startActivity(intent);
                Phys.this.finish();
            }
        });
    }
}
