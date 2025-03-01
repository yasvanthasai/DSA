//Given an array of integers, every element appears thrice except for one, which occurs once.
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> a) {
        int n =a.size();
        int ans =0;
        for(int i =0;i<32;i++){
            int count =0;
            for(int j =0;j<n;j++){
                count+=(a.get(j)>>i)&1;
            }
            if(count%3==1){
                ans = ans | (1<<i);
            }
        }

        return ans;
    }
}
