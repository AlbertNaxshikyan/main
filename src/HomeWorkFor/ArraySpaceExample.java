package HomeWorkFor;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        for (int i = 1; i < spaceArray.length - 1; i++) {
            if (spaceArray[i] == spaceArray[i + 1]) {
                continue;

            }
            char[] newArray = new char[spaceArray.length];
             System.out.print(spaceArray[i]);
        }
    }
}



