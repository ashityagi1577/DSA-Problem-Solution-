/*
Problem Number: 217
Problem Name: Contains Duplicate


Problem Link:
https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array

*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
       
      Arrays.sort(nums);

      for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]){
            return true;
        }
      }
      return false;

    }
}
