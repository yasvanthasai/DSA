/*You have an array A with N elements. We have two types of operation available on this array :
We can split an element B into two elements, C and D, such that B = C + D.
We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
You have to determine whether it is possible to convert array A to size 1, containing a single element equal to 0 after several splits and/or merge?*/

class Solution {
    public string solve(List<int> a) {
        int n = a.Count;
        int count = 0;
        for(int i =0;i<n;i++){
            if(a[i]%2 ==1){
                count++;
            }
        }
        if(count%2==1){
            return "No";
        }else{
            return "Yes";
        }
    }
}
