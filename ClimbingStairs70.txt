class Solution {
    public int climbStairs(int n) {
        // the sequence is :
        //1, 2, 3, 5, 8, 13, 21...  --> fibonacci sequence

        // the firs 3 number is same as the input
        if (n <= 3) {
            return n;
        }

        // variabes to store the previous 2 values
        int a = 3;
        int b = 2;

        // for loop from 0 to n-3
        for (int i = 0; i < n - 3; i++) {
            
            // a holds the sum of previous 2 numbers
            a = a + b;
            // b holds just one values which is at index last - 1
            b = a - b;
        }

        // finally return a as output
        return a;
    }
}