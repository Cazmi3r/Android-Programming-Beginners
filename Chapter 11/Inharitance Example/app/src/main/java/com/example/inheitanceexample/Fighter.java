package com.example.inheitanceexample;

import android.util.Log;

public class Fighter extends AlienShip {
    public Fighter (){
        super(200);
        Log.i("Location", "Fighter Constructor");
    }
    public void fireWeapon(){
        Log.i("Firing Weapon", "lasers firing");
    }
}
