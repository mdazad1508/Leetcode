class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int [] temp1 = nums1.clone();
        int [] temp2 = nums2.clone();
        
        int [] temp = new int[nums1.length + nums2.length];
        
        for(int i=0;i<temp1.length;i++){
            temp[i] = temp1[i];
        }
        
        for(int i=0;i<temp2.length;i++){
            temp[i+temp1.length]=temp2[i];
        }
        
        Arrays.sort(temp);
        
        double median =0;
        
        if(temp.length%2==1){
            median = temp[temp.length/2];
        }else{
            median = (temp[temp.length/2] +temp[(temp.length/2)-1])/2.0f;
            
        }
        
        return median;
    }
}