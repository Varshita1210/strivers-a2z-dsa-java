/*
Pattern:

E
D E
C D E
B C D E
A B C D E

*/

class Solution {

    public void pattern18(int n) {

        for (int i = 0; i < n; i++) {

            for (char ch = (char) ('A' + n - i - 1); ch <= 'A' + n - 1; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}