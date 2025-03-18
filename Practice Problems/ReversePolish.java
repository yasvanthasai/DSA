import java.util.Stack;

class Solution {
    boolean isOperator(String op){
        return (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"));
    }
    public int evalRPN(String[] A) {
         int len=A.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<len;i++){
            if(!st.isEmpty() && isOperator(A[i])){
                int val2=st.pop();
                int val1=st.pop();
                int x=0;
                if(A[i].equals("+")){
                    x = val1 + val2;
                }
                else if(A[i].equals("-")){
                    x = val1 - val2;
                }
                else if(A[i].equals("*")){
                    x = val1 * val2;
                }
                else if(A[i].equals("/")){
                    x = val1 / val2;
                }

                st.push(x);
            }
            else{
                st.push(Integer.parseInt(A[i]));
            }
        }
        return st.peek();
    }
}