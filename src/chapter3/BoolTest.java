package chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println(" b equals " + b);

        b = true;
        System.out.println(" b equals " + b);
        if (b) {
            System.out.println(" This code is being executed");
        }
        b = false;
        if (b) {
            System.out.println(" this code is not running ");
        }

        System.out.println(" 10 > 9 равно " + (10 > 9));
    }
}

