class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        int flag = 0; 
        for(int i=0;i<nums.length;i++){
            ht.put(nums[i], 0);
        }
        for (int i=0;i<nums.length;i++){
            if (ht.get(nums[i])==1){
                flag++;
                break;
            } else {
                ht.put(nums[i], ht.get(nums[i])+1);
            }
        }
        if (flag==0) return(false);
        else return(true);
    }
}