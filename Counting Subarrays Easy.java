/*Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.*/
public class Solution {
    public int solve(int[] a, int b) {
        int n = a.length;
        int count=0;
        for(int i =0;i<n;i++){
            int subSum = 0;
            for(int j =i;j<n;j++){
                subSum +=a[j];
                if(subSum<b) count+=1;

            }
        }
        return count;
        
    }
}
