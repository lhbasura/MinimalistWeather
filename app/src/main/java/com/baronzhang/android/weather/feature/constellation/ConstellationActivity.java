package com.baronzhang.android.weather.feature.constellation;

import android.content.Intent;
import android.os.Bundle;

import com.baronzhang.android.weather.data.db.entities.minimalist.WeatherForecast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.baronzhang.android.weather.R;

public class ConstellationActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constellation);
        intent=getIntent();
        WeatherForecast weatherForecast= (WeatherForecast) intent.getSerializableExtra("weatherDetail");
        Toast.makeText(this,weatherForecast.toString(),Toast.LENGTH_SHORT).show();

    }


}
