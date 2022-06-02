package Lesson2;

import java.util.Arrays;

public class ArraysTroubles {

    public static void main(String[] args) {
        try {
            catchTheProblem();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static void catchTheProblem() throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        String[][] arr = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        int[][] arr2 = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                  sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Массив содержит текстовые значения " + i + " "+ j);
                }
                if (arr2.length != 4 || arr2[i].length != 4) {
                    throw new MyArraySizeException("Массив должен быть размером 4х4");
              }
            }
        } System.out.println(sum);
    }
}


