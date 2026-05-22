class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixArr = new int[nums.length];
        int prefix, postfix=1;
        for (int i=0; i<nums.length; i++){
            if (i==0){
                prefixArr[i] = 1;
            } else {
                prefixArr[i] = prefixArr[i-1] * nums[i-1]; 
            }
        }

        for (int i=nums.length-1;i>=0;i--){
            if (i==nums.length-1){
                continue;
            } else {
                postfix *= nums[i+1];
                prefixArr[i] *=  postfix;
            }
        }
        return prefixArr;
    }
}  
