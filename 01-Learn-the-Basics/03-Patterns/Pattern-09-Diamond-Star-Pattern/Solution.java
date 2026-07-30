/*
Pattern:

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/

class Solution {

    public void pattern9(int n) {

        // Upper Half
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");

            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            System.out.println();
        }

        // Lower Half
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++)
                System.out.print(" ");

            for (int j = 0; j < 2 * n - (2 * i + 1); j++)
                System.out.print("*");

            for (int j = 0; j < i; j++)
                System.out.print(" ");

            System.out.println();
        }
    }
}