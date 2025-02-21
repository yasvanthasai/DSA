/*Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.

Your task is to calculate the total amount of water that can be trapped in these valleys.*/

public class Solution {
    public int trap(final int[] a) {
        int  n = a.length;
        int[] r = new int[n];
        int ans = 0;
        r[n-1]=a[n-1];
        for(int i =n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],a[i]);

        }
        int maxl = a[0];
        for(int i =0;i<n;i++){
            maxl = Math.max(maxl, a[i]); 
            ans += Math.min(maxl, r[i]) - a[i];
        }

        return ans;
    }
}
