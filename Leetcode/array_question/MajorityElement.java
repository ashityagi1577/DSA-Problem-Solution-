/*
Problem Number: 169
Problem Name: Majority Element


Problem Link:
https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array

*/

class Solution {
    public int majorityElement(int[] nums) {
     Arrays.sort(nums);
     return nums[nums.length/2];
}
        
    }
