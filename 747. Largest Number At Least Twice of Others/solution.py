class Solution:
    def dominantIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        m = max(nums)
        for i in range(len(nums)):
            if 2*nums[i] > m and nums[i]!=m:
                return -1
        return nums.index(m)