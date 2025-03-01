//Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> a) {
        int n = a.size();
        int ans =0;
        for(int i =0;i<n;i++){
            ans^=a.get(i);
        }
        
        return ans;
    }
}
