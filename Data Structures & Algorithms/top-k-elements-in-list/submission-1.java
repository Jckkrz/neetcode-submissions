class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqs = new HashMap<>(); 
        for (int num : nums) { 
            freqs.put(num, freqs.getOrDefault(num, 0) + 1); 
        } 
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> freqs.get(a) - freqs.get(b));
        
        for (int num : freqs.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        
        return result; 
    } 
}