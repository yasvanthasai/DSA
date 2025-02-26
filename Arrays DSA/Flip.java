/*You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.





Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.*/
public class Solution {
    public int[] flip(String A) {
         int n=A.length(); //finding length
        int l=0,r=0,cu=0,max=0; //initialization
        int[] res=new int[2]; //answer array for the indices
        for(int i=0;i<n;i++){ //going through all elements in array
            char ch=A.charAt(i);
            if(ch=='1') cu-=1; //-1 if it's a one, becasue in the end we're going to flip it 
            else  cu+=1; //+1 becasue we can converting 0's into 1's and that will add up to the answer
            if(cu>max){ //Kadane's algorithm here, only things is we need to trap the indices too.
                max=cu; //it's exactly like finding the maximum subarray sum but with 0's and 1's (flip case too)
                res[0]=l;
                res[1]=r;
            }
            if(cu<0) {
                cu=0;
                l=i+1;
                r=i+1;}
            else{
                r=r+1;
            }
        }
        res[0]+=1;
        res[1]+=1;
        if(max==0) return new int[0];
        else  return res;
    }
}
