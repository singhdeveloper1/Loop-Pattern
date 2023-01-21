public class looppattern16 {
    public static void main(String[] args) {
        // A
        // B A
        // C B A
        // D C B A
        // E D C B A
        // char k='A';
        // char n='A';
        for (char i = 'A'; i <= 'E'; i++) {
            // n=k;
            for (char j = i; j >= 'A'; j--) {
                System.out.print(j + " ");
                // n--;
            }
            // k++;
            System.out.println();
        }

    }

}
