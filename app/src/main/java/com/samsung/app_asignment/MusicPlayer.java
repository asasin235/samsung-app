package com.samsung.app_asignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MusicPlayer extends AppCompatActivity {
    private String user;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            user=extras.getString("user");
            String value = "Hello " +extras.getString("user") + " !";
            setTitle(value);
        }
        music = MediaPlayer.create(
                this, R.raw.shapeofyou);
    }

    // Plaing the music
    public void musicplay(View v)
    {
        Toast.makeText(this,"Playing now...",Toast.LENGTH_SHORT).show();
        music.start();
    }

    // Pausing the music
    public void musicpause(View v)
    {
        Toast.makeText(this,"Paused",Toast.LENGTH_SHORT).show();
        music.pause();
    }

    // Stoping the music
    public void musicstop(View v)
    {
        music.stop();
        music
                = MediaPlayer.create(
                this, R.raw.shapeofyou);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        switch (id){
            case R.id.Calc:

                Intent intent  = new Intent(getApplicationContext(), CalculatorActivity.class);
                intent.putExtra("user",user);
                startActivity(intent);
                break;
            case R.id.Music:
                Toast.makeText(this,"Already in Music Player",Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}