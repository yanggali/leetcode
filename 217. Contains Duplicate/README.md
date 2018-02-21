# 217. Contains Duplicate
Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
给定一个数组，判断其中是否有重复的元素，有返回true，没有返回false
### 解题思路
这道题很简单，也有多种做法。
1. 第一种是采取两层循环，如果有相同元素就返回true，时间复杂度是O(n^2)
2. 第二种可以先将数组排序，这样每次比较相邻的元素
3. 第三种利用集合，将访问过的元素都放入集合，如果下一次元素已经存在于集合中则返回true