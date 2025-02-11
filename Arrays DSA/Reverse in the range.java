//Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].
public class Solution {

    public static int[] solve(int[] A, int B, int C) {
        while(B<C){
            int temp = A[B];
            A[B]=A[C];
            A[C]=temp;
            B++;
            C--;
        }
        return A;
        
    }
}
