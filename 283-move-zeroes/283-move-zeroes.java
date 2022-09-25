class Solution {
    public void moveZeroes(int[] nums) {
        
        int point1=0;
        int point2=1;
        
        while(point1<=point2){
            
            if( point2>nums.length-1) break;
            
            if(nums[point1]==0 && nums[point2]!=0){
                swap(nums,point1,point2);
                point1++;
                point2++;
            }else if(nums[point1]==0 && nums[point2]==0){
                point2++;
            }else{
                point1++;
                point2++;
            }
        }
        
    
    }
    
    static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}