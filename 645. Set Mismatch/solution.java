class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        for(int i:nums){
            if(nums[Math.abs(i) - 1] < 0) res[0] = Math.abs(i);
            else nums[Math.abs(i)-1] *= -1;
        }
        for(int j = 0;j < nums.length;j++){
            if(nums[j] > 0) res[1] = j+1;
        }
        return res;
    }
}