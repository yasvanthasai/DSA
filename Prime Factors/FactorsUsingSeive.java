import java.util.Arrays;

public class FactorsUsingSeive {
    public static int[] seive(int n){
        int[] isPrime = new int[n+1];
        isPrime[0] = 0;
        isPrime[1] =0;
        for(int i = 2; i <= n; i++){
            isPrime[i] = 1;
        }
        for(int j =2;j<=Math.sqrt(n);j++){
            if(isPrime[j]==1){
                for(int k =j*j;k<=n;k+=j){
                    isPrime[k]=0;
                }
            }
        }
        return isPrime;
    }

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

    private static int[] countOfFactorsUsingSeive(int n ){
        int[] ans = new int[n+1];
        Arrays.fill(ans,0);
        for(int i =1;i*i<n;i++){
            ans[i*i]+=1;
            for(int j =i*i+i;j<=n;j+=i){
                ans[j]+=2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = countOfFactorsUsingSeive(n);
        for(int i = 0; i <=n; i++){
            System.out.println("Number of factors of " + i + ": " + arr[i]);
        }
    } 


    
}
