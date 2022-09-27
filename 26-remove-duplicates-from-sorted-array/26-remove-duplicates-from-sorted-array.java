class Solution {
    public int removeDuplicates(int[] nums) {
        
       int count =0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            
        }
        
        int insertIndex =1;
        
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]!=nums[i-1]){
                nums[insertIndex]=nums[i];
                insertIndex++;
                
            }
        }
        
        return nums.length-count;
    }   
        
}