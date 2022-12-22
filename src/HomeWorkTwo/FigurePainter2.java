package HomeWorkTwo;

public class FigurePainter2 {
    public static void main(String[] args) {
        int k = 4;
        for (int x = 0; x <= k; x++) {
            for (int l = 1; l <= x; l++) {
                System.out.print("  ");
            }
            for (int i = 4; i >= x; i--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(" New Figure2");
        {
            int n = 4;
            for (int i = 0; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            int l = 4;
            int x =0;
            for (int i = 0; i <= l; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = 4; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}



