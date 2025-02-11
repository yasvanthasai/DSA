/*You are given an integer array A.

Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.

Return "YES" if it is possible; otherwise, return "NO" (without quotes).*/
public class Solution {
    public String solve(int[] A) {
        int n=A.length;
        if(n%2==0 && A[0]%2==0 && A[n-1]%2==0){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
