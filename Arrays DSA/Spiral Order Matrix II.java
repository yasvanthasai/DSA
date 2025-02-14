public class Main {
    public static void main(String[] args) {
        int input = 5;
        Solution solution = new Solution();
        int[][] matrix = solution.generateMatrix(input);
        printMatrix(matrix);
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}

class Solution {
    public int[][] generateMatrix(int A) {
        int[][] ans = new int[A][A];
        int count = 1;
        int r =0;
        int c=0;
        while (A>1) {
            for(int i =1;i<A;i++){
                ans[r][c]=count;
                c++;
                count++;
            }
            for(int i =1;i<A;i++){
                ans[r][c]=count;
                r++;
                count++;
            }
    
            for(int i =1;i<A;i++){
                ans[r][c]=count;
                c--;
                count++;
            }
            for(int i =1;i<A;i++){
                ans[r][c]=count;
                r--;
                count++;
            }
            A-=2;
            r+=1;
            c+=1;
            
        }
        if(A==1){
            ans[r][c]=count;
        }
        
        return ans;
    }
}
