/*Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Note: Return the two numbers in ascending order.*/
public class SingleNumberIII {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] ans = new int[2];
        int xor = 0;
        for(int i = 0; i < n; i++) {
            xor ^= A[i];
        }
        int b = -1;
        for(int i = 0; i < 31; i++) {
            if(((xor >> i) & 1) == 1) {
                b = i;
                break;
            }
        }
        int x = 0;
        int y = 0;
        for(int i = 0; i < n; i++) {
            if(((A[i] >> b) & 1) == 1) {
                x ^= A[i];
            } else {
                y ^= A[i];
            }
        }
        ans[0] = Math.min(x,y);
        ans[1] = Math.max(x,y);
        return ans;
    }
    
}
