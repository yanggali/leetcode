# 647. Palindromic Substrings
求字符串中有多少回文子串，例如输入“abc”,输出"a", "b", "c"；输入“aaa”,输出"a", "a", "a", "aa", "aa", "aaa"
### 解题思路
依次计算以i(i >= 0且i < s.length())为中心的回文子串有多少