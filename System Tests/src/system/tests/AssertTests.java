/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PMPAdmin
 */
public class AssertTests {
    
    public AssertTests() {
    }

    @Test
    //assertArrayEquals
    public void testArray() throws Exception{
        String[] FirstArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        String[] SecondArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        //assert equivalency of arrays
        assertArrayEquals(FirstArray, SecondArray);
    }
    
    @Test
    //assert similarity & null
    public void testSimilarity() throws Exception{
        String firstElement = "Alpha";
        String secondElement = "Alpha";
        String thirdElement = "Bravo";
        String fourthElement = "Charlie";
        String fifthElement = "Delta";
        String sixthElement = null;
        
        //assert Methods
        assertSame(firstElement,secondElement);
        assertNotSame(secondElement,thirdElement);
        assertNotNull(thirdElement);
        assertNull(sixthElement);        
    }
    
    @Test
    //assert equivalency & boolean with simple calc
    public void testEquivalency() throws Exception{
        short firstNumber = 10;
        short secondNumber = 20;
        short thirdNumber = 30;
        short fourthNumber = 40;
        int firstCalculation = firstNumber + secondNumber;
        int secondCalculation = firstNumber + secondNumber + thirdNumber + fourthNumber;
        //assert Methods
        assertEquals(firstCalculation,thirdNumber);
        assertTrue(firstCalculation < fourthNumber);
        assertFalse(secondCalculation < firstCalculation);
    }
    
}