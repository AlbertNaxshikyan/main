package HomeWorkTwo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array1 = {10, 16, 24, 7, 45, 36, 72, 53, 37, 58};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(",");
            } else {
                System.out.print(". ");
            }
        }
        System.out.println("");
        System.out.println();
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        System.out.println(" Array 2 maximum value ");
        System.out.println("Max:" + max);
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
            }

        }
        System.out.println(" Array 3 minimum value ");
        System.out.println("Min:" + min);

        System.out.println("Вывести все четные числа массива ");
        int EvenNumbers = array1[0];
        int arrayCount = 0;
        int numberOfOdd = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                System.out.print(array1[i]);
                arrayCount++;
                if (i != array1.length - 1) {
                    System.out.print(",");
                } else {
                    System.out.print(".");
                }
            }
        }
        System.out.print(" \namount of numbers:" + arrayCount);
        System.out.println();

        System.out.println("Вывести все нечетные числа массива");
        int oddNumbers = array1[0];
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] % 2 == 1) {
                System.out.print(array1[j]);
                numberOfOdd++;
                if (j != array1.length - 2) {
                    System.out.print(",");
                } else {
                    System.out.print(".");
                }
            }
        }
        System.out.println("\n Number Odd:" + numberOfOdd);

        System.out.println("Среднее арифмитическое всех чисел:");
        double sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.print("Sum elements/amount elements: " + sum / array1.length);
        System.out.println("\nВывести сумму элементов массива:" + sum);
        //  int suma = 0;
        //   for (int i = 0; i < array1.length; i++) {
        //     suma = suma + array1[i];
        //}
        // System.out.println("Sum of array elements: " + suma);
        System.out.println("Первый элемент массива:" + array1.length);
        int lastindex = array1.length - 1;
        System.out.println("Последний элемент массива:" + array1[lastindex]);
        int averageIndex = array1.length / 2;
        System.out.println("Средний элемент массива:" + array1[averageIndex]);
    }
}





