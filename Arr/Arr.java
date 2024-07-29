import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
    int[] myArray = { 4, 5, 1, 4, 5, 7, 9, 3, 4};

    int[][] my2DArray = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    //? ====== Loop Arrays ==============================================



    for (int i = 0; i < myArray.length; i++) {
        System.out.println("Element at index " + i + " : " + myArray[i]);
    }


    for (int i = 0; i < my2DArray.length; i++) { 
        for (int j = 0; j < my2DArray[i].length; j++) { 
            System.out.println("Element at [" + i + "][" + j + "] : " + my2DArray[i][j]);
        }
    }


    //? ====== Sort Arrays ==============================================


    Arrays.sort(myArray);

    System.out.println(Arrays.toString(myArray));   // [1, 3, 4, 4, 4, 5, 5, 7, 9]


    //? ====== Sort Reverse Arrays ==============================================



    }
}
