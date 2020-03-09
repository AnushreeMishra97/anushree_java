package day2.assignment1;

public class ArrayPopulation {

    public int[] populateArray(int array1[], int array2[]) {
        int n = array1.length;
        int resultArray[] = new int[n + n];
        //odd position
        for (int i = 0, j = 0; i < resultArray.length; i = i + 2, j++) {
            resultArray[i] = array1[j];
        }
        //even position
        for (int i = 1, j = 0; i < resultArray.length; i = i + 2, j++) {
            resultArray[i] = array2[j];
        }


        return resultArray;
    }

    //For printing the array
    public void print(int resultantArray[]) {
        for (int i = 0; i < resultantArray.length; i++) {
            System.out.println("Array elements are" + resultantArray[i]);
        }

    }
}






