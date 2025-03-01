//Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
public class Solution {
    public int numSetBits(int a) {
        int count =0 ;
        while(a>0){
            if((a&1) ==1) count+=1;
            a = a>>1;
        }
        return count;
    }
}
