class Solution {
    public int arrayNesting(int[] nums) {
        int maxLen = 0;
        for(int i = 0 ;i < nums.length;i++){
            int curLen = 0;
            for(int j = i;nums[j] >= 0;curLen++){
                int temp = nums[j];
                nums[j] = -1;
                j = temp;
            }
            maxLen = Math.max(curLen,maxLen);
        }
        return maxLen;
    }
}