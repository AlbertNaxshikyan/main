package HomeWorkFor;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int num = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = num;
                }

            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            for (int j = 1; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    if (numbers[j] < numbers[k]) {
                        int num = numbers[j];
                        numbers[j] = numbers[k];
                        numbers[k] = num;
                    }

                }

            }
        }
        System.out.println();
           for (int j = 0; j < numbers.length; j++) {
        System.out.print(numbers[j] + " ");

    }
  }
}




