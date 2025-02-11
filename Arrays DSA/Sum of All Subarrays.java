/*You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.*/

//Below one is also correct solution but time limit exceeded for this code.
public class Solution {
    public long subarraySum(int[] a) {
        int n = a.length;
        long sum = 0;
        for(int i =0;i<n;i++){
            int subSum = 0;
            for(int j =i;j<n;j++){
                subSum +=a[j];
                sum+=subSum;

            }
        }
        return sum;


    }
}

//Next technique we can use is the contribution method
public class Solution {
    public long subarraySum(int[] a) {
        long n = a.length;
        long sum = 0;
        for(int i =0;i<n;i++){
            sum+=a[i]*(i+1)*(n-i);

        }
        return sum;


    }
}
