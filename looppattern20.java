public class looppattern20 {
    public static void main(String[] args) {
        // E D C B A
        // E D C B
        // E D C
        // E D
        // E

        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'E'; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
