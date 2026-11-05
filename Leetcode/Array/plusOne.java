/*
Problem Number: 66
Problem Name: Plus One


Problem Link:
https://leetcode.com/problems/plus-one/description/

Solution Link:
https://leetcode.com/problems/plus-one/submissions/2148464500
*/


class Solution {
    public int[] plusOne(int[] digits) {
       int size=digits.length;
       int carry=1;

       for(int i=digits.length-1;i>=0;i--){
        int sum=digits[i]+carry;
        digits[i]=sum%10;
        carry=sum/10;
       }
       if(carry!=0){
        size++;
       }

       int arr[]=new int[size];
       int j=0;
       int i=0;

       if(carry!=0){
        arr[j]=carry;
        j++;
       }

       while(j<size){
        arr[j]=digits[i];
        j++;
        i++;
       }
       return arr;
    }
}