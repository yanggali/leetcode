# 338. Counting Bits
给定一个整数num,求[0,num]之间的整数的二进制形式中1的个数组成的数组
例如：num = 5,我应该返回[0,1,1,2,1,2]
### 解题思路
这是道数学题，设f(i)是数字i的二进制形式中1的个数，那么f(i)=f(i/2)+i%2，i的二进制形式是i/2的二进制形式左移一位，再看i是否能整除2.能的话再加上一个1