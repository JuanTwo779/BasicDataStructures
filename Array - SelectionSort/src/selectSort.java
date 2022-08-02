import java.util.*;

public class selectSort {
    public static void main(String[] args)
    {
        Random objRand = new Random();
        int[] numbers = new int[objRand.nextInt(20)];
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = objRand.nextInt(100);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));

        selectSort(numbers);

        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
<<<<<<< HEAD
=======

>>>>>>> origin/main
    }

    public static void selectSort(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length-1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < inputArray.length; j++)
            {
                if(inputArray[j] < inputArray[minIndex])
                {
                    minIndex = j;
                }
            }
            int tempValue = inputArray[minIndex];
            inputArray[minIndex] = inputArray[i];
            inputArray[i] = tempValue;
        }
<<<<<<< HEAD
=======

>>>>>>> origin/main
    }
}

