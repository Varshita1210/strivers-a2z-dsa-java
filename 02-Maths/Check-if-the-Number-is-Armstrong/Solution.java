class Solution {
    public boolean isArmstrong(int n) {
     int original=n;
     int count=0;
     int temp=n;
     while(temp>0)
     {
         count++;
        temp=temp/10;
       
     }
     int sum =0;
     int temp=n;
     while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, count);
            temp = temp / 10;
        }

        return sum == original;
    }
    
}