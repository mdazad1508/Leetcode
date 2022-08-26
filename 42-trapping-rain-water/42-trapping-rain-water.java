class Solution {
    public int trap(int[] height) {
        
        int water =0;
        
        int [] lmax = new int [height.length];
        int [] rmax = new int[height.length];
        
        lmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            lmax[i] = max(height[i],lmax[i-1]);
        }
        
        rmax[height.length-1]= height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rmax[i]= max(height[i],rmax[i+1]);
        }
        
        for(int i=1;i<height.length-1;i++){
            water = water + (min(lmax[i],rmax[i])-height[i]);
        }
        
        return water;
    }
    
    static int max(int a,int b){
        if(a>b) return a;
        else return b;
    }
    
    static int min(int a, int b){
        if(a>b) return b;
        else return a;
    }
}