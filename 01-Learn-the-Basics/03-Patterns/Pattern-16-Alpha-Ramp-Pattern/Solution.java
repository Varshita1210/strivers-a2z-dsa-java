/*
Pattern:

A
B B
C C C
D D D D
E E E E E

*/

class Solution {

    public void pattern16(int n) {

        for (int i = 0; i < n; i++) {

            char ch = (char) ('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}