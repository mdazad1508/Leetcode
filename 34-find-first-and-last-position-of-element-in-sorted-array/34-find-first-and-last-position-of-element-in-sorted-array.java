class Solution {
    public int[] searchRange(int[] nums, int target) {
       
          int [] arr = new int[2];
          arr[0] = findStartingIndex(nums,target);
          arr[1]= findEndingIndex(nums,target);
        
           return arr;    
    }
    
    public static int findStartingIndex(int [] nums,int target){
        int index =-1;
        
        int start= 0;
        int end = nums.length-1;
        
        while(start<=end){
            
            int mid= (start+end)/2;
            
            if(target<=nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }
            if(target==nums[mid]){
                index = mid;
            }
        }
        
        
         return index ;
    }
     public static int findEndingIndex(int [] nums,int target){
        int index =-1;
        
        int start= 0;
        int end = nums.length-1;
        
        while(start<=end){
            
            int mid= (start+end)/2;
            
            if(target>=nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]){
                end = mid-1;
            }
            if(target==nums[mid]){
                index = mid;
            }
        }
        
        
         return index ;
    }
}