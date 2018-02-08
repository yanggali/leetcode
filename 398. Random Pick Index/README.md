# 398. Random Pick Index
Given an array of integers with possible duplicates, randomly output the index of a given target number. You can assume that the given target number must exist in the array.
给定一个整形数组，里面可能存在重复值。随机选择一个数，返回该数在数组中的索引值，每个可能索引值返回的概率一定。
Example:
```
int[] nums = new int[] {1,2,3,3,3};
Solution solution = new Solution(nums);

// pick(3) should return either index 2, 3, or 4 randomly. Each index should have equal probability of returning.
solution.pick(3);

// pick(1) should return 0. Since in the array only nums[0] is equal to 1.
solution.pick(1);
```
### 解题思路
这是一道medium的题目，但是如果用python写，它就是一道考验你python是否熟练的题目。因为python封装了大量现有的方法，我们要做的就是直接调用它。例如random.choice(sequence)就是从sequence中随机选择一个元素，这个sequence可以是list，tuple等。enumerate() 函数用于将一个可遍历的数据对象(如列表、元组或字符串)组合为一个索引序列，同时列出数据和数据下标，一般用在 for 循环当中。

所以，用python解题最重要的基础就是熟悉python的应用。