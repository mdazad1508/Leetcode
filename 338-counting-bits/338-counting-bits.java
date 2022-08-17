class Solution {
    public int[] countBits(int n) {
        
        int [] arr = new int[n+1];
        
        for(int i=0;i<n+1;i++){
            arr[i] = countDigit(i);
        }
        return arr;
    }
    static int countDigit(int n){
        int count =0;
        
        for(int i=0;i<digits(n);i++){
            if(((n>>i)&1)==1){
                count ++;
            }
        }
        return count;
    }
    static int digits(int n){
        int count =0;
        while(n!=0){
            count++;
            n=n/2;
        }
        return count;
    }
}
