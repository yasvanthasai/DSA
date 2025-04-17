/*You are given two positive numbers A and B . You need to find the maximum valued integer X such that:

X divides A i.e. A % X = 0
X and B are co-prime i.e. gcd(X, B) = 1 */
public class LargestCoPrimeDivisor {
    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public int cpFact(int a, int b) {
        while(gcd(a,b)!=1){
            a= a/ gcd(a,b);
        }

        return a;
    }
}
