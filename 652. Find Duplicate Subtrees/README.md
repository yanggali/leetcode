# 652. Find Duplicate Subtrees
Given a binary tree, return all duplicate subtrees. For each kind of duplicate subtrees, you only need to return the root node of any one of them.

Two trees are duplicate if they have the same structure with same node values.
给定一个二叉树，找到有相同结构的子树的根节点，返回这些根节点列表
Example:
```
        1
       / \
      2   3
     /   / \
    4   2   4
       /
      4
```
The following are two duplicate subtrees:
```
      2
     /
    4
```
and
```
    4
```
therefore,return list[2,4]
### 解题思路
要找有相同结构的子树，首先我们要得到所有子树的序列。用深度优先的序列存储一棵树，并将这个序列以及对应出现的次数以字典形式存储，如果序列出现次数大于1，那么就将它的根节点添加到列表。