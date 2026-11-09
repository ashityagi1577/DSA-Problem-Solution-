/*
Problem Number: 283
Problem Name: Move Zeroes


Problem Link:
https://leetcode.com/problems/move-zeroes/description/

Solution Link:
https://leetcode.com/problems/move-zeroes/submissions/2098222096

*/

class Solution {
    public void moveZeroes(int[] nums) {
       int j=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
        }
       }
      
    
    }
}
