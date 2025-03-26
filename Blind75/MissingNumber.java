public class MissingNumber {
        public int missingNumber(int[] nums) {
            int xor =0;
            for(int i =0;i<nums.length;i++){
                xor = xor^nums[i];
            }
            int xor2=0;
            for(int j =0;j<=nums.length;j++){
                xor2 = xor2^j;
    
            }
            return xor^xor2;
            
        }
    
}
