class Solution {
    public int arrangeCoins(int n) {
        
        int length=n;
        
        for(int i=1;i<n;i++){
            if(length<i) return i-1;
            if(length==i) return i;
            length=length-i;
            
        }
        
        return 1;
    }
    
}