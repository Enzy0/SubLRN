package com.example.sublrn;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class TMath4 extends AppCompatActivity {

    private Button backtmath4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmath4);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        VideoView videoView = findViewById(R.id.videoView24);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.veroyat;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        backtmath4 = findViewById(R.id.backtmath4);

        backtmath4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TMath4.this, Math.class);
                startActivity(intent);
                TMath4.this.finish();
            }
        });
    }
}