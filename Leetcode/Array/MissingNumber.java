/*
Problem Number: 268
Problem Name: Missing Number


Problem Link:
https://leetcode.com/problems/missing-number/description/

Solution Link:
https://leetcode.com/problems/missing-number/submissions/2019839660

*/

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length+1;
        int[] freq=new int[n+1];

        for(int a:nums){
            freq[a]=1;
        }

        for(int i=0;i<=n;i++){
            if(freq[i]==0){
                return i;
            }
        }
        return 0;
    }
}