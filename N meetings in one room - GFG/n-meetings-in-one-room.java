//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class meeting{
    int start;
    int end;
    meeting(int start, int end){
        this.start=start;
        this.end=end;
    }
}

class mycomparator implements Comparator<meeting>{
     public int compare(meeting m1, meeting m2){
       // return m1.end - m2.end;
       
       if(m1.end<m2.end){
           return -1 ; //do nothing
       }else if(m1.end>m2.end){
           return 1;     //reverse
       }else if(m1.start<m2.start){
           return -1;     //do nothing
       }else if(m1.start>m2.start){
           return 1;      //reverse
       }else {
           return 0;
       }
    }
}

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<meeting> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(new meeting(start[i],end[i]));
        }
        
        mycomparator mc = new mycomparator();
        Collections.sort(list,mc);
        
        int end_limit = list.get(0).end;
        int count =1;
        
        for(int i=1;i<list.size();i++){
            if(list.get(i).start>end_limit){
                count++;
                end_limit=list.get(i).end;
            }
        }
        
        return count;
        
        
        
        
    }
    
    //jiska end time phele hoga uska meeting phele karwao in order to maximise meetings..
    // so we created a datatype which stores start time and end time of a meeting , then sorted it according
    // to minimun end time 
}
