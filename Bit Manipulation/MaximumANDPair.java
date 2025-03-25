/*Given an array A. For every pair of indices i and j (i != j), find the maximum A[i] & A[j]. */
import java.util.ArrayList;

public class MaximumANDPair {
    public int solve(ArrayList<Integer> A) {
        if (A.size() < 2) return 0;
        
        int ans = 0;
        for (int b = 31; b >= 0; b--) {
            int count = 0;
            for (int i = 0; i < A.size(); i++) {
                count += ((A.get(i) >> b) & 1);
            }
            if (count >= 2) {
                ans |= (1 << b);
                for (int i = 0; i < A.size(); i++) {
                    if (((A.get(i) >> b) & 1) == 0) {
                        A.set(i, 0);
                    }
                }
            }
        }
        return ans;
    }
    
}
