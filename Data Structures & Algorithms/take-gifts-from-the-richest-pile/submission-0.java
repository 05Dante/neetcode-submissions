class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;

        for (int i=0; i<gifts.length; i++){
            maxHeap.add(gifts[i]);
        }

        while(k-- > 0){
            int val = (int)Math.sqrt(maxHeap.poll());
            maxHeap.add(val);
        }
        for (int i=0; i<gifts.length; i++){
            sum += maxHeap.poll();
        }

        return sum;
    }
}