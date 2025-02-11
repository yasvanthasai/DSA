//You are given an integer array A of length N.
//You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
//For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
//More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
public class Solution {
    public long[] rangeSum(int[] a, int[][] b) {
        int n = a.length;
        long[] arr = new long[n];
        arr[0] = a[0];
        long[] c = new long[b.length];
        for(int i =1;i<n;i++){
            arr[i]=arr[i-1]+a[i];
        }
        for(int i =0;i<b.length;i++){
            int d = b[i][0];
            int e = b[i][1];
            if(d==0){
                c[i]=arr[e];
            }else{
            c[i] = arr[e]-arr[d-1];
            }
        }
        
        return c;
    }
        
}
