import java.util.*;

public class accessArray
{
    public static void main(String[] args)
    {
        Random rand = new Random(); //object from random class

        int[] numbers = new int[rand.nextInt(10) + 1];
        //nextInt includes 0
        System.out.println("The array size is: " + numbers.length);
        //creating array need to initialise size



        //adds numbers to array until it reaches the array's tail
        int counter = 0;
        while(counter < numbers.length)
        {
            numbers[counter] = rand.nextInt(10);
            counter++;
        }

        int pick = rand.nextInt(numbers.length);
        System.out.println("The " + pick + " array element: ");
        System.out.println(numbers[pick]);

    }
}
