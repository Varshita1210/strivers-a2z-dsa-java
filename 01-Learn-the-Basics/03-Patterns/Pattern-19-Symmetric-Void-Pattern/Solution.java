/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        int n = 5;
        int space = 0;

        // Upper Half
        for (int i = 0; i < n; i++) {

            // Left Stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
            space = space + 2;
        }

        space = 2 * n - 2;

        // Lower Half
        for (int i = 1; i <= n; i++) {

            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            space = space - 2;
        }
    }
}