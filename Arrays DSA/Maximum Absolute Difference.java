//You are given an array of N integers, A1, A2, .... AN.
//Return the maximum value of f(i, j) for all 1 ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
public class Solution {
    public int maxArr(int[] c) {
        int n = c.length;
        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;

        for(int i =0;i<n;i++){
            int a = c[i]+i;
            int b = c[i]-i;
            xMax = ((a>xMax)? a : xMax);
            xMin = ((a<xMin)? a : xMin);
            yMax = ((b>yMax)? b : yMax);
            yMin = ((b<yMin)? b : yMin);

        }
        int ans = Math.max(xMax-xMin,yMax-yMin);


        return ans;

    }
}
