class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
       for(int i=0;i<nums.length;i++){
           if(nums[i]==pivot){
               list.add(nums[i]);
           }
       } 
        int m=0;
        
        for(int k=0;k<nums.length;k++){
            if(nums[k]<pivot){
                list.add(m,nums[k]);
                    m++;
            }
            else if(nums[k]>pivot){
                list.add(list.size(),nums[k]);
            }
        }
        
        
        
        
        
        int[] arr = new int[list.size()];
        
        for(int j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }
        
        return arr;
    }
}