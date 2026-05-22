class Solution {
    public int maxProduct(int[] nums) {
        long prefix = 1, suffix = 1;
        long max = Integer.MIN_VALUE;
        int n = nums.length-1;

        for (int i=0; i<=n; i++){
            if (prefix==0) prefix=1;
            if (suffix==0) suffix=1;

            prefix *= nums[i];
            suffix *= nums[n-i];

            max = Math.max(max, Math.max(prefix, suffix));
        }

        return (int) max;
    }
}
