# CodexSheet 250

The [CodexSheet](https://codexsheet.in) DSA sheet as a repository: 250 real LeetCode
questions, grouped the three ways the sheet groups them, each with starter code you can
run offline and commit as you go.

```bash
git clone https://github.com/Aditya90456/codexsheet-250.git
cd codexsheet-250
```

250 problems - 76 Easy, 152 Medium, 22 Hard.
Titles, slugs and difficulty levels are read from LeetCode's public problem index, not typed
out by hand, and the folder path of every problem is the path the sheet shows you.

## Layout

```
problems/
  01-arrays-and-hashing/
    001-two-sum/
      README.md      the brief: level, pattern, week, tier and links
      solution.py    Python starter, reads stdin
      solution.js    JavaScript starter, solution(data)
      Main.java      Java starter, reads stdin
      solution.cpp   C++ starter, reads stdin
```

## How to use it

1. Open the sheet at [codexsheet.in/problems](https://codexsheet.in/problems) and pick a problem.
2. `cd` into its folder, edit the file for your language, run it against the input.
3. Commit. The commit history of this repo is your practice log - recruiters read it,
   and so does Aditya if you send him the link before a 1:1 session.
4. Mark it solved on the sheet so the XP, the streak and the rank follow along.

Twelve topics, sixteen patterns, twelve weeks: the same problem appears in all three
views on the site, so pick whichever one your brain plans by.

## The index
### Arrays & Hashing — `problems/01-arrays-and-hashing/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | Arrays & Hashing | 1 |
| 2 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | Arrays & Hashing | 1 |
| 3 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | Arrays & Hashing | 1 |
| 4 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | Medium | Arrays & Hashing | 1 |
| 5 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Medium | Arrays & Hashing | 1 |
| 51 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Easy | Arrays & Hashing | 1 |
| 52 | [Encode and Decode Strings](https://leetcode.com/problems/encode-and-decode-strings/) | Medium | Arrays & Hashing | 1 |
| 53 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | Medium | Arrays & Hashing | 1 |
| 54 | [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/) | Medium | Arrays & Hashing | 1 |
| 55 | [Can Place Flowers](https://leetcode.com/problems/can-place-flowers/) | Easy | Arrays & Hashing | 1 |
| 56 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) | Easy | Arrays & Hashing | 1 |
| 57 | [Design HashMap](https://leetcode.com/problems/design-hashmap/) | Easy | Arrays & Hashing | 1 |
| 58 | [Design HashSet](https://leetcode.com/problems/design-hashset/) | Easy | Arrays & Hashing | 1 |
| 59 | [Design Parking System](https://leetcode.com/problems/design-parking-system/) | Easy | Arrays & Hashing | 1 |
| 60 | [Find All Numbers Disappeared in An Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | Easy | Arrays & Hashing | 1 |
| 61 | [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/) | Easy | Arrays & Hashing | 1 |
| 62 | [Find the Difference of Two Arrays](https://leetcode.com/problems/find-the-difference-of-two-arrays/) | Easy | Arrays & Hashing | 1 |
| 63 | [Find The Index of The First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) | Easy | Arrays & Hashing | 1 |
| 64 | [Is Subsequence](https://leetcode.com/problems/is-subsequence/) | Easy | Arrays & Hashing | 1 |
| 65 | [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/) | Easy | Arrays & Hashing | 1 |
| 66 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | Easy | Arrays & Hashing | 1 |
| 67 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Easy | Arrays & Hashing | 1 |
| 68 | [Majority Element](https://leetcode.com/problems/majority-element/) | Easy | Arrays & Hashing | 1 |
| 69 | [Maximum Number of Balloons](https://leetcode.com/problems/maximum-number-of-balloons/) | Easy | Arrays & Hashing | 1 |
| 70 | [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | Easy | Arrays & Hashing | 1 |

### Strings & Two Pointers — `problems/02-strings-and-two-pointers/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 6 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy | Two Pointers | 2 |
| 7 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | Two Pointers | 2 |
| 8 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | Two Pointers | 2 |
| 9 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard | Two Pointers | 2 |
| 10 | [Best Time to Buy And Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Easy | Sliding Window | 3 |
| 11 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | Sliding Window | 3 |
| 12 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Medium | Sliding Window | 3 |
| 13 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard | Sliding Window | 3 |
| 71 | [Two Sum II Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | Medium | Two Pointers | 2 |
| 72 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy | Two Pointers | 2 |
| 73 | [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/) | Easy | Two Pointers | 2 |
| 74 | [Minimum Difference Between Highest And Lowest of K Scores](https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/) | Easy | Two Pointers | 2 |
| 75 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Easy | Two Pointers | 2 |
| 76 | [Remove Duplicates From Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | Two Pointers | 2 |
| 77 | [Reverse String](https://leetcode.com/problems/reverse-string/) | Easy | Two Pointers | 2 |
| 78 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/) | Easy | Two Pointers | 2 |
| 79 | [4Sum](https://leetcode.com/problems/4sum/) | Medium | Two Pointers | 2 |
| 80 | [Array With Elements Not Equal to Average of Neighbors](https://leetcode.com/problems/array-with-elements-not-equal-to-average-of-neighbors/) | Medium | Two Pointers | 2 |
| 81 | [Boats to Save People](https://leetcode.com/problems/boats-to-save-people/) | Medium | Two Pointers | 2 |
| 82 | [Number of Subsequences That Satisfy The Given Sum Condition](https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/) | Medium | Two Pointers | 2 |
| 83 | [Permutation In String](https://leetcode.com/problems/permutation-in-string/) | Medium | Sliding Window | 3 |
| 84 | [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/) | Easy | Sliding Window | 3 |
| 85 | [Find K Closest Elements](https://leetcode.com/problems/find-k-closest-elements/) | Medium | Sliding Window | 3 |
| 86 | [Frequency of The Most Frequent Element](https://leetcode.com/problems/frequency-of-the-most-frequent-element/) | Medium | Sliding Window | 3 |
| 87 | [Fruits into Basket](https://leetcode.com/problems/fruit-into-baskets/) | Medium | Sliding Window | 3 |
| 88 | [Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | Medium | Sliding Window | 3 |
| 89 | [Minimum Number of Flips to Make The Binary String Alternating](https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/) | Medium | Sliding Window | 3 |
| 90 | [Minimum Operations to Reduce X to Zero](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/) | Medium | Sliding Window | 3 |
| 91 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | Medium | Sliding Window | 3 |

### Sorting & Searching — `problems/03-sorting-and-searching/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 18 | [Binary Search](https://leetcode.com/problems/binary-search/) | Easy | Binary Search | 5 |
| 19 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | Medium | Binary Search | 5 |
| 20 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | Medium | Binary Search | 5 |
| 107 | [Find Minimum In Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Medium | Binary Search | 5 |
| 108 | [Search In Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | Binary Search | 5 |
| 109 | [Time Based Key Value Store](https://leetcode.com/problems/time-based-key-value-store/) | Medium | Binary Search | 5 |
| 110 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Hard | Binary Search | 5 |
| 111 | [Arranging Coins](https://leetcode.com/problems/arranging-coins/) | Easy | Binary Search | 5 |
| 112 | [Guess Number Higher Or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/) | Easy | Binary Search | 5 |
| 113 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Easy | Binary Search | 5 |
| 114 | [Sqrt(x) ](https://leetcode.com/problems/sqrtx/) | Easy | Binary Search | 5 |
| 115 | [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | Easy | Binary Search | 5 |
| 116 | [Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/) | Easy | Binary Search | 5 |
| 117 | [Capacity to Ship Packages](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | Medium | Binary Search | 5 |
| 118 | [Find First And Last Position of Element In Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | Medium | Binary Search | 5 |
| 119 | [Find Peak Element](https://leetcode.com/problems/find-peak-element/) | Medium | Binary Search | 5 |

### Stacks & Queues — `problems/04-stacks-and-queues/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 14 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | Stack | 4 |
| 15 | [Min Stack](https://leetcode.com/problems/min-stack/) | Medium | Stack | 4 |
| 16 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) | Medium | Stack | 4 |
| 17 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | Medium | Monotonic Stack | 4 |
| 92 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | Medium | Stack | 4 |
| 93 | [Baseball Game](https://leetcode.com/problems/baseball-game/) | Easy | Stack | 4 |
| 94 | [Implement Stack Using Queues](https://leetcode.com/problems/implement-stack-using-queues/) | Easy | Stack | 4 |
| 95 | [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/) | Medium | Stack | 4 |
| 96 | [Decode String](https://leetcode.com/problems/decode-string/) | Medium | Stack | 4 |
| 97 | [Remove All Adjacent Duplicates In String II](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/) | Medium | Stack | 4 |
| 98 | [Removing Stars From a String](https://leetcode.com/problems/removing-stars-from-a-string/) | Medium | Stack | 4 |
| 99 | [Simplify Path](https://leetcode.com/problems/simplify-path/) | Medium | Stack | 4 |
| 100 | [Car Fleet](https://leetcode.com/problems/car-fleet/) | Medium | Monotonic Stack | 4 |
| 101 | [Largest Rectangle In Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | Hard | Monotonic Stack | 4 |
| 102 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Hard | Monotonic Stack | 4 |
| 103 | [132 Pattern](https://leetcode.com/problems/132-pattern/) | Medium | Monotonic Stack | 4 |
| 104 | [Online Stock Span](https://leetcode.com/problems/online-stock-span/) | Medium | Monotonic Stack | 4 |
| 105 | [Remove K Digits](https://leetcode.com/problems/remove-k-digits/) | Medium | Monotonic Stack | 4 |
| 106 | [Maximum Frequency Stack](https://leetcode.com/problems/maximum-frequency-stack/) | Hard | Monotonic Stack | 4 |

### Linked Lists — `problems/05-linked-lists/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 21 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Easy | Linked List | 6 |
| 22 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | Linked List | 6 |
| 23 | [Reorder List](https://leetcode.com/problems/reorder-list/) | Medium | Linked List | 6 |
| 24 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | Linked List | 6 |
| 25 | [LRU Cache](https://leetcode.com/problems/lru-cache/) | Medium | Linked List | 6 |
| 120 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Easy | Linked List | 6 |
| 121 | [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Hard | Linked List | 6 |
| 122 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | Linked List | 6 |
| 123 | [Copy List With Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/) | Medium | Linked List | 6 |
| 124 | [Find The Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | Medium | Linked List | 6 |
| 125 | [Reverse Nodes In K Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | Hard | Linked List | 6 |
| 126 | [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | Easy | Linked List | 6 |
| 127 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | Easy | Linked List | 6 |
| 128 | [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | Easy | Linked List | 6 |
| 129 | [Remove Duplicates From Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | Easy | Linked List | 6 |
| 130 | [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/) | Easy | Linked List | 6 |
| 131 | [Design Browser History](https://leetcode.com/problems/design-browser-history/) | Medium | Linked List | 6 |
| 132 | [Design Circular Queue](https://leetcode.com/problems/design-circular-queue/) | Medium | Linked List | 6 |

### Trees & BSTs — `problems/06-trees-and-bsts/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 26 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | Easy | Trees | 7 |
| 27 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | Trees | 7 |
| 28 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Medium | Trees | 7 |
| 29 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Medium | Trees | 7 |
| 30 | [Kth Smallest Element In a Bst](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | Medium | Trees | 7 |
| 133 | [Same Tree](https://leetcode.com/problems/same-tree/) | Easy | Trees | 7 |
| 134 | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/) | Easy | Trees | 7 |
| 135 | [Construct Binary Tree From Preorder And Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | Medium | Trees | 7 |
| 136 | [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | Medium | Trees | 7 |
| 137 | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | Hard | Trees | 7 |
| 138 | [Serialize And Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | Hard | Trees | 7 |
| 139 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | Easy | Trees | 7 |
| 140 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | Easy | Trees | 7 |
| 141 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | Medium | Trees | 7 |
| 142 | [Count Good Nodes In Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/) | Medium | Trees | 7 |
| 143 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Easy | Trees | 7 |
| 144 | [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | Easy | Trees | 7 |
| 145 | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | Easy | Trees | 7 |
| 146 | [Construct String From Binary Tree](https://leetcode.com/problems/construct-string-from-binary-tree/) | Easy | Trees | 7 |
| 147 | [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) | Easy | Trees | 7 |
| 148 | [Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/) | Easy | Trees | 7 |
| 149 | [Minimum Distance between BST Nodes](https://leetcode.com/problems/minimum-distance-between-bst-nodes/) | Easy | Trees | 7 |
| 150 | [Path Sum](https://leetcode.com/problems/path-sum/) | Easy | Trees | 7 |
| 151 | [Symmetric Tree ](https://leetcode.com/problems/symmetric-tree/) | Easy | Trees | 7 |

### Heaps & Priority Queues — `problems/07-heaps-and-priority-queues/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 180 | [Find Median From Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | Hard | Heaps | 10 |
| 181 | [Kth Largest Element In a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/) | Easy | Heaps | 10 |
| 182 | [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) | Easy | Heaps | 10 |
| 183 | [Design Twitter](https://leetcode.com/problems/design-twitter/) | Medium | Heaps | 10 |
| 184 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) | Medium | Heaps | 10 |
| 185 | [Kth Largest Element In An Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | Medium | Heaps | 10 |
| 186 | [Task Scheduler](https://leetcode.com/problems/task-scheduler/) | Medium | Heaps | 10 |
| 187 | [Car Pooling](https://leetcode.com/problems/car-pooling/) | Medium | Heaps | 10 |
| 188 | [Find The Kth Largest Integer In The Array](https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/) | Medium | Heaps | 10 |
| 189 | [Longest Happy String](https://leetcode.com/problems/longest-happy-string/) | Medium | Heaps | 10 |
| 190 | [Maximum Subsequence Score](https://leetcode.com/problems/maximum-subsequence-score/) | Medium | Heaps | 10 |
| 191 | [Process Tasks Using Servers](https://leetcode.com/problems/process-tasks-using-servers/) | Medium | Heaps | 10 |
| 192 | [Reorganize String](https://leetcode.com/problems/reorganize-string/) | Medium | Heaps | 10 |
| 193 | [Seat Reservation Manager](https://leetcode.com/problems/seat-reservation-manager/) | Medium | Heaps | 10 |
| 194 | [Single Threaded Cpu](https://leetcode.com/problems/single-threaded-cpu/) | Medium | Heaps | 10 |

### Graphs & Topological Sort — `problems/08-graphs-and-topological-sort/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 36 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | Medium | Graphs | 8 |
| 37 | [Clone Graph](https://leetcode.com/problems/clone-graph/) | Medium | Graphs | 8 |
| 38 | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) | Medium | Graphs | 8 |
| 39 | [Course Schedule](https://leetcode.com/problems/course-schedule/) | Medium | Graphs | 8 |
| 40 | [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/) | Medium | Graphs | 8 |
| 152 | [Number of Connected Components In An Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) | Medium | Graphs | 8 |
| 153 | [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/) | Medium | Graphs | 8 |
| 154 | [Alien Dictionary](https://leetcode.com/problems/alien-dictionary/) | Hard | Graphs | 8 |
| 155 | [Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/) | Medium | Graphs | 8 |
| 156 | [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) | Medium | Graphs | 8 |
| 157 | [Max Area of Island](https://leetcode.com/problems/max-area-of-island/) | Medium | Graphs | 8 |
| 158 | [Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/) | Medium | Graphs | 8 |
| 159 | [Network Delay Time](https://leetcode.com/problems/network-delay-time/) | Medium | Graphs | 8 |
| 160 | [Redundant Connection](https://leetcode.com/problems/redundant-connection/) | Medium | Graphs | 8 |
| 161 | [Surrounded Regions](https://leetcode.com/problems/surrounded-regions/) | Medium | Graphs | 8 |
| 162 | [Walls And Gates](https://leetcode.com/problems/walls-and-gates/) | Medium | Graphs | 8 |
| 163 | [Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary/) | Hard | Graphs | 8 |
| 164 | [Swim In Rising Water](https://leetcode.com/problems/swim-in-rising-water/) | Hard | Graphs | 8 |
| 165 | [Word Ladder](https://leetcode.com/problems/word-ladder/) | Hard | Graphs | 8 |
| 166 | [Island Perimeter](https://leetcode.com/problems/island-perimeter/) | Easy | Graphs | 8 |
| 167 | [Verifying An Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary/) | Easy | Graphs | 8 |
| 168 | [Accounts Merge](https://leetcode.com/problems/accounts-merge/) | Medium | Graphs | 8 |

### Backtracking — `problems/09-backtracking/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 31 | [Subsets](https://leetcode.com/problems/subsets/) | Medium | Backtracking | 9 |
| 32 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | Medium | Backtracking | 9 |
| 33 | [Permutations](https://leetcode.com/problems/permutations/) | Medium | Backtracking | 9 |
| 34 | [Word Search](https://leetcode.com/problems/word-search/) | Medium | Backtracking | 9 |
| 35 | [N Queens](https://leetcode.com/problems/n-queens/) | Hard | Backtracking | 9 |
| 169 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | Medium | Backtracking | 9 |
| 170 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | Medium | Backtracking | 9 |
| 171 | [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | Medium | Backtracking | 9 |
| 172 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | Medium | Backtracking | 9 |
| 173 | [Combinations](https://leetcode.com/problems/combinations/) | Medium | Backtracking | 9 |
| 174 | [Find Unique Binary String](https://leetcode.com/problems/find-unique-binary-string/) | Medium | Backtracking | 9 |
| 175 | [Matchsticks to Square](https://leetcode.com/problems/matchsticks-to-square/) | Medium | Backtracking | 9 |
| 176 | [Maximum Length of a Concatenated String With Unique Characters](https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/) | Medium | Backtracking | 9 |
| 177 | [Partition to K Equal Sum Subsets](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/) | Medium | Backtracking | 9 |
| 178 | [Permutations II](https://leetcode.com/problems/permutations-ii/) | Medium | Backtracking | 9 |
| 179 | [Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/) | Medium | Backtracking | 9 |

### Dynamic Programming — `problems/10-dynamic-programming/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 41 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | Easy | 1-D DP | 11 |
| 42 | [House Robber](https://leetcode.com/problems/house-robber/) | Medium | 1-D DP | 11 |
| 43 | [Coin Change](https://leetcode.com/problems/coin-change/) | Medium | 1-D DP | 11 |
| 44 | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) | Medium | 1-D DP | 11 |
| 45 | [Word Break](https://leetcode.com/problems/word-break/) | Medium | 1-D DP | 11 |
| 46 | [Unique Paths](https://leetcode.com/problems/unique-paths/) | Medium | 2-D DP | 11 |
| 47 | [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) | Medium | 2-D DP | 11 |
| 48 | [Best Time to Buy And Sell Stock With Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | Medium | 2-D DP | 11 |
| 49 | [Burst Balloons](https://leetcode.com/problems/burst-balloons/) | Hard | 2-D DP | 11 |
| 50 | [Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/) | Hard | 2-D DP | 11 |
| 203 | [Decode Ways](https://leetcode.com/problems/decode-ways/) | Medium | 1-D DP | 11 |
| 204 | [House Robber II](https://leetcode.com/problems/house-robber-ii/) | Medium | 1-D DP | 11 |
| 205 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | Medium | 1-D DP | 11 |
| 206 | [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) | Medium | 1-D DP | 11 |
| 207 | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) | Medium | 1-D DP | 11 |
| 208 | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) | Easy | 1-D DP | 11 |
| 209 | [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) | Medium | 1-D DP | 11 |
| 210 | [N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/) | Easy | 1-D DP | 11 |
| 211 | [Best Team with no Conflicts](https://leetcode.com/problems/best-team-with-no-conflicts/) | Medium | 1-D DP | 11 |
| 212 | [Check if There is a Valid Partition For The Array](https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array/) | Medium | 1-D DP | 11 |
| 213 | [Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/) | Medium | 1-D DP | 11 |
| 214 | [Count Ways to Build Good Strings](https://leetcode.com/problems/count-ways-to-build-good-strings/) | Medium | 1-D DP | 11 |
| 215 | [Delete And Earn](https://leetcode.com/problems/delete-and-earn/) | Medium | 1-D DP | 11 |
| 216 | [Integer Break](https://leetcode.com/problems/integer-break/) | Medium | 1-D DP | 11 |
| 217 | [Maximum Subarray Min Product](https://leetcode.com/problems/maximum-subarray-min-product/) | Medium | 1-D DP | 11 |
| 218 | [Coin Change II](https://leetcode.com/problems/coin-change-ii/) | Medium | 2-D DP | 11 |
| 219 | [Edit Distance](https://leetcode.com/problems/edit-distance/) | Medium | 2-D DP | 11 |
| 220 | [Interleaving String](https://leetcode.com/problems/interleaving-string/) | Medium | 2-D DP | 11 |
| 221 | [Target Sum](https://leetcode.com/problems/target-sum/) | Medium | 2-D DP | 11 |
| 222 | [Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/) | Hard | 2-D DP | 11 |
| 223 | [Longest Increasing Path In a Matrix](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/) | Hard | 2-D DP | 11 |
| 224 | [Flip String to Monotone Increasing](https://leetcode.com/problems/flip-string-to-monotone-increasing/) | Medium | 2-D DP | 11 |
| 225 | [Last Stone Weight II](https://leetcode.com/problems/last-stone-weight-ii/) | Medium | 2-D DP | 11 |
| 226 | [Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/) | Medium | 2-D DP | 11 |
| 227 | [Maximal Square](https://leetcode.com/problems/maximal-square/) | Medium | 2-D DP | 11 |
| 228 | [Maximum Alternating Subsequence Sum](https://leetcode.com/problems/maximum-alternating-subsequence-sum/) | Medium | 2-D DP | 11 |

### Greedy & Intervals — `problems/11-greedy-and-intervals/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 195 | [Meeting Rooms](https://leetcode.com/problems/meeting-rooms/) | Easy | Intervals | 10 |
| 196 | [Insert Interval](https://leetcode.com/problems/insert-interval/) | Medium | Intervals | 10 |
| 197 | [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/) | Medium | Intervals | 10 |
| 198 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | Intervals | 10 |
| 199 | [Non Overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/) | Medium | Intervals | 10 |
| 200 | [Minimum Interval to Include Each Query](https://leetcode.com/problems/minimum-interval-to-include-each-query/) | Hard | Intervals | 10 |
| 201 | [Remove Covered Intervals](https://leetcode.com/problems/remove-covered-intervals/) | Medium | Intervals | 10 |
| 202 | [Data Stream as Disjoint Intervals](https://leetcode.com/problems/data-stream-as-disjoint-intervals/) | Hard | Intervals | 10 |
| 229 | [Jump Game](https://leetcode.com/problems/jump-game/) | Medium | Greedy | 12 |
| 230 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Medium | Greedy | 12 |
| 231 | [Gas Station](https://leetcode.com/problems/gas-station/) | Medium | Greedy | 12 |
| 232 | [Hand of Straights](https://leetcode.com/problems/hand-of-straights/) | Medium | Greedy | 12 |
| 233 | [Jump Game II](https://leetcode.com/problems/jump-game-ii/) | Medium | Greedy | 12 |
| 234 | [Merge Triplets to Form Target Triplet](https://leetcode.com/problems/merge-triplets-to-form-target-triplet/) | Medium | Greedy | 12 |
| 235 | [Partition Labels](https://leetcode.com/problems/partition-labels/) | Medium | Greedy | 12 |
| 236 | [Valid Parenthesis String](https://leetcode.com/problems/valid-parenthesis-string/) | Medium | Greedy | 12 |
| 237 | [Dota2 Senate](https://leetcode.com/problems/dota2-senate/) | Medium | Greedy | 12 |
| 238 | [Eliminate Maximum Number of Monsters](https://leetcode.com/problems/eliminate-maximum-number-of-monsters/) | Medium | Greedy | 12 |
| 239 | [Jump Game VII](https://leetcode.com/problems/jump-game-vii/) | Medium | Greedy | 12 |
| 240 | [Longest Turbulent Array](https://leetcode.com/problems/longest-turbulent-subarray/) | Medium | Greedy | 12 |
| 241 | [Maximum Length of Pair Chain](https://leetcode.com/problems/maximum-length-of-pair-chain/) | Medium | Greedy | 12 |
| 242 | [Maximum Points You Can Obtain From Cards](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/) | Medium | Greedy | 12 |

### Bit Manipulation — `problems/12-bit-manipulation/`

| # | Problem | Level | Pattern | Week |
| --- | --- | --- | --- | --- |
| 243 | [Counting Bits](https://leetcode.com/problems/counting-bits/) | Easy | Bit Manipulation | 12 |
| 244 | [Missing Number](https://leetcode.com/problems/missing-number/) | Easy | Bit Manipulation | 12 |
| 245 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | Easy | Bit Manipulation | 12 |
| 246 | [Reverse Bits](https://leetcode.com/problems/reverse-bits/) | Easy | Bit Manipulation | 12 |
| 247 | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) | Medium | Bit Manipulation | 12 |
| 248 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | Bit Manipulation | 12 |
| 249 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | Medium | Bit Manipulation | 12 |
| 250 | [Add Binary](https://leetcode.com/problems/add-binary/) | Easy | Bit Manipulation | 12 |

---

Generated from `src/dsaSheet.ts` by `scripts/build-student-repo.mjs`. Send corrections to [adityabakshi1011@gmail.com](mailto:adityabakshi1011@gmail.com).
