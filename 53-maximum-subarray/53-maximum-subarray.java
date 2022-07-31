class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum_max=Integer.MIN_VALUE;
        int current=0;
        
       for(int i=0;i<nums.length;i++){
            current+=nums[i];
           
           if(current>sum_max)
                   sum_max=current;
           
           if(current<0)
               
               current=0;
           
       }      
     
    
    return sum_max;
        
   
    }
}