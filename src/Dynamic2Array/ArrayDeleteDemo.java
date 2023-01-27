package Dynamic2Array;

public class ArrayDeleteDemo {
    public static void main(String[] args) {
        ArrayDelete ad = new ArrayDelete();

        ad.add(1);
        ad.add(2);
        ad.add(3);
        ad.add(4);
        ad.add(5);
        ad.add(6);
        ad.add(7);
        ad.add(8);
        ad.add(9);
        ad.add(10);
        ad.add(11);
        ad.add(12);
        ad.add(13);
        ad.add(14);
        ad.print();
        ad.deleteByIndex(4);
        ad.print();
        ad.set(5,70);
        ad.print();
    }

}
