package chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1(10,15,20);
        Box1 myBox2 = new Box1(3,6,9);
        double vol;
        vol = myBox1.vole();
        System.out.print("Объем равен: " + vol);
        System.out.println();
        vol = myBox2.vole();
        System.out.print("Объем равен: " + vol);
    }
}
