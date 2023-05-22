package com.example.sublrn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SingInScreen extends AppCompatActivity {

    private EditText logemailtxt;
    private EditText logpasstxt;
    private Button logbtn;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sing_in_screen);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        logemailtxt = findViewById(R.id.logemailtxt);
        logpasstxt = findViewById(R.id.logpasstxt);
        logbtn = findViewById(R.id.logbtn);

        mAuth = FirebaseAuth.getInstance();

        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (logemailtxt.getText().toString().isEmpty() || logpasstxt.getText().toString().isEmpty()) {
                    Toast.makeText(SingInScreen.this, "Поля должны быть заполнены", Toast.LENGTH_SHORT).show();
                } else {
                    mAuth.signInWithEmailAndPassword(logemailtxt.getText().toString(), logpasstxt.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Intent intent = new Intent(SingInScreen.this, Subjects.class);
                                        startActivity(intent);
                                    } else {
                                        Toast.makeText(SingInScreen.this, "Проблемы с данными", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });
    }
    public void gotoreg(View v){
        Intent intent = new Intent(SingInScreen.this, SignUpScreen.class);
        startActivity(intent);
        SingInScreen.this.finish();
    }
}