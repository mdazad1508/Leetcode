class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String first = "";
        String second ="";
        boolean result = false;
        
        for(int i=0;i<word1.length;i++){
            first = first + word1[i];
        }
        
        for(int j=0;j<word2.length;j++){
            second = second + word2[j];
        }
        
        if(first.equals(second)){
            result = true;
        }
        return result;
    
}
}