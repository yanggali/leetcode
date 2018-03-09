class Solution {
    public int[] countBits(int num) {
        int[] bitCount = new int[num+1];
        bitCount[0] = 0;
        for(int i = 1;i < num+1;i++){
            bitCount[i] = bitCount[i/2]+i%2;
        }
        return bitCount;
    }
}