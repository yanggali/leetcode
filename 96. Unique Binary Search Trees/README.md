# 96. Unique Binary Search Trees
Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.
```
   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
```
给定一个整数n，求1，2，...,n个数字能组成的所有BST的个数
### 解题思路
这题用dynamic planning的思想，假设count[i]代表有i个连续整数所构成的所有BST的个数。那么对于以j(j>0&&j<=i)为根的树来说，它所构成的BST的个数等于count[j-1](左子树的个数)*count[i-j](右子树的个数)。