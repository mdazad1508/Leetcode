class Solution {
    public int findPeakElement(int[] nums) {
        
//          int peak =nums[0];
//         int j =0;
        
//         for(int i=1; i<nums.length;i++){
            
//             if(peak<nums[i]){
//                 peak =nums[i];
//                 j =i;

//             }
            
//             }
        
//           return j;

//         }
        
        int low =0;
        int high =nums.length;

        while(low<=high){
            int mid = low + (high-low)/2;
            //every independent array have a peak element
            //the question is based on the fact that if
            //left of the mid is greater than mid then peak must lie on left side
            // else right of mid is greater than mid then peak lie on right side

           if(
    (mid==0 || nums[mid]>=nums[mid-1]) && (mid==nums.length-1 || nums[mid]>=nums[mid+1])
           ){
               return mid;
           }

           if(mid>0 && nums[mid-1]>=nums[mid]){
               high=mid-1;
           }else{
               low=mid+1;
           }

        }
        return -1;
   
        
    }
    
}
