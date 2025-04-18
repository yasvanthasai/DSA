/*Given an array of integers A, find and return the count of divisors of each element of the array.
NOTE: The order of the resultant array should be the same as the input array.*/

import java.util.ArrayList;

public class CountOfDivisors {
    public int spf(int a){
        if (a < 2) return a;
        for(int i =2;i*i<=a;i++){
            if((a%i)==0){
                return i;
            }
        }
        return a;
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<A.size();i++){
            int num = A.get(i);
            int result = 1;
            while(num>1){
                int s = spf(num);
                int pow = 0;
                while(num%s==0){
                    pow++;
                    num/=s;
                }
                result *=(pow+1);
            }
            ans.add(result);
        }
        return ans;
    }

}
