/*Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer. */
class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];
        int n = nums.length;
        for(int i =1;i<n;i++){
            int num = nums[i];
            if(num<0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(num,num*maxProd);
            minProd = Math.min(num,num*minProd);

            result = Math.max(result,maxProd);  
        }

        return result;
        
    }
}