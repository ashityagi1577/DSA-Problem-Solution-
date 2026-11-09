/*
Problem Number: 242
Problem Name: Valid Anagram


Problem Link:
https://leetcode.com/problems/valid-anagram/description/

Solution Link:
https://leetcode.com/problems/valid-anagram/submissions/2080919070

*/

class Solution {
    public boolean isAnagram(String s, String t) {
        
     if(s.length() != t.length()) {
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
