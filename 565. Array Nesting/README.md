# 565. Array Nesting
A zero-indexed array A of length N contains all integers from 0 to N-1. Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... } subjected to the rule below.

Suppose the first element in S starts with the selection of element A[i] of index = i, the next element in S should be A[A[i]], and then A[A[A[i]]]… By that analogy, we stop adding right before a duplicate element occurs in S.
**Example 1:**
```
Input: A = [5,4,0,3,1,6,2]
Output: 6
Explanation: 
A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.

One of the longest S[K]:
S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
```
### 解题思路
这道题第一眼一看觉得不是很简单嘛，直接循环从每个元素遍历下去就行了，但是这种简单的想法很明显是TLE的。
仔细一想，一旦一个元素被找到了，那么以它开始的遍历就不需要进行了，因此一旦该元素被访问了，它就更改为-1。这种思路的时间复杂度只需要O(n)