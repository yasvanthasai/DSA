/*Scooby has 3 three integers A, B, and C. Scooby calls a positive integer special if it is divisible by B and it is divisible by C. You need to tell the number of special integers less than or equal to A. */
public class DivisorGame {
    public int gcd(int A, int B) {
        if (A == 0)
            return B;
        return gcd(B % A, A);
    }
    public int solve(int A, int B, int C) {
        int count =0;
        int s = (B*C)/gcd(B,C);
        count = A/s;
        return count;
    }
}
