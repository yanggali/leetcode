class Solution {
    public int rob(int[] nums) {
        if(nums.length < 1) return 0;
        int prevNo = 0; //上一次没有选择house的最大值
        int prevYes = 0; //上一次选择了house的最大值
        for(int n : nums){
            int temp = prevNo;
            prevNo = Math.max(prevNo,prevYes);  //没有选择当前house的最大值是上一次选择或者没有选择的最大值
            prevYes = temp+n;
        }
        return prevNo > prevYes?prevNo:prevYes;
    }
}