package HomeWorkFree;

public class CharArrayExample {
    public static void main(String[] args) {
        char chars[] = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};
        char c = 'o';
        int count = 0;
        for (int x : chars) {
            if (x == c) {
                count++;
            }
        }
        System.out.println("Символ o используется  : " + count);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};
        System.out.print("Средние два элемента: " + chars2[chars2.length / 2] + " " + chars2[chars2.length / 2 - 1]);
        System.out.println(" ");
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.println( chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l');

        char[] chars4 = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (char c1 : chars4) {
            if (c1 != ' ') {
                System.out.print(c1);
            }

        }
    }
}











