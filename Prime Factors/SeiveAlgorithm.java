public class SeiveAlgorithm {
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
    public static void main(String[] args) {
        int n = 10;
        int[] arr = seive(n);
        for(int i = 2; i <= n; i++){
            if(arr[i] == 1){
                System.out.println(i);
            }  
        }
    } 
}
