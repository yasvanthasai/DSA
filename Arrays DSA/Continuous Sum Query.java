/*There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B*/
public class Solution {
    public int[] solve(int A, int[][] B) {
        int []arr=new int[A];
        int m=B.length;
        for(int l=0;l<A;l++){
            arr[l]=0;
        }
        int i,j,k;
        for(int n=0;n<m;n++){
            i=B[n][0];
            j=B[n][1];
            k=B[n][2];
            arr[i-1]+=k;
            if(j<A) arr[j]-=k;
        }
        for(int h=1;h<A;h++){
            arr[h]=arr[h-1]+arr[h];
        }
        return arr;
    }
}
