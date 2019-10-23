package com.example.panduanpenggunaanubat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   Button ubatPamMDIButton;
   Button ubatPamTurbuhaler;
   Button ubatPamAccuhaler;
   Button ubatPamEasyhaler;
   Button penInsulinNovopen;
   Button penInsulinAllstar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ubatPamMDIButton = (Button) findViewById(R.id.ubatpammdibutton);
        ubatPamMDIButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goToTheUbatPamMDI = new Intent(getApplicationContext(),ubatPamMDI.class);
                startActivity(goToTheUbatPamMDI); }});

        ubatPamTurbuhaler = (Button) findViewById(R.id.ubatpamturbuhalerbutton);
        ubatPamTurbuhaler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goToTheUbatPamTurbuhaler = new Intent(getApplicationContext(),ubatPamTurbuhaler.class);
                startActivity(goToTheUbatPamTurbuhaler); }});

        ubatPamAccuhaler = (Button) findViewById(R.id.ubatpamaccuhalerbutton);
        ubatPamAccuhaler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goToTheUbatPamAccuhaler = new Intent(getApplicationContext(),ubatPamAccuhaler.class);
                startActivity(goToTheUbatPamAccuhaler); }});

        ubatPamEasyhaler = (Button) findViewById(R.id.ubatpameasyhalerbutton);
        ubatPamEasyhaler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goToTheUbatPamEasyhaler = new Intent(getApplicationContext(),ubatPamEasyhaler.class);
                startActivity(goToTheUbatPamEasyhaler); }});

        penInsulinNovopen = (Button) findViewById(R.id.peninsulinnovopenbutton);
        penInsulinNovopen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goToThepenInsulinNovopen = new Intent(getApplicationContext(),penInsulinNovopen.class);
                startActivity(goToThepenInsulinNovopen); }});

        penInsulinAllstar = (Button) findViewById(R.id.peninsulinallstarbutton);
        penInsulinAllstar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent goToThepenInsulinAllstar = new Intent(getApplicationContext(),penInsulinAllstar.class);
                startActivity(goToThepenInsulinAllstar); }});

    }
}
