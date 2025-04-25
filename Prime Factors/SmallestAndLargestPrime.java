import java.util.Arrays;

public class SmallestAndLargestPrime {
    public static int[] smallestPrime(int n) {
        int[] ans = new int[n+1];
        Arrays.fill(ans, 0);
        for (int i = 2; i <= n; i++) {
            if (ans[i] == 0) {
                for (int j = i; j <= n; j += i) {
                    if (ans[j] == 0) {
                        ans[j] = i;
                    }
                }
            }
        }
        return ans;
    }

    public static int[] largestPrime(int n) {
        int[] ans = new int[n+1];
        Arrays.fill(ans, 0);
        for (int i = 2; i <= n; i++) {
            if (ans[i] == 0) {
                for (int j = i; j <= n; j += i) {
                    ans[j] = i;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = smallestPrime(n);
        int[] arr1 = largestPrime(n);
        
        System.out.println("Smallest Prime Factor for each number:");
        for (int i = 2; i <= n; i++) {
            System.out.println("Number " + i + ": Smallest Prime Factor = " + arr[i]);
        }

        System.out.println();

        System.out.println("Largest Prime Factor for each number:");
        for (int i = 2; i <= n; i++) {
            System.out.println("Number " + i + ": Largest Prime Factor = " + arr1[i]);
        }
    } 
}

