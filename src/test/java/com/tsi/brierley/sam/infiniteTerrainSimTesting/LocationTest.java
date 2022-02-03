package com.tsi.brierley.sam.infiniteTerrainSimTesting;
import com.tsi.brierley.sam.infiniteTerrainSim.Location;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {

    @Test
    public void test_get_x_position(){
        Location testLocation = new Location(4,4);
        testLocation.getXPosition();
        assertEquals(4, testLocation.getXPosition(),
                "The expected x position was wrong");
    }

    @Test
    public void test_set_x_position(){
        Location testLocation = new Location(4,4);
        testLocation.setXPosition(5);
        assertEquals(5, testLocation.getXPosition(),
                "The expected x position was wrong");
    }

    @Test
    public void test_get_y_position(){
        Location testLocation = new Location(4,4);
        testLocation.getYPosition();
        assertEquals(4, testLocation.getYPosition(),
                "The expected x position was wrong");
    }

    @Test
    public void test_set_y_position(){
        Location testLocation = new Location(4,4);
        testLocation.setYPosition(5);
        assertEquals(5, testLocation.getYPosition(),
                "The expected x position was wrong");
    }
}
