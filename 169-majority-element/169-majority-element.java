class Solution {
    public int majorityElement(int[] arr) {
        
        //moore's voting algortihm
        
        int res = 0;  //considering 1st element as majority
        int count = 1;

        //finding candidate
        for (int i = 1; i < arr.length; i++){

            if(arr[res]==arr[i]){
                count++;
            }else{
                count--;
            }

            if(count==0) {
                count=1;
                res=i;
            }
        }

        //checking if the candidte is majority or not;

        count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[res]==arr[i]){
                count++;
            }
        }
        if(count<arr.length/2) res=-1;

        return arr[res];

        
    }
}