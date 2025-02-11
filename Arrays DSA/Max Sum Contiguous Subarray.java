//Find the maximum sum of contiguous non-empty subarray within an array A of length N.
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] a) {
        int n = a.length;
        int ans = a[0];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum +=a[i];
            ans = (ans>sum ? ans : sum);
            if(sum<0){
                sum=0;
            }
        }

    return ans;
    }
}
