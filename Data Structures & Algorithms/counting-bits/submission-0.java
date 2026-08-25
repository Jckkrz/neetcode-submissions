class Solution {
    public int[] countBits(int n) {
        
        int[] bits = new int[n+1];
        bits[0] = 0;

        for(int i = 1; i <= n; i ++){
            int count = 0;
            int target = i;
            while(target != 0){
                target = target & (target -1);
                count++;
            }
            bits[i] = count;
        }

        return bits;
    }
}
