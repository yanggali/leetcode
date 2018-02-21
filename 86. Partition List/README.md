# 86. Partition List
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
这是一道链表题，给定一个链表和一个数x，将链表中小于x的数列入x左边，大于等于x的数列入x的右边，并保证相对顺序不变。
### 解题思路
这道题的基本思路其实很简单，但是我一开始还在想着插入的问题，其实只要用两个链表分别保存小于x的数和大于等于x的数，最后将两个链表连接起来就行了。这样只需要O(n)的时间复杂度就行了。