class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < stones.length; i ++){
            maxHeap.add(stones[i]);
        }

        while(maxHeap.size() > 1){
            int first = maxHeap.remove();
            int second = maxHeap.remove();
            maxHeap.add(first - second);
        }

        return maxHeap.remove();
    }
}
