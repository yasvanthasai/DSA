/*Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.

Since the answer may be large, return the answer modulo (109 + 7).

Note: Ensure to handle integer overflow when performing the calculations. */

import java.util.Arrays;

public class PairSumDivisibleByM {
    public int solve(int[] a, int b) {
        final int MOD = 1000000007;
        int[] e = new int[b];
        Arrays.fill(e, 0);
        int n = a.length;
        for(int i =0;i<n;i++){
            int m = ((a[i] % b) + b) % b;
            e[m]++;

        }
        long ans = 0;
        ans+=((long)e[0]*(e[0]-1))/2;
        ans%= MOD;
        for (int i=1;i<=b/2;i++) {
            if(i == b - i){
                ans+=((long)e[i]*(e[i]-1))/2;
                ans %= MOD;
            }else{
                ans+=((long)e[i]*e[b-i]);
                ans %= MOD;

            }

            
        }

        return (int)ans;

    }
    
}
