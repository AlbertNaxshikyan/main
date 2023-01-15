package chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box MyBox1 = new Box();
        Box MyBox2 = new Box();
        double vol;
        MyBox1.width = 10;
        MyBox1.height = 15;
        MyBox1.depth = 20;
        vol = MyBox1.width * MyBox1.height * MyBox1.depth;
        System.out.println("MyBox1 summa: " + vol);
        MyBox2.width = 3;
        MyBox2.height = 9;
        MyBox2.depth = 6;
        vol = MyBox2.depth * MyBox2.height * MyBox2.width;
        System.out.println("MyBox2 sum: " + vol);
    }
}
