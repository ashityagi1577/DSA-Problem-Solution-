/*
Problem Number: 7
Problem Name: Reverse Integer


Problem Link:
https://leetcode.com/problems/reverse-integer/description/

Solution Link:
https://leetcode.com/problems/reverse-integer/submissions/2008339607

*/

class Solution {
    public int reverse(int x) {
    int rev=0;


      while(x!=0){
        int lastDigit=x%10;

        if(rev > Integer.MAX_VALUE / 10 ||
               rev < Integer.MIN_VALUE / 10){
                return 0;
            }
        rev=rev*10+lastDigit;
        x=x/10;
      } 

      
      return rev;
     
    }
}
