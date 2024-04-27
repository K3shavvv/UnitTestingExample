package mes.practical.UnitTestingExample.set2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@springBootTest

public class findmaxtest {

    
    @Test
    public void testFindMax() {
        MaxFinder maxFinder = new MaxFinder();
        int[] numbers = {1, 3, 4, 2};
        int expectedResult = 4;
        int actualResult = maxFinder.findMax(numbers);
        assertEquals(expectedResult, actualResult);
    }
}
    
org.framework