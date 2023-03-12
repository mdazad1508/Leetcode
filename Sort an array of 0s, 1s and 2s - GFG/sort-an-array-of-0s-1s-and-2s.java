//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    
    {
       int count_zero =0;
       int count_one =0;
       int count_two =0;
       
       for(int i=0;i<a.length;i++){
           if(a[i]==0){
               count_zero++;
           }else if(a[i]==1){
               count_one++;
           }else{
               count_two++;
           }
       }
       
       for(int i=0;i<count_zero;i++){
           a[i]=0;
       }
       
       for(int i=count_zero;i<count_zero +count_one;i++){
           a[i]=1;
       }
       
       for(int i=count_zero+count_one;i<count_zero+count_one+count_two;i++){
           a[i]=2;
       }
    }
    
    static void swap(int [] arr, int a , int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] =temp;
        
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends