package com.example.inheitanceexample;

import android.util.Log;

public abstract class AlienShip {
    private static int numOfShips;
    private int shieldStrength;
    public String shipName;

    public AlienShip (int shieldStrength){
        Log.i("Location", "Alien ship constructor");
        numOfShips++;
        setShieldStrength(shieldStrength);
    }

    public abstract void fireWeapon();

    public static int getNumOfShips(){
        return numOfShips;
    }

    private void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
    public int getShieldStrength(){
        return shieldStrength;
    }
    public void hitDetection(){
        shieldStrength -= 25;
        Log.i("incoming", "BOOOOM");
        if (shieldStrength == 0){
            destroyShip();
        }
    }

    private void destroyShip() {
        numOfShips --;
        Log.i("Explosion", ""+this.shipName + "destroyed");
    }
}
