package chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.setDim(10,15,20);
        mybox2.setDim(3,6,9);
        vol = mybox1.vole();
        System.out.print("Объем равен: " + vol);
        System.out.println();
        vol = mybox2.vole();
        System.out.print("Объем равен: " + vol);

    }
}
