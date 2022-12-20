package HomeWorkOne;

public class FigurePainter {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        for (x = 0; x <= 4; x++) {
            for (y = 0; y <= x; y++) {
                System.out.print("* ");
            }
            System.out.println();

        }


        System.out.println();
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");

            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*"  );


            }
            System.out.println();


        }


    }
}