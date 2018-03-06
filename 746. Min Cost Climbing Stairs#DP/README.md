# 746. Min Cost Climbing Stairs(easy)
On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.
Example 1:
```
Input: cost = [10, 15, 20]
Output: 15
Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
```
Example 2:
```
Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
Output: 6
Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
```
走楼梯，一次可以走一步或两步，可以从第0层或第1层开始
### 解题思路
这是道动态规划题，设dp[i]是走到第0层的cost。可以从第0层或第1层开始，所以dp[0]和dp[1]都是0。
对于第i层，可以是从第i-2层，经过第i-2层走两步，也可以从第i-1层，经过i-1层走一步到达，所以dp[i] = min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1])