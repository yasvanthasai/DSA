//Maximum Sum Square SubMatrix
public class Solution {

    public int solve(int[][] a, int b) {
        int n = a.length;
        int m = a[0].length;
        int[][] p = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                int top = (i > 0) ? p[i-1][j] : 0;
                int left = (j > 0) ? p[i][j-1] : 0;
                int topLeft = (i > 0 && j > 0) ? p[i-1][j-1] : 0;
                p[i][j] = a[i][j] + top + left - topLeft;
            }
        }

        int ans =p[b-1][b-1];
        for (int i = b - 1; i < n; i++) {
            for (int j = b - 1; j < m; j++) {
                int current = p[i][j];
                if (i - b >= 0)
                    current -= p[i - b][j];
                if (j - b >= 0)
                    current -= p[i][j - b];
                if (i - b >= 0 && j - b >= 0)
                    current += p[i - b][j - b];
                ans = Math.max(ans, current);
            }
        }


        return ans;

        
        
    }
}
