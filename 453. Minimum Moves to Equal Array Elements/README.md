# 453. Minimum Moves to Equal Array Elements
Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1. 
```
Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
```
这是道简单类型的题目，但是我并不觉得简单。代码写起来是很简单，但是不懂解法却什么都写不出来，因为这根本就是道数学题。
题目是求一个整形数组，每一次让len-1个元素加一，最少多少步可以让所有元素相等。
## 解题思路
假设最后的数都为x，数组长度为len，初始数组的总和为sum，总共需要step步
```
x*len = sum+(len-1)*step
x = min+step
so
step = sum-min*len
```
解释一下为什么x=min+step，因为我们的目标是让所有数都相等，那么最小的数肯定也得等于最后的x，而最小的数必定每次都会参与运算，因为但凡有一次没有参与运算，那么其他所有数都会加一，那它依然是最小的数。