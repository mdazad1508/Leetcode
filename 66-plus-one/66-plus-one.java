class Solution {
    public int[] plusOne(int[] digits) {
        
      int carry=1;
      int value =0;
        
    ArrayList<Integer> arr = new ArrayList<>();
        
      //  int [] arr = new int[digits.length];
        
        for(int i=0;i<digits.length;i++){
            
            arr.add(0,(digits[digits.length-1-i] + carry)%10);
            carry =  (digits[digits.length-1-i] + carry)/10;
        }
        
        if(carry>0){
            arr.add(0,carry);
        }
        
        int [] array = new int[arr.size()];
        
        for(int j=0;j<array.length;j++){
            array[j] = arr.get(j);
        }
        
        
          
        return array;
    }
}