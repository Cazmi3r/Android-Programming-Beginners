package com.example.basicclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Soldier rambo = new Soldier();
        rambo.mHealth = 150;
        rambo.mSoldierType = "Green Beret";

        Soldier vassey = new Soldier();
        vassey.mSoldierType = "Sniper";
        vassey.mHealth = 50;

        Log.i("Rambo's health:", ""+rambo.mHealth);
        Log.i("Rambo's Type:", rambo.mSoldierType);
        Log.i("Vassey's health:", ""+vassey.mHealth);
        Log.i("Vassey's Type:", vassey.mSoldierType);

        rambo.shootEnemy();
        vassey.shootEnemy();

    }
}