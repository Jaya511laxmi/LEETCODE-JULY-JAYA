## 📅 LeetCode Daily Challenge – Day 2
LeetCode Problem: [3333. Find the Original Typed String II](https://leetcode.com/problems/find-the-original-typed-string-ii)  
Difficulty: Hard  
Topic Tags: DP, Combinatorics, Strings, Prefix Sum  

### ✍️ Problem Summary  
Alice types on her keyboard but may press a key for too long, resulting in repeated characters. Given a final output string `word` and a number `k`, return the number of original strings Alice might have intended to type such that the length of the original string is **at least `k`**. Return the result modulo `10⁹ + 7`.

### 🚧 My Approach  
- Group consecutive repeating characters into counts.  
  Example: `"aabbccdd"` → `[2, 2, 2, 2]`
- The number of ways to type each group is equal to its size (`g[i]` options: 1 to `g[i]` characters).
- The **total combinations** = product of all group sizes.
- We subtract invalid combinations (i.e., those with original length < `k`) using DP.
