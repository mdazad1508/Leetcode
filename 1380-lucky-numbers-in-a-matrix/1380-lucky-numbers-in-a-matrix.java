class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        ArrayList<Integer> list = new ArrayList<>();
           
        for(int i=0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            int column =0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    column=j;
                    
                }
            }
            int max =Integer.MIN_VALUE;
            
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][column]>max){
                    max =matrix[k][column];
                }
            }
            
            if(min==max){
                list.add(max);
            }
        }
            
        return list;
        
    }
}