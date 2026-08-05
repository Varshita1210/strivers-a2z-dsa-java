class Solution {
    public int[] divisors(int n) {
     
        int count = 0;

      
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] ans = new int[count];
        int index = 0;

       
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ans[index] = i;
                index++;
            }
        }

        return ans;
    }
}

    