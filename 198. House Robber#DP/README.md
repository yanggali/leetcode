# 198. House Robber
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and **it will automatically contact the police if two adjacent houses were broken into on the same night**.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
给定一个数组，要求求出元素之和的最大值，且不能有相邻元素。
### 解决思路
这题也是一道简单的动态规划题。我们依次遍历元素，用两个值来跟踪没有选择当前元素的最大值（prevNo）和选择当前元素的最大值(prevYes)。对于当前元素，没有选择它的最大值是max(prevNo,prevYes);选择它的最大值是prevNo+current