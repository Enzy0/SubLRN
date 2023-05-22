package com.example.sublrn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpScreen extends AppCompatActivity {

    private EditText regemailtxt;
    private EditText regpasstxt;
    private Button regbtn;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_screen);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        regemailtxt = findViewById(R.id.regemailtxt);
        regpasstxt = findViewById(R.id.regpasstxt);
        regbtn = findViewById(R.id.regbtn);

        mAuth = FirebaseAuth.getInstance();

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (regemailtxt.getText().toString().isEmpty() || regpasstxt.getText().toString().isEmpty()){
                    Toast.makeText(SignUpScreen.this, "Поля должны быть заполнены", Toast.LENGTH_SHORT).show();
                }else{
                    mAuth.createUserWithEmailAndPassword(regemailtxt.getText().toString(),regpasstxt.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful()){
                                        Intent intent = new Intent(SignUpScreen.this, Subjects.class);
                                        startActivity(intent);
                                    }else{
                                        Toast.makeText(SignUpScreen.this, "Проблемы с данными", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }

            }
        });
    }
    public void gotolog(View v){
        Intent intent = new Intent(SignUpScreen.this, SingInScreen.class);
        startActivity(intent);
        SignUpScreen.this.finish();
    }
}