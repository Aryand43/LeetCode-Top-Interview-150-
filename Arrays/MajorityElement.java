class Solution {
    //Boyer-Moore Voting Algorithm - Time Complexity O(n) & Space Complexity O(1)
    public int majorityElement(int[] nums) {
            int candidate = 0;  
            int count = 0; 
            if(nums.length == 0){return 0;}
            for(int num : nums){
                if(count == 0){
                    candidate = num; 
                }
                count += (num == candidate) ? 1 : -1; 
            }
            count = 0;
            for(int num : nums){
                if(num == candidate){count++;}
            }
            if(count > nums.length / 2) {
                return candidate; 
            } else {
                throw new IllegalArgumentException("No majority element exists");
            }
        }
    }