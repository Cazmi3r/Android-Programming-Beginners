package com.example.basicclasses;

import android.util.Log;

public class Soldier {
    int mHealth;
    String mSoldierType;

    void shootEnemy(){
        //pew pew
        Log.i(mSoldierType, "is shooting");
    }
}
