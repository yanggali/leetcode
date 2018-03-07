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

**题外题**
根据这道题为了解动态规划又做了道题：求数组的最长增序列的长度。
动态规划的本质是 **拆分问题**，而拆分问题又分为 **状态定义**和 **状态转移方程的定义**。所谓状态定义也就是子问题的定义。比如这道题设置dp[i]是以数字nums[i]结尾的最长子序列长度，而转移方程就是状态与状态之间的关系式，比如这道题就是：
以第k项结尾的LIS的长度是：保证第i项比第k项小的情况下，以第i项结尾的LIS长度加一的最大值，取遍i的所有值（i小于k）
### 解题思路
这题也是用动态规划的思想，问题可以转换为数组中是否有元素相加等于sum/2。
按照上述的动态规划的思想：问题的状态是dp[i]代表数组是否有元素之和为i，状态方程是，和为k时，dp[k]是否为真取决于之前的dp[i]加上当前nums[i]是否等于k。
双层循环，第一层是遍历数组所有元素nums[i]，第二层是遍历1~sum/2中的target,看是否有元素相加等于target