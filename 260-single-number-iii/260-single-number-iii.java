class Solution {
    public int[] singleNumber(int[] nums) {
        
        int [] arr = new int[2];
        
        int xor =0;
        int res1=0;
        int res2=0;
    
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        
        int rightMostSet = xor & ~(xor-1);
        
        for(int j=0;j<nums.length;j++){
            
            if((rightMostSet & nums[j])!=0){
                res1 = res1 ^ nums[j];
            }else{
                res2 = res2 ^ nums[j];
            }
            
            
        }
        
        arr[0]=res1;
        arr[1]=res2;
        
        return arr;
    }
}