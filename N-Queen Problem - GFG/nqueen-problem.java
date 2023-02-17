//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        
        boolean [][] board = new boolean[n][n];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        fun(board,ans,0);
        return ans;
    
    }
    
    static void fun(boolean [][] board,ArrayList<ArrayList<Integer>> allBoard, int col){
        
        if(col==board.length){
            save(board,allBoard);
            return;
        }
        
        for(int row=0;row<board.length;row++){
            
            if(isSafeToPlace(row,col,board)){
                board[row][col] =true;
                fun(board,allBoard,col+1);
                board[row][col]=false;
            }
        }
    }
    
    static void save(boolean [][] board, ArrayList<ArrayList<Integer>> list){
        
        ArrayList<Integer> data = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                
                if(board[j][i]==true){
                    data.add(j+1);
                }
            }
        }
        
        list.add(data);
    }
    
    static boolean isSafeToPlace(int row, int col , boolean [][] board){
        
        // horizontal direction 
        
        for(int i=0;i<board[0].length;i++){
            if(board[row][i]==true){
                return false;
            }
        }
        
        //vertical direction
        
        for(int j=0;j<board.length;j++){
            if(board[j][col]==true){
                return false;
            }
        }
        
        //upper left 
        
        for(int r =row,c=col;r>=0 && c>=0;r--,c-- ){
            if(board[r][c]==true){
                return false;
            }
        }
        
        //uppper right
        
        for(int r=row,c=col;r>=0 && c<board.length;r--,c++){
             if(board[r][c]==true){
                return false;
            }
        }
        
        //lower left
        
        for(int r=row,c=col;r<board.length && c>=0;r++,c--){
             if(board[r][c]==true){
                return false;
            }
        }
        
        //lower right
        
        for(int r=row,c=col;r<board.length && c<board.length; r++,c++){
             if(board[r][c]==true){
                return false;
            }
        }
        
        return true;
    }
}