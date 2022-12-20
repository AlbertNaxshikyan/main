package HomeWorkOne;

public class IfForExample {
    public static void main(String[] args) {
        int x = 25;
        int y = 65;
        System.out.println("Maximum value: " + y);
        System.out.println(" Задача с макс значением окончена ");
        System.out.println();

        {
            int a = 250;
            int b = 400;
            if (a > b) {
                System.out.println("a меньше b ");
            }
            if (a < b) {
                System.out.println("Yes ");

            }
            if (a <= b) {
                System.out.println("Верно ");
                a = a * 2;
            }
            if (a == b) {
                System.out.println(" Верно ");

            } else {
                System.out.println("a не может быть равен b");
            }
            System.out.println();
        }
        System.out.println(" Start cycle ");
        int b = 10;
        for (int a = 5; a <= b; a++) {

            System.out.print(a + ",");
        }
        System.out.println();

        {
            System.out.println();
            System.out.println("Start char ");
            char a = 'a';
            int ia = (char) a;
            a = 35;
            System.out.println(a);
            a++;
            System.out.println(a);
        }

    }
}