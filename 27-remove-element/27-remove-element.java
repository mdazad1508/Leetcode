class Solution {
    public int removeElement(int[] nums, int val) {
        
       int low = 0;
        int high = nums.length-1;
        
        if(nums.length==1){
            if(nums[0]!=val) return 1;
            else return 0;
        };
        
        while(low<high){
            
            if(nums[low]==val && nums[high]!=val){
                swap(nums,low,high);
                low++;
                high--;
                
            }
            if(nums[low]==val && nums[high]==val){
                high--;
            }
            if(nums[low]!=val && nums[high]!=val){
                low++;
            }
            if(nums[low]!=val && nums[high]==val){
                low++;
            }
        }
        
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val) count++;
        }
        
        return nums.length-count;
       
    }
    static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}