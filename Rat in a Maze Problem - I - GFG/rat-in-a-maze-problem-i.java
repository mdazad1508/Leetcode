//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        int [][] visited = new int[n][n];
        if(m[0][0]==1){
            fun(0,0,"",ans,m , visited, n);
           
        }
            return ans;
        
    }
    
    static void fun(int x, int y ,String s , ArrayList<String> list, int [][] arr,int [][]vis, int n ){
        
        if(x==n-1 && y==n-1){
            list.add(s);
            return ;
        }
        
        //follow striver video
        
        //down
        
        if(x+1<n && vis[x+1][y]!=1 && arr[x+1][y]==1){
            vis[x][y]=1;
            fun(x+1,y,s+"D",list,arr,vis,n);
            vis[x][y]=0;
        }
        
        //left
        
        if(y-1>=0 && vis[x][y-1]!=1 && arr[x][y-1]==1){
            vis[x][y]=1;
            fun(x,y-1,s+"L",list,arr,vis,n);
            vis[x][y] =0;
        }
        
        //right
        
        if(y+1<n && vis[x][y+1]!=1 && arr[x][y+1]==1){
            vis[x][y] =1;
            fun(x, y+1, s + "R", list ,arr, vis , n);
            vis[x][y]=0;
        }
        
        
        //up
        
        if(x-1>=0 && vis[x-1][y]!=1 && arr[x-1][y]==1){
            vis[x][y] =1;
            fun(x-1, y ,s+ "U", list , arr, vis , n);
            vis[x][y]=0;
        }
        
        
        
        
    }
}