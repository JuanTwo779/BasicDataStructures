import java.util.*;

public class array1
{
    public static void main(String[] args)
    {
        Random rand = new Random(); //object from random class

        int[] numbers = new int[rand.nextInt(100)];
        System.out.println("The array size is: " + numbers.length);
        //creating array need to initialise size



        //adds numbers to array until it reaches the array's tail
        int counter = 0;
        while(counter < numbers.length)
        {
            numbers[counter] = rand.nextInt(10);
            counter++;
        }

        System.out.println("The numbers in the array are: ");
        for (int i = 0; i < numbers.length; i++)
        {
            if(i > 0)
                System.out.print(", ");
            System.out.print(numbers[i]);
        }

    }
}
