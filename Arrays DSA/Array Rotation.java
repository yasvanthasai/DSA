//Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
public class Solution {
    public int[] solve(int[] a, int b) {
        int n = a.length;
        if(b==n) return a;
        int i =0;
        int j =n-1;
        while(i<n/2){
            int temp = a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
            j--;
        }
        i=0;
        b = b%n;
        j=b-1;
        while(i<j){
            int temp = a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
            j--;
        }

        i=b;
        j=n-1;

        while(i<j){
            int temp = a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
            j--;
        }

        return a;



       
    }
}
