package com.samsung.app_asignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MusicPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
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

                startActivity(intent);
                break;
            case R.id.Music:
                Toast.makeText(this,"Already in Music Player",Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}