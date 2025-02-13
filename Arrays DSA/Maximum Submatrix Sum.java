//Given a row-wise and column-wise sorted matrix A of size N * M.
//Return the maximum non-empty submatrix sum of this matrix.

//this is the suffix sum tehcnique....first calculate last veritical and horizaontal and from there calculate the suffix sum

public class Solution {
    public long solve(int[][] a) {
        int n=a.length;
         int m=a[0].length;
         long[][] s = new long[n][m];
         s[n-1][m-1]=a[n-1][m-1];
         long ans=s[n-1][m-1];

         for(int i =n-2;i>=0;i--){
             s[i][m-1]=s[i+1][m-1]+a[i][m-1];
             ans= Math.max(ans,s[i][m-1]);
         }

       for (int j = m - 2; j >= 0; j--) {
            s[n - 1][j] = a[n - 1][j] + s[n - 1][j + 1];
            ans = Math.max(ans, s[n - 1][j]);
        }


         for(int i =n-2;i>=0;i--){
             for(int j =m-2;j>=0;j--){
                 s[i][j]=a[i][j]+s[i+1][j]+s[i][j+1]-s[i+1][j+1];
                 ans= Math.max(ans,s[i][j]);


             }
         }
         return ans;

    }
}

