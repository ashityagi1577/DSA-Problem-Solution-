/*
Problem Number: 9
Problem Name: Palindrome Number


Problem Link:
https://leetcode.com/problems/palindrome-number/description/

Solution Link:
https://leetcode.com/problems/palindrome-number/submissions/2008316362

*/

class Solution {
    public boolean isPalindrome(int x) {
       int original=x;
       int rev=0;

       if(x<0){
        return false;
       }
       
       while(x>0){
        int lastDigit=x%10;
        rev=rev*10+lastDigit;
        x=x/10;

       }
     if(rev==original){
        return true;
     }
     else{
        return false;
     }
    }
}