/*Given an array of integers A, calculate the sum of A [ i ] % A [ j ] for all possible i, j pairs. Return sum % (109 + 7) as an output. */
public class ModSum {
    public int solve(int[] a) {
        final int MOD = 1000000007;
        int[] arr = new int[1001];
        for (int i = 0; i < a.length; i++) {
            arr[a[i]]++;
        }
        long ans = 0;

        for (int i = 0; i < 1001; i++) {
            for (int j = 1; j < 1001; j++) {
                ans = (ans + (long)(i % j) * arr[i] * arr[j]) % MOD;
            }
        }
        return (int) ans; 
    }
    
}
