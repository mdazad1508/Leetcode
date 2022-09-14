class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix[low].length-1;
        
        while(low<=matrix.length-1 && high>=0){
            
            if(matrix[low][high]==target){
                return true;
            }else if(target<matrix[low][high]){
                high--;
            }else{
                low++;
            }
        }
        return false;
    }
}