/*Given an array of non-negative integers A where each element represents your maximum jump length at that position.
The initial position is the first index of the array, and the goal is to reach the last index of the array with the minimum number of jumps.
Note: If it is not possible to reach the last index, return -1 instead.*/
public class Solution {
    public int solve(int[] a) {

        int n =a.length;
        int ans =0;
        int l =0;
        int r =0;
        while(r<n-1){
            int far = 0;
            for(int i =l;i<r+1;i++){
                far = Math.max(far,i+a[i]);
            }
             ans+=1;
            if (far <= r) {
            return -1;
            }
            if (far >= n - 1) {
            return ans;
            }   
            l =r+1;
            r = far;
           
        }
        if(r==0){
            return -1;
        }
        return ans+1;
    }
}
