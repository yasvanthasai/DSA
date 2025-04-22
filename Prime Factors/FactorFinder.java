import java.util.*;

public class FactorFinder {

    private static int countOfFactors(int n) {
        int count = 0;
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i!=n/i){
                    count+=2;
                }else{
                    count+=1;
                }
            }
        }
        return count;
    }

    public static List<Integer> findFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i=1; i*i<=n;i++) {
            if (n%i==0) {
                factors.add(i);
                if (i!=n/i) { 
                    factors.add(n/i);  
                }
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> factors = findFactors(n);
        int count = countOfFactors(n);
        System.out.println("Factors of "+n+": "+factors);
        System.out.println("Count of factors of "+n+": "+count);
    }
}