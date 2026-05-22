class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int[] arr = new int[k];

        for (int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        // HashMap Created

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(freqMap.entrySet());
        // Max-Heap Created

        for(int i=0;i<k;i++){
            arr[i] = pq.poll().getKey();
        }

        return arr;
    }
}
