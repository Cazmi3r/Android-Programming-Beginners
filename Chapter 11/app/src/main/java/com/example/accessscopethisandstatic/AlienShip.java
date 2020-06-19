package com.example.accessscopethisandstatic;

import android.util.Log;

public class AlienShip {
    private static int numOfShips;
    private int shieldStrength;
    public String shipName;

    public AlienShip(){
        numOfShips++;
        this.setShieldStrength(100);
    }

    private void setShieldStrength(int shieldStrength){
        this.shieldStrength = shieldStrength;
}
    public int getShieldStrength(){
        return this.shieldStrength;
    }
    public static int getNumOfShips(){
        return numOfShips;
    }
    public void hitDetection(){
        this.shieldStrength -= 25;
        Log.i("Incoming","BAM!");
        if (this.shieldStrength == 0){
            destroyShip();
        }
    }
    private void destroyShip(){
        numOfShips -=1;
        Log.i("Explosion:", ""+this.shipName+" destroyed!");
    }
}
