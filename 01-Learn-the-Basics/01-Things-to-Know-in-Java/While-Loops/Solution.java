class Solution {
    public int whileLoop(int d) {
        // Your code goes here
        int sum=0;
        int current=d;
        int count=0;
        while( count<50){
        
        sum=sum+current;
        current=current+10;
        count++;
        }

        return sum;

    }
}