/*Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.
Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.
NOTE:
Rows are numbered from top to bottom, and columns are numbered from left to right.
The sum may be large, so return the answer mod 109 + 7.
Also, select the data type carefully, if you want to store the addition of some elements.
Indexing given in B, C, D, and E arrays is 1-based.
Top Left 0-based index = (B[i] - 1, C[i] - 1)
Bottom Right 0-based index = (D[i] - 1, E[i] - 1)*/
public class Solution {
    static int mod=1000000007;
    public static long[][] prefixsum(int[][]a){
        int n = a.length;
        int m = a[0].length;
        long[][] p = new long[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                long top = (i > 0) ? p[i-1][j] : 0;
                long left = (j > 0) ? p[i][j-1] : 0;
                long topLeft = (i > 0 && j > 0) ? p[i-1][j-1] : 0;
                p[i][j] = (a[i][j] + top + left - topLeft + mod) % mod;
            }
        }
        // bd ce are pairs
        return p;
    }
    public int[] solve(int[][] a, int[] b, int[] c, int[] d, int[] e) {
        long [][] pr=prefixsum(a);
        int[] res = new int[b.length];
        for(int i =0;i<b.length;i++){
            /*int x1 = b[i];
            int y1 = c[i];
            int x2 = d[i];
            int y2 = e[i];
            long ans = pr[x2][y2] - pr[x2][y1 - 1] - pr[x1 - 1][y2] + pr[x1 - 1][y1 - 1];
            while(ans<0){
                ans+=mod;
            }
            ans%=mod;
            res[i]=(int)ans;*/
            int x1 = b[i] - 1;
            int y1 = c[i] - 1;
            int x2 = d[i] - 1;
            int y2 = e[i] - 1;
    
            long ans = pr[x2][y2];
            if (y1 > 0) ans -= pr[x2][y1 - 1];
            if (x1 > 0) ans -= pr[x1 - 1][y2];
            if (x1 > 0 && y1 > 0) ans += pr[x1 - 1][y1 - 1];
            
            ans = (ans % mod + mod) % mod;
            res[i] = (int) ans;
        }
        return res;
    }
    
}
