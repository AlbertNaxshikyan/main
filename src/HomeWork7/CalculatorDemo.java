package HomeWork7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator ForComputer = new Calculator();
        double vol;
        vol = ForComputer.divide(20, 2.5);
        System.out.println("Divide1: " + vol);
        vol = ForComputer.divide(40, 20);
        System.out.println("Divide2: " + vol);

        vol = ForComputer.multiply(5, 20);
        System.out.println("Multiply1: " + vol);
        vol = ForComputer.multiply(2, 3);
        System.out.println("Multiply2: " + vol);

        vol = ForComputer.plus(34, 56);
        System.out.println("Plus1: " + vol);
        vol = ForComputer.plus(5, 6);
        System.out.println("Plus2: " + vol);

        vol = ForComputer.minus(30, 15);
        System.out.println("Minus1:" + vol);
        vol = ForComputer.minus(85, 35);
        System.out.println("Minus2: " + vol);

        vol = ForComputer.divideTest(85,0);
        System.out.println(vol);


    }
}
