/*We define f(X, Y) as the number of different corresponding bits in the binary representation of X and Y.
For example, f(2, 7) = 2, since the binary representation of 2 and 7 are 010 and 111, respectively. The first and the third bit differ, so f(2, 7) = 2.

You are given an array of N positive integers, A1, A2,..., AN. Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer modulo 109+7.*/

class Solution {
    public int cntBits(List<int> a) {
        const int MOD = 1000000007;
        long ans = 0;
        int n = a.Count;
        for(int i =0;i<32;i++){
            long count = 0;
            for(int j=0;j<n;j++){
               if ((a[j] & (1 << i)) != 0) {
                    count++;
                }
            }
            ans+=2*count*(n-count);
            ans%=MOD;
        }

        return (int)ans;

    }
}