class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    
        int start =0;
        int end = matrix[0].length-1;
        
        while(end>=0 && start<=matrix.length-1){
            
            if(target<matrix[start][end]){
                end--;
            }else if(target>matrix[start][end]){
                start++;
            }else{
                
                return true;
                
            }
        }
        return false;
        
    }
}