public class VeryLargePower {
    private long factorialMod(long B, long MOD){
        long ans = 1;
        for(int i =1;i<=B;i++){
            ans= (ans * i )%MOD;
        }
        return ans;

    }
    private long powerMod(long A, long B, long MOD){
        long ans = 1;
        A = A%MOD;
        while(B>0){
            if((B&1)==1){
                ans = (ans * A)%MOD;
            }
            A = (A*A)%MOD;
            B>>=1;
        }

        return ans;

    }
    public int solve(int A, int B) {
        long MOD = 1000000007;
        long MOD_MINUS_1 = MOD - 1;
        long factorialModResult = factorialMod(B, MOD_MINUS_1);
        long result = powerMod(A, factorialModResult, MOD);

        return (int)result;
        
    }
    
}
