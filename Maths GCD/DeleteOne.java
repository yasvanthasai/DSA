/*Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD. */
public class DeleteOne {
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public int solve(int[] a) {
        int n = a.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = a[0];
        for(int i =1;i<n;i++){
            prefix[i] = gcd(a[i],prefix[i-1]);
        }
        suffix[n-1]=a[n-1];
        for(int j = n-2;j>=0;j--){
            suffix[j] = gcd(suffix[j+1],a[j]);
        }

        //prefix[i-1],suffix[i+1];
        int ans = 0;
        for(int k =0;k<n;k++){
            if(k==0){
                ans = Math.max(ans,suffix[k+1]);
            }else if(k==n-1){
                ans = Math.max(ans, prefix[k-1]);
            }else{
                ans = Math.max(ans,gcd(prefix[k-1],suffix[k+1]));

            }
            
        }

        return ans;


    }
    
}
