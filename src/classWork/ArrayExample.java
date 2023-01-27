package classWork;

public class ArrayExample {
    public static void main(String[] args) {
 /*       int[] arrayFree = new int[5];

        arrayFree[0] = 25;
        arrayFree[1] = 10;
        arrayFree[2] = 3;
        for (int i = 0; i < arrayFree.length; i++) {
            System.out.println(arrayFree[i]);
       */
        int[] myArray = {2, 4, 8, 6, 10, 12, 14, 18, 16, 20};
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
            }
        }
        System.out.println();
        System.out.print("max:" + max);
    }
}

