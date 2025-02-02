/*You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.*/
public class Solution {
    public int solve(int[] a) {
        int ans = -1;
        int n = a.length;
        long[] prefixSum = new long[n];
        long lsum=0;
        long rsum=0;
        prefixSum[0]=a[0];
        for(int i =1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+a[i];
        }
        for(int i =0;i<n;i++){
            lsum = (i == 0 ? 0 : prefixSum[i-1]);
            rsum = (i== n-1 ? 0 : prefixSum[n-1]-prefixSum[i]);
            if(lsum==rsum) return i;
        }

        return ans;

        
    }
}
