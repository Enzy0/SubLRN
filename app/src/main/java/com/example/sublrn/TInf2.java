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

public class TInf2 extends AppCompatActivity {

    private Button backtinf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinf2);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        VideoView videoView = findViewById(R.id.videoView32);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.web;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        backtinf2 = findViewById(R.id.backtinf2);

        backtinf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TInf2.this, Inf.class);
                startActivity(intent);
                TInf2.this.finish();
            }
        });
    }
}