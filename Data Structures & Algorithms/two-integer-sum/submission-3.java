class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ht = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if (ht.containsKey(diff)){
                return new int[] {ht.get(diff), i};
            } 
            ht.put(nums[i], i);
        }
        return new int[] {};
    }
}
