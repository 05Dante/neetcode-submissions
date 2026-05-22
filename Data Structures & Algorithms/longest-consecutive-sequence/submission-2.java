class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0, maxCount=0;
        Arrays.sort(nums);

        if (nums.length==0){
            return 0;
        }

        int[] arr = new int[nums.length];
        arr[0] = 0;
        for (int i=1; i<nums.length; i++){
            arr[i] = nums[i]-nums[i-1];
            if (arr[i]==1){
                count++;
            } else if (arr[i]==0){
                continue;
            }
            else {
                maxCount = Math.max(maxCount, count);
                count=0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount+1;
    }
}
