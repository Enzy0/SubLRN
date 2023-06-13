package com.example.sublrn;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Subjects extends AppCompatActivity {

    private Button logoutbtn;
    private Button gotophys;
    private Button gotomath;
    private Button gotoinf;
    private Button gotochem;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        logoutbtn = findViewById(R.id.logoutbtn);
        gotophys = findViewById(R.id.gotophys);
        gotomath = findViewById(R.id.gotomath);
        gotoinf = findViewById(R.id.gotoinf);
        gotochem = findViewById(R.id.gotochem);
        mAuth = FirebaseAuth.getInstance();

        gotophys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Subjects.this, Phys.class);
                startActivity(intent);
                Subjects.this.finish();
            }
        });

        gotomath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Subjects.this, Math.class);
                startActivity(intent);
                Subjects.this.finish();
            }
        });

        gotoinf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Subjects.this, Inf.class);
                startActivity(intent);
                Subjects.this.finish();
            }
        });

        gotochem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Subjects.this, Chem.class);
                startActivity(intent);
                Subjects.this.finish();
            }
        });

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                Intent intent = new Intent(Subjects.this, SingInScreen.class);
                startActivity(intent);
                Subjects.this.finish();
            }
        });
    }
}