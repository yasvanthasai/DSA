/*Given an array of integers A of size N containing GCD of every possible pair of elements of another array.
Find and return the original numbers used to calculate the GCD array in any order. For example, if original numbers are {2, 8, 10} then the given array will be {2, 2, 2, 2, 8, 2, 2, 2, 10}. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class AllGCDPair {
    public int gcd(int A, int B) {
        if (A == 0)
            return B;
        return gcd(B % A, A);
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Collections.sort(A, Collections.reverseOrder());

        for(int i =0;i<A.size();i++){
            if(hashMap.containsKey(A.get(i)) && hashMap.get(A.get(i))>0){
                hashMap.put(A.get(i),hashMap.get(A.get(i))-1);
            }else{
                for(int j =0;j<arr.size();j++){
                    int g  = gcd(A.get(i),arr.get(j));
                    if(hashMap.containsKey(g)){
                        hashMap.put(g,hashMap.get(g)+2);
                    }else{
                        hashMap.put(g,2);
                    }
                }
                arr.add(A.get(i));
            }
        }
        return arr;
    } 
}
