package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box MyBox = new Box();
        double vol;
        MyBox.width = 10;
        MyBox.depth = 15;
        MyBox.height = 20;
        vol = MyBox.width * MyBox.height * MyBox.depth;
        System.out.println("Сумма равно: " + vol);
 
    }
}
