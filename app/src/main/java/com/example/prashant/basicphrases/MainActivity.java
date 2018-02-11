package com.example.prashant.basicphrases;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mediaPlayer= new MediaPlayer();
        mediaPlayer.create(this,R.raw.hello);

    }
    public void speak(View view){

     Button buttonPressed= (Button) view;

        Log.i("message",buttonPressed.getTag().toString());



        MediaPlayer mediaPlayer= MediaPlayer.create(this, getResources().getIdentifier(buttonPressed.getTag().toString(), "raw", getPackageName()));
        mediaPlayer.start();




    }
}
