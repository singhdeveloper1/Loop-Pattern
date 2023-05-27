public class looppattern37 {

//     *    
//    ***   
//   *****  
//    ***   
//   *****  
//  ******* 
//   *****  
//  ******* 
// *********
//    ***
//    ***
//    ***

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");

            }
            for (int l = i; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i <= 3; i++) {
            for (int k = 2; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + 3; j++) {
                System.out.print("*");

            }
            for (int l = i; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int k = 3; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
