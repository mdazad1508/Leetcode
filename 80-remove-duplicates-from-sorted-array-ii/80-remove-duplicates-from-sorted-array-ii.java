class Solution {
    public int removeDuplicates(int[] nums) {
        
     
        
        int [] temp =nums.clone();
          int count=0;
        
        for(int i=2;i<nums.length;i++){
            if(nums[i]==nums[i-1] && nums[i]==nums[i-2]){
                count++;
            }
        }
        
        int insertIndex =2;
        
        for(int i=2;i<temp.length;i++){
            
            if(temp[i]!=temp[i-1] || temp[i]!=temp[i-2] ){
                
                nums[insertIndex]=temp[i];
                insertIndex++;
                
                
            }
        }
     return temp.length-count;
    }
}