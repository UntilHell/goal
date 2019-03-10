刷题记录

| 时间      | 题目                                          | 难度   | 难点                                                         |                                                              |
| --------- | --------------------------------------------- | ------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 2019.2.23 | 807. Max Increase to Keep City Skyline        |        | 题目看不懂，后面看懂了，实现也是想不出来                     |                                                              |
| 2019.2.23 | 929. Unique Email Addresses                   |        | String的方法不熟练，写出的算法略复杂                         |                                                              |
| 2019.2.23 | 461. Hamming Distance                         | easy   | 整数怎么转换成二进制，不会                                   |                                                              |
| 2019.2.23 | 350. Intersection of Two Arrays II            | easy   | 想到了用map,但是出现的频次不会设置。答案上如果存在频次减一，为0的时候remove |                                                              |
| 2019.2.23 | 349. Intersection of Two Arrays               | easy   | 本题做了                                                     |                                                              |
| 2019.2.23 | 338. Counting Bits                            | easy   | 看了答案。亦或的操作。然后统计1的个数                        | 另外一种思路是如果一个整数不为0，那么这个整数至少有一位是1。如果我们把这个整数减去1，那么原来处在整数最右边的1就会变成0，原来在1后面的所有的0都会变成1。其余的所有位将不受到影响。举个例子：一个二进制数1100，从右边数起的第三位是处于最右边的一个1。减去1后，第三位变成0，它后面的两位0变成1，而前面的1保持不变，因此得到结果是1011。                  我们发现减1的结果是把从最右边一个1开始的所有位都取反了。这个时候如果我们再把原来的整数和减去1之后的结果做与运算，从原来整数最右边一个1那一位开始所有位都会变成0。如1100&1011=1000。也就是说，把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0。那么一个整数的二进制有多少个1，就可以进行多少次这样的操作。 |
|           |                                               |        |                                                              |                                                              |
| 2019.2.24 | 617. Merge Two Binary Trees                   | easy   | 二叉树的题目没看见几个，不会。直接看答案。递归答案写了一遍，总觉得没用理解.循环的用栈实现的没有看 | 递归是真的看不懂                                             |
| 2019.2.24 | 104. Maximum Depth of Binary Tree             | easy   | 不要想具体的实现过程，将改函数当成普通的函数；层序遍历不会   |                                                              |
| 2019.2.24 | 136. Single Number                            | easy   | list实现的，too slow；看答案用亦或 0^N = N    N^N = 0;       |                                                              |
| 2019.2.24 | 226. Invert Binary Tree                       | easy   | 看答案实现了两个版本的；递归和循环                           |                                                              |
| 2019.2.24 | 647. Palindromic Substrings                   | medium | 回文字符窜，回文一是循环；二是递归。写了一个很复杂的，先求出每个字符窜，然后判断是不是回文字符窜 | 看不懂答案                                                   |
|           |                                               |        |                                                              |                                                              |
| 2019.3.2  | 94. Binary Tree Inorder Traversal             | mediun | 返回list不妥，回归调用的时候，list会不断被初始化。List放在方法的外面，通不过。  换成循环，看不懂 |                                                              |
| 2019.3.2  | 448. Find All Numbers Disappeared in an Array | easy   | 不会，用了额外的空间，速度不行。                             | 答案看不懂                                                   |
| 2019.3.2  | 169. Majority Element                         | easy   | 用排序                                                       |                                                              |
| 2019.3.2  | 538. Convert BST to Greater Tree              | easy   | 看不懂                                                       |                                                              |
| 2019.3.2  | 78. Subsets                                   | medium | 看不懂                                                       |                                                              |
| 2019.3.2  | 543. Diameter of Binary Tree                  | easy   | l+r+1  递归看不懂                                            |                                                              |
|           |                                               |        |                                                              |                                                              |
| 2019.3.3  | 121. Best Time to Buy and Sell Stock          | easy   | 循环，复杂度高                                               |                                                              |
| 2019.3.3  | 21. Merge Two Sorted Lists                    | easy   | 递归，我好想记得答案，搞不懂                                 |                                                              |
|           |                                               |        |                                                              |                                                              |
| 2019.3.6  | 242. Valid Anagram                            | easy   | 新建一个数组                                                 |                                                              |
|           |                                               |        |                                                              |                                                              |
| 2019.3.7  | 15. 3Sum                                      | medium | 搞不懂，全是0的时候重复了                                    |                                                              |
|           |                                               |        |                                                              |                                                              |
| 2019.3.9  | 538. Convert BST to Greater Tree              | easy   | 走了一遍递归的代码，先递归右边的，在到左边。反正感觉不懂；循环额方法还是看不懂 |                                                              |
| 2019.3.9  | 53. Maximum Subarray                          | easy   | 动态规划看不懂答案                                           |                                                              |
|           |                                               |        |                                                              |                                                              |
| 2019.3.10 | 101. Symmetric   Tree                         | easy   | 这种题完全是没有想法的                                       |                                                              |
| 2019.3.10 | 543. Diameter   of Binary Tree                | easy   | 还是看不懂                                                   |                                                              |
| 2019.3.10 | 437. Path   Sum III                           | easy   | 看不懂                                                       |                                                              |
| 2019.3.10 | 572. Subtree   of Another Tree                | easy   | 看不懂                                                       |                                                              |
| 2019.3.10 | 198. House   Robber                           | easy   | 选和不选的问题                                               | https://space.bilibili.com/7836741/video?tid=0&page=1&keyword=&order=pubdate |
| 2019.3.10 | 438. Find   All Anagrams in a String          | easy   | 做了一点点，方向是对的。但是后面的做不出来；答案看不懂       |                                                              |
| 2019.3.10 | 20. Valid   Parentheses                       | easy   | 做过及几遍的题，还是做不出来；搞了好久做出来了               |                                                              |
| 2019.3.10 | 141. Linked   List Cycle                      | easy   | 题目没看懂                                                   |                                                              |