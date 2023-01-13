//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        int ans =1;
        
        int low=0;
        int high = S.length() -1;
        
        while(low<=high){
            if(S.charAt(low) !=S.charAt(high)){
                ans=0;
                break;
            }
            low++;
            high--;
        }
        
        return ans;
        
    }
};