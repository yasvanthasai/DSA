/*Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).






The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.*/
public class Solution {
    /*public static int[] reverse(int[] A){
         int n=A.length;
         int i=0;
         int j=n-1;
         while(i<j){
             int temp=A[i];
             A[i]=A[j];
             A[j]=temp;
             i++;
             j--;
         }
         return A;
         
     }*/
  
    public int[] plusOne(int[] a) {
        int carry = 1;
        int sum = 0;
        int n = a.length;
        //above 9 we need to have a carry or if ==10
        for(int i = n-1;i>=0;i--){
            sum = a[i]+carry;
            carry = 0;
            if(sum==10){
                carry = 1;
                a[i] = 0;
            }else{
                a[i]=sum;
            }
        }
        if(carry==1){
            int[] ans = new int[n+1];
            ans[0]=1;
            System.arraycopy(a,0,ans,1,n);
            return ans;
        }
        int lead = 0;
        while(lead<n&&a[lead]==0){


            lead++;
        }
         if (lead == n) {
        return new int[]{0};
    }
        int[] ans = new int[n-lead];
        System.arraycopy(a,lead,ans,0,n-lead);

        return ans;






        
}
}
