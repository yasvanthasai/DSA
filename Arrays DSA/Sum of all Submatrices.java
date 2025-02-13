//Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
//here I used the top left and bottom right method, contribution technique and also number of time a elemeent is repeating in the submatrices.
public class Solution {
    public int solve(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int ans = 0;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                ans+=a[i][j]*(i+1)*(j+1)*(n-i)*(m-j);

            }
        }
        
    return ans;
    }
}
