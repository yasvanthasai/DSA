//Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

//Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.

//This below code is the basic brute force approcah
public class Solution {
    public int[] solve(int[] a) {
        int n= a.length;
        int product = 1;
        int[] ans = new int[n];
        for(int i  = 0; i<n;i++){
            product*=a[i];

        }
        for(int i =0;i<n;i++){
            ans[i]=product/a[i];
        }

        return ans;
    }
}
//Now I'll try doing this using the prefix sum technique.. here it's prefix product I guess. prefix prod and suffix prod method used
public class Solution {
    public int[] solve(int[] a) {
        int n= a.length;
        int[] prefixProd = new int[n];
        int[] suffixProd = new int[n];
        int[] ans = new int[n];
        prefixProd[0] = a[0];
        for(int i =1;i<n;i++){
            prefixProd[i]=prefixProd[i-1]*a[i];
        }
        suffixProd[n-1]=a[n-1];
        for(int i =n-2;i>0;i--){
            suffixProd[i]=suffixProd[i+1]*a[i];
        }
        for(int i =0;i<n;i++){
            if(i==0){
                ans[i]=suffixProd[i+1];
            }else if(i==n-1){
                ans[i]=prefixProd[i-1];
            }else{
                ans[i]= prefixProd[i-1]*suffixProd[i+1];

            }
            
        }

        return ans;


    }
}

