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

public class TPhys4 extends AppCompatActivity {

    private Button backtphys4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tphys4);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();

        VideoView videoView = findViewById(R.id.videoView4);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.optic;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        backtphys4 = findViewById(R.id.backtphys4);

        backtphys4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TPhys4.this, Phys.class);
                startActivity(intent);
                TPhys4.this.finish();
            }
        });
    }
}