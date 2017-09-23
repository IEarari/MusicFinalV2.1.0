package com.example.android.advancemusic;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends Activity{
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
    }
    public void MediaPlayerStart(View view) {
        mediaPlayer.start();
    }
    public void MediaPlayerPause(View view) {
        mediaPlayer.pause();
    }
    public void MediaPlayerStop(View view) {
        mediaPlayer.stop();
        mediaPlayer.seekTo(0);
    }
    public void GoToDetails (View view){
        Intent Details = new Intent(MainActivity.this, Details.class);
        startActivity(Details);
    }
    public void GoToDontae (View view){
        Intent donate = new Intent(MainActivity.this, DONATE.class);
        startActivity(donate);
    }
}
