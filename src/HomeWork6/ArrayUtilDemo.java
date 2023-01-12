package HomeWork6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {10, 16, 24, 7, 45, 36, 72, 53, 37, 58};
        ArrayUtil au = new ArrayUtil();
        au.maxOfArray(array);
        au.MinAndMaxValue(array);
        au.EvenNumbersValue(array);
        au.OddNumbers(array);
        au.AverageOfNumbers(array);
    }
}
