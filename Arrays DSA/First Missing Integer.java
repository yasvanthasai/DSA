/*Given an unsorted integer array, A of size N. Find the first missing positive integer.
Note: Your algorithm should run in O(n) time and use constant space.*/


//this technique we can also use for... number of swaps required to make the number equal to the index in the array.
public class Solution {
    public static void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
    
    public int firstMissingPositive(ArrayList<Integer> A) {
        int n = A.size();
        
        for (int i = 0; i < n; i++) {
            while (A.get(i) >= 1 && A.get(i) <= n && A.get(i) != A.get(A.get(i) - 1)) {
                swap(A, i, A.get(i) - 1);
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (A.get(i) != i + 1) {
                return i + 1;
            }
        }
        
        return n + 1;
    }
}
