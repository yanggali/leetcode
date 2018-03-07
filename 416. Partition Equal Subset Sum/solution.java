class Solution {
    public boolean canPartition(int[] nums) {
        // edge check
        if(nums.length <= 1) return false;
        int sum = 0;
        for(int n:nums){
            sum += n;
        }
        
        if(sum%2 != 0) return false;
        int target = sum/2;
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int i = 0;i < nums.length;i++){
            //检查在nums[0]~nums[i-1]中是否有元素和等于target
            for(int j = target;j >= nums[i];j--){
                dp[j] = dp[j]||dp[j-nums[i]];
            }
        }
        return dp[target];
    }
    //求一个数组的最长的增序列的长度
    public static int getLongestS(int[] nums){
        //定义状态：dp[i]代表以nums[i]结尾的最长子序列长度
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for(int i = 1;i < nums.length;i++){
            for(int j = 0;j < i;j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp[nums.length-1];
    }
}