/*Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), …. */

public class MagicNumber {
    public int solve(int a) {
        int ans =0;
        for(int i =0;i<32;i++){ //access each binary bit
             if ((a & (1 << i)) != 0) { //check whether the bit is 1 or 0
                ans += Math.pow(5, i+1); //calculate the power and add to the answer
            }
        }
        return ans;
    }
    
}
