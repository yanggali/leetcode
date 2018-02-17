# 715. Range Module
A Range Module is a module that tracks ranges of numbers. Your task is to design and implement the following interfaces in an efficient manner.

**addRange(int left, int right)** Adds the half-open interval [left, right), tracking every real number in that interval. Adding an interval that partially overlaps with currently tracked numbers should add any numbers in the interval [left, right) that are not already tracked.
**queryRange(int left, int right)** Returns true if and only if every real number in the interval [left, right) is currently being tracked.
**removeRange(int left, int right)** Stops tracking every real number currently being tracked in the interval [left, right).
Example:
```
addRange(10, 20): null
removeRange(14, 16): null
queryRange(10, 14): true (Every number in [10, 14) is being tracked)
queryRange(13, 15): false (Numbers like 14, 14.03, 14.17 in [13, 15) are not being tracked)
queryRange(16, 17): true (The number 16 in [16, 17) is still being tracked, despite the remove operation)
```
数据追踪模块：
1. addRange(left,right)：给定这个左闭右开的区间，表示开始追踪这个区间内的所有数据；
2. removeRange(left,right):取消追踪[left,right)这个区间内的数据
3. queryRange(left,right):检查[left,right)这个区间内的数据是否被追踪
### 解题思路
用treeMap来保存追踪数据