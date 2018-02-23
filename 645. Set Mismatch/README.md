# 645. Set Mismatch
The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.

Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.
**Example 1:**
```
Input: nums = [1,2,2,4]
Output: [2,3]
```
给定一个包括1到n的数组，但是其中有一个数会重复一次，相应的另外一个数会缺失，让找到这个重复值和缺失值，以整形数组的形式返回。
### 解题思路
这道题要充分利用数组下标和元素值之间的关系。对于重复值，我们可以将每个元素作为下标的对应元素值更改为负值，如果下一个元素作为下标找到的元素值是负值，说明该下标已经出现过，从而确定重复值。
然后再次遍历整个数组，查找哪个下标对应的元素值依然为正，说明该下标缺失。
时间复杂度O(n)