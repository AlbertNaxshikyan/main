package chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box Mybox1 = new Box();
        Box Mybox2 = new Box();
        double vol;
        vol = Mybox1.vole();
        System.out.print("Объем равен: " + vol);
        System.out.println();
        vol = Mybox2.vole();
        System.out.print("Объем равен: " + vol);

    }
}
