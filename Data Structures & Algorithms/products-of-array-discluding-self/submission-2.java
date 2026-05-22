class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int product=1;
        int count=0;
        for (int num: nums){
            if (num==0){
                count++;
            } else {
                product *= num;
            }
        }
        if (count==nums.length || count>1){
            return new int[nums.length];
        }
        for (int i=0;i<nums.length;i++){
            if (count!=0){
                if (nums[i]==0 && product!=0){
                    arr[i] = product;
                } 
                else {
                    arr[i] = 0;
                }
            } else {
                arr[i] = product/nums[i];
            }

        }
        return arr;
    }
}  
