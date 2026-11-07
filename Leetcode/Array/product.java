/*
Problem Number: 238
Problem Name:  Product of Array Except Self


Problem Link:
https://leetcode.com/problems/product-of-array-except-self/description/

Solution Link:
https://leetcode.com/problems/product-of-array-except-self/submissions/2018905382

*/

class Solution {
    public int[] productExceptSelf(int[] nums) {

     int c =0;
     int n = nums.length;
     int in =-1;
      int mul = 1;
     for(int i=0;i<n;i++){
      if(nums[i]==0){
    c++;
    in=i;
      }
      else{
     mul*=nums[i];
      }
     }  
     if(c>1){
        Arrays.fill(nums,0);
     } 
     else if(c==1){
        nums[in]=mul;
        for(int i=0;i<n;i++){
            if(i!=in){
            nums[i]=0;
            }
        }
     }
     else{
        for(int i=0;i<n;i++){
            nums[i]=mul/nums[i];
        }
     }
     return nums;
    }
}
        
    