package com.example.inheitanceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fighter aFighter = new Fighter();
        Bomber bBomber = new Bomber();
        aFighter.shipName = "jap";
        bBomber.shipName = "big gay";
        Log.i("aFighter Shields", ""+aFighter.getShieldStrength());
        Log.i("bBomber Shields",""+bBomber.getShieldStrength());
        aFighter.fireWeapon();
        bBomber.fireWeapon();
        bBomber.hitDetection();
        bBomber.hitDetection();
        bBomber.hitDetection();
        bBomber.hitDetection();
    }
}
