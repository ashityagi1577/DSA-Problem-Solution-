/*
Problem Number: 20
Problem Name:Valid Parentheses


Problem Link:
https://leetcode.com/problems/valid-parentheses/description/

Solution Link:
https://leetcode.com/problems/valid-parentheses/submissions/2033071714

*/

class Solution {
    public boolean isValid(String s) {

        Stack<Character> temp = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(ch == '(' || ch == '{' || ch == '[') {
                temp.push(ch);
            }
            else {

                if(temp.isEmpty()) {
                    return false;
                }

                char top = temp.pop();

                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return temp.isEmpty();
    }
}
