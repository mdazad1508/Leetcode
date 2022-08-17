class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
        
        while(end>=start){
            int mid = (start + end)/2;
            
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        
        return start;
        
        
        
        
    }
}