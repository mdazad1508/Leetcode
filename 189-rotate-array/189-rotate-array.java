class Solution {
    public void rotate(int[] nums, int k) {
     
        
 //1. naive approach
      /* for(int i=0;i<k;i++){
           
            int start =0;
        int end = nums.length-1;
        
        while(start<end){
            swap(nums,start,end);
            start++;
        }
       }*/
   //2. o(1) approach (Not working when k>arr.length;)
        if(k==nums.length) return;
        while(k>nums.length){
            k=k-nums.length;;
        }
        if(k==nums.length) return;
        if(nums.length==1) return;
        int [] temp = new int[k];
        
        for(int i=0;i<k;i++){
            temp[i]=nums[nums.length-k +i];
        }
        
        for(int j=nums.length-1;j>=k;j--){
            nums[j] = nums[j-k];
        }
        
        for(int i=0;i<k;i++){
            nums[i] =temp[i];
        }
       
    }
    static void swap(int [] arr, int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}