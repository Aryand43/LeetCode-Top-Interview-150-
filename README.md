## Arrays

### 1. Merge Sorted Array
- **Problem**: [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
- **Solution**: [Java](./Arrays/MergeSortedArray.java)
- **Approach**: Used a two-pointer technique, merging arrays from back to front to avoid overwriting.

### 2. Remove Element
- **Problem**: [Remove Element](https://leetcode.com/problems/remove-element/)
- **Solution**: [Java](./Arrays/RemoveElement.java)
- **Approach**: Used a two-pointer technique to overwrite elements equal to val, effectively removing them in-place.

### 3. Remove Duplicates from Sorted Array
- **Problem**: [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
- **Solution**: [Java](./Arrays/RemoveDuplicatesFromSortedArray.java)
- **Approach**: Used a two-pointer technique to keep track of unique elements and overwrite duplicates.

### 4. Remove Duplicates from Sorted Array II
- **Problem**: [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)
- **Solution**: [Java](./Arrays/RemoveDuplicatesFromSortedArrayII.java)
- **Approach**: Used a two-pointer technique to keep track of allowed elements (up to two occurrences of each).
- **Visual Explanation**: [Image](./Arrays/images/RemoveDuplicatesII_Explanation.png)

### 5. Majority Element
- **Problem**: [Majority Element](https://leetcode.com/problems/majority-element/)
- **Solution**: [Java](./Arrays/MajorityElement.java)
- **Approach**: Implemented the Boyer-Moore Voting Algorithm to find the majority element in linear time and constant space.