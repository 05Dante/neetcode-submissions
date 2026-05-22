class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i=1; i<=n; i++){
            result[i] = count1s(i);
        }

        return result;
    }

    private int count1s(int n){
        int count = 0;
        while(n != 0){
            if ((n & 1) == 1) count++;
            n >>= 1;
        }
        return count;
    }
}
