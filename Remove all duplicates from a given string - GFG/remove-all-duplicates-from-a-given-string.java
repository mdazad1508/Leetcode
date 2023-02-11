//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        
        // 0(n squre solution)
        
        String s = "";
        
       for(int i=0;i<str.length();i++){
           
           boolean is_non_dup = true;
           
           for(int j=0;j<i;j++){
               
               if(str.charAt(i)==str.charAt(j) ){
                   is_non_dup =false;
                   break;
               }
               
           }
           
          if(is_non_dup){
              s += str.charAt(i);
          }
          
       }
       
       return s;
    }
}

