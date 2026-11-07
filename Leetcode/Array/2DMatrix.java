/*
Problem Number: 240
Problem Name: Search a 2D Matrix II


Problem Link:
https://leetcode.com/problems/search-a-2d-matrix-ii/description/

Solution Link:
https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/2182427155

*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
