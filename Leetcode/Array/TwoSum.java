/*
Problem Number: 1
Problem Name: Two Sum


Problem Link:
https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array

Solution Link:
https://leetcode.com/problems/two-sum/submissions/2022459641

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            int r=nums[i]+nums[j];

            if(r==target){
                return new int[] {i,j};
            }
        }
       }
       return new int[] {};
    }
} 
