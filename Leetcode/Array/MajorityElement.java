/*
Problem Number: 169
Problem Name: Majority Element


Problem Link:
https://leetcode.com/problems/majority-element/description/

Solution Link:
https://leetcode.com/problems/majority-element/submissions/2013431621

*/

class Solution {
    public int majorityElement(int[] nums) {
     Arrays.sort(nums);
     return nums[nums.length/2];
}
        
    }
