class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if(mat[0].length*mat.length!= r *c){
            return mat;
        }
        
      ArrayList<Integer> list  = new ArrayList<>();
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                list.add(mat[i][j]);
            }
        }
        
        int [][] arr = new int[r][c];
        
         int index =0;
        
        for(int k=0;k<arr.length;k++){
            
           for(int l=0;l<arr[k].length;l++){
                
                arr[k][l]=list.get(index);
                index++;
            }
        }
        
        return arr;
        
        
        
    }
}