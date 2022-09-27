class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        ArrayList<String> list = new ArrayList<>();
       int startingindex =0;
        
        if(nums.length==1){
            list.add(Integer.toString(nums[0]));
            return list;
        }
       
        for(int i=1;i<nums.length;i++){
            
            if((nums[i]-nums[i-1])!=1){
                
                if(nums[startingindex]==nums[i-1]){
                    list.add(Integer.toString(nums[startingindex]));
                    startingindex=i;
                }else{
                    list.add(nums[startingindex]+ "->" +nums[i-1]);
                    startingindex=i;
                }
                
                
                if(i==nums.length-1){
                    list.add(Integer.toString(nums[i]));
                }
                
            }else{
                if(i==nums.length-1){
                    list.add(nums[startingindex] + "->" + nums[nums.length-1]);
                }
            }
        }
        
        return list;
    }
}