# 416. Partition Equal Subset Sum
Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
Example 1:
```
Input: [1, 5, 11, 5]

Output: true

Explanation: The array can be partitioned as [1, 5, 5] and [11].
```
Example 2:
```
Input: [1, 2, 3, 5]

Output: false

Explanation: The array cannot be partitioned into equal sum subsets.
```
给定一个数组，且数组元素都为正，判断该数组能否分成两份等值的子数组。
### 解题思路
这题也是用动态规划的思想，问题可以转换为数组中是否有元素相加等于sum/2,双层循环，第一层是遍历数组所有元素nums[i]，第二层是遍历1~sum/2中的target,看是否有元素相加等于target