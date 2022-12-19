package MyWorks;

public class If {
    public static void main(String[] args) {
        int a = 25;
        if (a > 15) {
            System.out.println("Yes");
            int b = 23;
            if (b == 15) {
                System.out.println("Yes");
                if (b<15){        // if- Если.
                    System.out.println(" No");
                }else {           // else -Иначе.
                    System.out.println(" Они не верны");
                }
            }

        }
    }
}
