package com.tsi.brierley.sam.infiniteTerrainSim;

public class Location {
    //Attributes--------------------------------------------------
    public int xPosition;
    public int yPosition;
    //Constructor-------------------------------------------------

//    public Location (int xAxis, int yAxis){
//        this.xPosition=xAxis;
//        this.yPosition=yAxis;
//    }

    //Methods-----------------------------------------------------
    public int getXPosition(){
        return xPosition;
    }

    public void setXPosition(int newXPosition){
        xPosition = newXPosition;
    }

    public int getYPosition(){
        return yPosition;
    }

    public void setYPosition(int newYPosition){
        yPosition = newYPosition;
    }

    public void stayStill(){
        yPosition = yPosition;
        xPosition = xPosition;
    }
}
