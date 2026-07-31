/*
Pattern:

A B C D E
A B C D
A B C
A B
A

*/

class Solution {

    public void pattern15(int n) {

        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}