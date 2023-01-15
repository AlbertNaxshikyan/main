package chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box MyBox1 = new Box();
        Box MyBox2 = new Box();
        MyBox1.width = 10;
        MyBox1.height = 20;
        MyBox1.depth = 15;
        MyBox2.width = 3;
        MyBox2.height = 6;
        MyBox2.depth = 9;
        MyBox1.volume();
        MyBox2.volume();
    }

}
