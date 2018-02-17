# 530. Minimum Absolute Difference in BST
Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.
**Example** :
```
Input:

   1
    \
     3
    /
   2

Output:
1

Explanation:
The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
```
给定一个二叉查找树，求最小差值绝对值。
### 解题思路
这道题给定的是二叉查找树，所以很简单地根据中根遍历就能将所有数排序，这样依次比较相邻的数就可以找到最小差值绝对值。因此这题只要会二叉树的 **中根遍历**的写法就很简单了。