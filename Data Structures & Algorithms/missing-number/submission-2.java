class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int lastNum = nums[nums.length-1];
        long actual = 0, observed = 0;
        
        while (lastNum > 0){
            actual += lastNum;
            lastNum--;
        }

        for (int i=0; i<nums.length; i++){
            observed += nums[i];
        }

        if (nums[0]==0 && (actual - observed) == 0) return nums[nums.length-1]+1;
        else return (int)(actual-observed);
    }
}
