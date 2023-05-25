public class looppattern34 {
    public static void main(String[] args) {
        // _ _ _ _ 1 _ _ _ _
        // _ _ _ 1 2 1 _ _ _
        // _ _ 1 2 3 2 1 _ _
        // _ 1 2 3 4 3 2 1 _
        // 1 2 3 4 5 4 3 2 1

        for (int i = 1; i <= 5; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // for(int k=4;k>=i;k--)
            // {
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }

}
