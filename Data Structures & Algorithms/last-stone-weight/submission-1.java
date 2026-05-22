class Solution {
    public int lastStoneWeight(int[] stones) {
        int length = stones.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        for (int i=0; i<length; i++){
            maxHeap.add(stones[i]);
        }

        for (int i=stones.length-1; i>0; i--){
            int val = maxHeap.poll() - maxHeap.poll();
            maxHeap.add(val);
        }

        return maxHeap.poll();
    }
}
