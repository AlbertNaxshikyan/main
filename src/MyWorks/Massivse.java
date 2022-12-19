package MyWorks;

public class Massivse {
    public static void main(String[] args) {
        int myInt = 10; // Примитивный тип данных myInt присваивается = 10.
        int[] numbers = new int[8]; // Ссылочный тип данных, numbers -> ( ссылается на массив), они не присваиваются.
        // System.out.println(numbers[0]);  отчет индекса всегда с 0... 0.1.2.3.4.
        // System.out.println(numbers[7]);  выдает ошибку если массив будет 8 тк начинается с 0 -7.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();



    }
}
