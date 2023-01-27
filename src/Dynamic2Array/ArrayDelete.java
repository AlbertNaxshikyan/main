package Dynamic2Array;

public class ArrayDelete {
    private int[] array = new int[10];
    private int size = 0;

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong Index: ");
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size - 1; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong index");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];

        }
        size--;

    }

    public void set(int index, int value) {
        if (index<size || index> size -1 ){
            System.out.println("Wrong index");

        }
        array[index] = value;

    }
}
