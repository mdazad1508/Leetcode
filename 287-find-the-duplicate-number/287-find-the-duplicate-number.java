class Solution {
    public int findDuplicate(int[] nums) {
    
/*    
 naive approach = 0(nlogn)
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return nums[i];
        }
        
        return -1;
    
    
    */
        
// efficient approach - 0(n)
        
    int [] arr = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            
            arr[nums[i]]++;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1) return i;
        }
    
    return -1;
    } 
}