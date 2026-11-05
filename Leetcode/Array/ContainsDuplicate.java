/*
Problem Number: 217
Problem Name: Contains Duplicate


Problem Link:
https://leetcode.com/problems/contains-duplicate/description/


Solution Link:
https://leetcode.com/problems/contains-duplicate/submissions/2095682073
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
