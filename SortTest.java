import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The test class SortTest.
 *
 * @author  Dave Avis
 * @version 2.5.2019
 */
public class SortTest
{
    /**
    * Testing randomFill()
    */
    @Test(timeout=2000)
    public void randomFillTest()
    {
        ArrayList<Integer> temp;
        Sort s = new Sort();
        temp = s.randomFill();

        assertFalse( "numList does not appear to be randomly filled.", 
            (temp.get(0).equals(temp.get(25))) && 
            (temp.get(50).equals(temp.get(75)) ) 
        );
        assertEquals( "numList does not have 100 values.", 100, temp.size() );
    }

    /**
    * Testing doSort()
    */
    @Test(timeout=3000)
    public void doSortTest()
    {
        ArrayList<Integer> temp;
        Sort s = new Sort();
        temp = s.randomFill();
        s.doSort(temp);
        for( int i = 0; i < temp.size() - 1; i++ )
        {
            if(temp.get(i) > temp.get(i+1) )
            {
                fail("numList is not sorted.");
            }
        }
    }
}
