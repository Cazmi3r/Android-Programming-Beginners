package com.example.inheitanceexample;

import android.util.Log;

public class Bomber extends AlienShip{
    public Bomber (){
        super(100);
        Log.i("Location","Bomber Constructor");
    }
    public void fireWeapon(){
        Log.i("Firing Weapon", "bombs away!");
    }
}
