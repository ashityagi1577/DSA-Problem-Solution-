/*
Problem Number: 16
Problem Name: 3 Sum Closet


Problem Link:
https://leetcode.com/problems/3sum-closest/description/

Solution Link:
https://leetcode.com/problems/3sum-closest/submissions/2182067620

*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int a=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;

            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];

                if(Math.abs(sum-target)<Math.abs(a-target)){
                    a=sum;
                }
                
                if(sum==target){
                    return sum;
                }
                else if(sum>target){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
    return a;
    }
}