class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0)+1);
        } //HashMap Created

        ArrayList<Integer>[] arr = new ArrayList[nums.length+1];
        for (int key: hashMap.keySet()){
            int freq = hashMap.get(key);
            if (arr[freq] == null){
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(key);
        } //Array of arratList created

        int[] result = new int[k];
        int idx = 0;

        for (int i=nums.length-1; i>-1 && k!=0; ){
            if (arr[i+1] == null || arr[i+1].size() == 0) i--;
            else {
                result[idx++] = arr[i+1].remove(0);
                k--;
            }
        }

        return result;
    }
}