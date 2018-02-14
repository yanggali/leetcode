# 300. Longest Increasing Subsequence
Given an unsorted array of integers, find the length of longest increasing subsequence.
For example:
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.
**Follow up**: Could you improve it to O(n log n) time complexity?
这道题是找到一个乱序数组中最长增序子列表的长度，这道题通用做法是用 **dynamic planning** 的方法。
### 解题思路
用dp[len]来存储位置i处最长的子串长度。对于每一个i+1处的元素nums[i+1]，我们将nums[i+1]与nums[0:i]的所有元素比较，如果大于nums[0:i]中的某个元素nums[j]，则将dp[j]+1与dp[i]比较。
这种方法需要O(n^2)的时间复杂度，有一种使用 **binarytree** 的方法可以在O(nlogn)时间内完成，我还没有弄懂......