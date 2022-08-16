class Solution {
    public int tribonacci(int n) {
        
      ArrayList<Integer> list = new ArrayList<>();
        
        list.add(0);
        list.add(1);
        list.add(1);
        
        for(int i=3;i<=n;i++){
            list.add(i, (list.get(i-1) + list.get(i-2) + list.get(i-3)));
            
        }
        
        return list.get(n);
    }
}