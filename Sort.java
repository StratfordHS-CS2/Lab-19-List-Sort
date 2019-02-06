import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Sort
{
    public static ArrayList<Integer> randomFill()
    {
        // fill a temporary Arraylist with 100 random integers between 1 and 100 and return it
        // Create a temporary ArrayList<Integer>
        // Add 100 random integers between 1 and 100 into the temporary ArrayList.
        // int num = ThreadLocalRandom.current().nextInt(1, 100);
        // return the temporary ArrayList
    }

    public static void doSort( ArrayList<Integer> al)
    {
        // set a flag variable that tells you if the ArrayList is sorted or not.
        // start with the list being unsorted.
        // while the variable says the list is not sorted
        //   switch the flag variable to say the list is sorted, then we will
        //     check and see if it is or not.  If we have to do any swaps, the
        //     list is not sorted and we need to set the variable accordingly.
        //   loop through the whole list, if two adjacent values are out of order
        //     then swap them.
        // if you make it all the way through the loop without resetting the flag
        //   variable to unsorted, then you are done.

        // to swap variables a and b:
        // c = a; a = b; b = c;
    }

    /**
     * You do not need to edit the main method
     *
     * @param args not used
     */
    public static void main( String[] args )
    {
        ArrayList<Integer> numList;
        numList = randomFill();
        System.out.println("Unsorted: " + numList);
        doSort(numList);
        System.out.println("Sorted:   " + numList);
    }
}
