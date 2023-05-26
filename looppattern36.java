public class looppattern36 {
    public static void main(String[] args) {

        // A B C D E F G G F E D C B A
        // _ A B C D E F F E D C B A
        // _ _ A B C D E E D C B A
        // _ _ _ A B C D D C B A
        // _ _ _ _ A B C C B A
        // _ _ _ _ _ A B B A
        // _ _ _ _ _ _ A A

        for (char i = 'G'; i >= 'A'; i--) {
            for (char k = 'F'; k >= i; k--) {
                System.out.print("  ");
            }
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (char j = i; j >= 'A'; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
