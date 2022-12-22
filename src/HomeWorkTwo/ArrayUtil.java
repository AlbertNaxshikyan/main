package HomeWorkTwo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array1 = {10, 16, 24, 7, 45, 36, 72, 53, 37, 58};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
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
        System.out.println(" Min:" + min);
    }
}

