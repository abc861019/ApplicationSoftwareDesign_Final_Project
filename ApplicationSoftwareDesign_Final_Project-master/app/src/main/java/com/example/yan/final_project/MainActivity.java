package com.example.yan.final_project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button play;
    TextView showpoint;
    MediaPlayer mp;
    int point;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=(Button)findViewById(R.id.play);
    }

    public void play(View v)
    {
        mp=MediaPlayer.create(this,R.raw.music);
        mp.start();
        Intent it = new Intent(this ,play_activity.class);
        startActivityForResult(it,123);
    }

}
