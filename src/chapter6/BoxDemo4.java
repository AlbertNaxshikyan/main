package chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box Mybox1 = new Box();
        Box MyBox2 = new Box();
        double vol;
        Mybox1.width = 10;
        Mybox1.height = 20;
        Mybox1.depth = 15;
        MyBox2.width = 3;
        MyBox2.height = 6;
        MyBox2.depth = 9;
        vol = Mybox1.vole();
        System.out.print("Объем равен: " + vol);
        vol = MyBox2.vole();
        System.out.println();
        System.out.print("Объем равен: " + vol);
    }
}
