# 522. Longest Uncommon Subsequence II
Given a list of strings, you need to find the longest uncommon subsequence among them. The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other strings.

A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements. Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.

The input will be a list of strings, and the output needs to be the length of the longest uncommon subsequence. If the longest uncommon subsequence doesn't exist, return -1.
Example:
```
Input: "aba", "cdc", "eae"
Output: 3
```
这道题目第一眼看题目根本没看懂，后来去搜博客，看答案才了解它是什么意思...
简单来说，有一个由字符串组成的list，我们要找到最长的子串，这个子串除了它自己不能是其他任何字符串的子串。
## 解题思路
首先，这个最长子串必须是这个list中的其中一个字符串。我们用反证法：
假设最长子串为s，它不是list中一个字符串，那么s肯定为list中一个字符串l的子串，因为s已经是最长子串，那么l肯定也是一个符合要求的子串，它不可能是其他任何字符串的子串，可是l却比s长，与s是最长子串的前提不符，所以假设不成立。
所以我们要做的就是一一判断列表中的字符串，找到那个不是任何字符串子串并且最长的那一个，返回它的长度。