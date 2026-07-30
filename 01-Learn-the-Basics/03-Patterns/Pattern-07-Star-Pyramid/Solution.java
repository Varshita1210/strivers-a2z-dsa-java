/*
Pattern:

    *
   ***
  *****
 *******
*********

*/

class Solution {

    public void pattern7(int n) {

        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}