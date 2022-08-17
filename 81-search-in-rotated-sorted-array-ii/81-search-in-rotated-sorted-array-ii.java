class Solution {
    public boolean search(int[] nums, int target) {
        
        int index =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                index = i;
            }
        }
        
        
        
        int start = 0;
        int end = index;
          while(end>=start){
            int mid = (start +end)/2;
            
            if(target>nums[mid]){
                start = mid+1;
            }else if(target<nums[mid]){
                end = mid-1;
            }else{
                return true;
            }
        }
         
        int start1 = index+1;
        int end1 = nums.length-1;
          while(end1>=start1){
            int mid1 = (start1 +end1)/2;
            
            if(target>nums[mid1]){
                start1 = mid1+1;
            }else if(target<nums[mid1]){
                end1 = mid1-1;
            }else{
                return true;
            }
        }
        
        return false;
        
        
    }
}