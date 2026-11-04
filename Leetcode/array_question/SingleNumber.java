/*
Problem Number: 136
Problem Name: Single Number


Problem Link:
https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array

*/

class Solution {
    public int singleNumber(int[] nums) {
     int ans=0;
     for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                ans=nums[i];
            }
        }
     }
     return ans;
}
}
