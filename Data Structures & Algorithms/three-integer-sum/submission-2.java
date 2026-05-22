class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> intList = new ArrayList<>();
        int len = nums.length-1;
        Arrays.sort(nums);

        for (int i=0; i<len-1; i++){
            int beg = i+1, end = len;
            int diff = 0-nums[i];

            if (i>0 && nums[i]==nums[i-1]) continue;

            while(beg<end){
                int sum = nums[beg]+nums[end];
                if (sum==diff){
                    intList.add(new ArrayList<>(Arrays.asList(nums[i], nums[beg], nums[end])));
                    beg++; end--;

                    while(beg<end && nums[beg]==nums[beg-1]) beg++;
                    while(beg<end && nums[end]==nums[end+1]) end--;
                } else if (sum>diff) end--;
                else beg++;
            }
        }

        return intList;
    }
}