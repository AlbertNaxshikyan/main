package HomeWork6;

public class ArrayUtil {
    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            System.out.print(" " + array[i]);
        }
    }

    void MinAndMaxValue(int[] array1) {
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        System.out.println(" \n Array 2 maximum value ");
        System.out.println("Max:" + max);
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
            }
        }
        System.out.println(" Array 3 minimum value ");
        System.out.println("Min:" + min);
    }

    void EvenNumbersValue(int[] array1) {
        int EvenNumbers = array1[0];
        int arrayCount = 0;
        int numberOdd = 0;
        System.out.print("EvenNumbers: ");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                arrayCount++;
                System.out.print(array1[i] + " ");
            }
        }
        System.out.print(" \nAmount of numbers:" + arrayCount);
        System.out.println();
    }

    void OddNumbers(int[] array1) {
        System.out.println("Вывести все нечетные числа массива");
        int oddNumbers = array1[0];
        int numberOdd = 0;
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] % 2 == 1) {
                System.out.print(array1[j] + " ");
                numberOdd++;
            }
        }
        System.out.println("\nNumber Odd:" + numberOdd);
    }

    void AverageOfNumbers(int[] array1) {
        double sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.print("Sum elements/amount elements: " + sum / array1.length);
        System.out.println("\nВывести сумму элементов массива:" + sum);
        System.out.println("Первый элемент массива:" + array1.length);
        int lastindex = array1.length - 1;
        System.out.println("Последний элемент массива:" + array1[lastindex]);
        int averageIndex = array1.length / 2;
        System.out.println("Средний элемент массива:" + array1[averageIndex]);
    }
}


