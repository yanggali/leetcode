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
}