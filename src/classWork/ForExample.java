package classWork;

public class ForExample {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("i" + " " + i);
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.println("x" + " " + x);
            x = x + 1;
        }
        System.out.println("End For 1; 2.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("*");

            }

            System.out.println(" END FOR 3. ");
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k <= j; k++) {
                    System.out.print("# ");

                    }

                System.out.println();
                }
            System.out.println(" End ");
            for (int j = 5; j > 1; j--) {
                for (int k = 0; k < j; k++) {
                    System.out.print("#");

                }
                System.out.println();

                
            }


            }


        }


    }

