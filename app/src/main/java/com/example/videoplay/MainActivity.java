package com.example.videoplay;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView video=(VideoView) findViewById(R.id.videoView3);
        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.janemeeriye);
        MediaController media=new MediaController(this);
        media.setAnchorView(video);
        video.setMediaController(media);
        video.start();
    }
}
