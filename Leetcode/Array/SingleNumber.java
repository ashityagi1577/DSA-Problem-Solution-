/*
Problem Number: 136
Problem Name: Single Number


Problem Link:
https://leetcode.com/problems/single-number/description/

Solution Link:
https://leetcode.com/problems/single-number/submissions/2098240928

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
