//Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
public class Solution {
    public int solve(int[] a) {
        int n=a.length;
        int max = a[0];
        int min = a[0];
        for(int i =1;i<n;i++){
            max = (a[i] > max ? a[i] : max);
            min = (a[i] < min ? a[i] : min);
        }

        return max+min;
    }
}

