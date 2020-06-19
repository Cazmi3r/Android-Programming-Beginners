package com.example.accessscopethisandstatic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlienShip boyShip = new AlienShip();
        AlienShip girlShip = new AlienShip();
        boyShip.shipName = "bobby";
        girlShip.shipName = "kate";
        Log.i(""+girlShip.shipName+" Shields:",""+girlShip.getShieldStrength());
        Log.i(""+boyShip.shipName + " Shields:", ""+boyShip.getShieldStrength());
        Log.i("Number of ships",""+AlienShip.getNumOfShips());
        boyShip.hitDetection();
        boyShip.hitDetection();
        boyShip.hitDetection();
        boyShip.hitDetection();
        Log.i("Number of ships",""+AlienShip.getNumOfShips());
        girlShip.hitDetection();
        girlShip.hitDetection();
        girlShip.hitDetection();
        girlShip.hitDetection();
        Log.i("Number of ships",""+AlienShip.getNumOfShips());
    }
}
