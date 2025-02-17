/*Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.*/

//Here I've used the sliding technique for considering specific windows. nOTE THAT minimum swaps can be at any indices in the array not only in the prefix part. That's the mistake I've made at the start.
public class Solution {
    public int solve(int[] a, int b) {
        int n = a.length;
        int count  =0;
        for(int i =0;i<n;i++){
            if(a[i]<=b) count++;
        }
        int l =0;
        int r =0;
        int x =0;
        while(r<count){
            if(a[r]>b){
                x++;
            }
            r++;
        }
        int ans = x;
        while(r<n){
        if(a[r] > b){ 
            x++;
        }
        if(a[l] > b){ 
            x--;
        }
            ans = Math.min(ans,x);
            l++;
            r++;
        }
        return ans;

    }
}
