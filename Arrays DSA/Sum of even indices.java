/*You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].

Note : Use 0-based indexing*/
public class Solution {
    public int[] solve(int[] a, int[][] b) {
        int n = a.length;
        int m = b.length;
        int[] ans = new int[m];
        int[] prefixSum = new int[n];
        prefixSum[0] = a[0];
        for(int i =1;i<n;i++){
            prefixSum[i] = ((i%2==0)? prefixSum[i-1]+a[i] : prefixSum[i-1]);
        }
        for(int i =0;i<m;i++){
            int l = b[i][0];
            int r = b[i][1];
            int sum = (l==0 ? prefixSum[r] :prefixSum[r]-prefixSum[l-1]);
            ans[i] = sum;

        }
        return ans;
    }

}
