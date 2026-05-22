class Solution {
    public int findMin(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length-1;

        if (nums[low] < nums[high]) return nums[low];

        while(low < high){
            if (nums[low]>nums[high]){
                low++;
            } else high--;
        }

        return nums[low];
    }
}
