class Solution {
    public int findKthPositive(int[] arr, int k) {
        
      ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<2001;i++){
            list.add(i,i+1);
        }
        
        for(int j=0;j<arr.length;j++){
            list.set(arr[j]-1,0);
        }
        
        int m=0;
        while(true){
            if(m==list.size()) break;
            
            if(list.get(m)==0) list.remove(m);
            else m++;
        }
        
        
        return list.get(k-1);
       
        
    }
}