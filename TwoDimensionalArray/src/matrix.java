
public class matrix {
    public static void main(String [] args)
    {
        //int [][] numberGrid = new int[5][3];
        int [][] numberGrid = {
                {1, 2, 3, 5, 6},
                {7, 9, 7},
                {8, 3, 4}};

        System.out.println(numberGrid[1][0]);
        //prints out the number in the second row and first column = 7

        for(int i = 0; i < numberGrid.length; i++) //first loop goes through the rows
        {
            for(int j = 0; j < numberGrid[i].length; j++) //second loop goes through the columns of the specific row
            {
                System.out.print(numberGrid[i][j] + ", ");
            }
            System.out.println("");
        }
    }
}

//For 2d arrays:
//The first loop will go over the rows (arrays)
//The second loop will go over the columns of the row