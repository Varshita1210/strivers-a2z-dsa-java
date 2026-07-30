/*
Pattern:

1      1
12    21
123  321
12344321

*/

class Solution {

    public void pattern12(int n) {

        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            // Numbers increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Numbers decreasing
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

            space = space - 2;
        }
    }
}