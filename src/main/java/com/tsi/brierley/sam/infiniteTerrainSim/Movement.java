package com.tsi.brierley.sam.infiniteTerrainSim;
import com.tsi.brierley.sam.infiniteTerrainSim.Location;

public class Movement {
    //Attributes --------------------------------------


    Location location = new Location();
    //Constructor -------------------------------------
    public Movement(String move){
        Directions newMove = Directions.valueOf(move);
        switch(newMove){
            case UP:
                location.setYPosition(location.getYPosition()+1);
                break;
            case DOWN:
                location.setYPosition(location.getYPosition()-1);
                break;
            case LEFT:
                location.setXPosition(location.getXPosition()-1);
                break;
            case RIGHT:
                location.setXPosition(location.getXPosition()+1);
                break;
            default:
                location.stayStill();
                break;

        }
    }

    //Methods -----------------------------------------

}
