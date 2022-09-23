class Solution {
    public int singleNonDuplicate(int[] nums) {
        
//         if(nums.length==1) return nums[0];
//         if(nums[0]!=nums[1]) return nums[0];
//         if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        
//        for(int i=1;i<nums.length-1;i++){
           
//            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
//                return nums[i];
//            }
//        }
        
//         return nums[0];
        
        int low =0;
        int high= nums.length-1;
        if (nums.length==1) return nums[0];
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(mid==0 && nums[mid]!=nums[mid+1]) return nums[mid];
            if(mid==nums.length-1 && nums[mid]!=nums[mid-1]) return nums[mid];
            
           if(nums[mid]==nums[mid-1]){
               if((mid-1)%2==1) high=mid-2;
               else low =mid+1;
           }
           if(nums[mid]==nums[mid+1]){
               if((mid+1)%2==1) low=mid+2;
               else high=mid-1;
           }
           
           if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
               return nums[mid];
           }
        }
     return -1;
   
    }
}    
    