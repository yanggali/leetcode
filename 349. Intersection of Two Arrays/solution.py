"""
这题很简单，就是找两个list中的相同元素，利用python自带的集合运算就能快速解决
"""
class Solution:
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        return list(set(nums1) & set(nums2))