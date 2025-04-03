public class PrimeModuloInverse {
    long power(long x, long y, long m){
        long ans = 1;
        x= x%m;
        while(y>0){
            if(y%2==1){
                ans = (ans * x)%m;
            }
            x = (x*x)%m;
            y/=2;
        }
        return ans;
    }
    public int solve(int a, int b) {
        return (int)power(a,b-2,b);
    }
}
