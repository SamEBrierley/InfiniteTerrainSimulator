package com.tsi.brierley.sam.infiniteTerrainSimTesting;
import com.tsi.brierley.sam.infiniteTerrainSim.Location;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {

    @Test
    public void test_get_xposition(){
        Location testLocation = new Location(4,4);
        testLocation.getXPosition();
        assertEquals(4, testLocation.getXPosition(),
                "The expected x position was wrong");
    }
}
