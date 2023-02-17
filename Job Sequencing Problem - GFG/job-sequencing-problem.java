//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        
        //we will do job according to maximum profit
        //job with maximum profit will be done first;
        
        
        myComparator mc = new myComparator();
        Arrays.sort(arr,mc);
        
        //find maximum deadline, so that we can crete empty slot of maximum deadline time
        
        int max_deadline =arr[0].deadline;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i].deadline>max_deadline){
                max_deadline=arr[i].deadline;
            }
        }
        
        boolean [] result = new boolean[max_deadline+1];
        //here 0th index will be ignored,index from 1 to max_deadline ..so we have taken extra length
        
        
        int profit =0;
        int job =0;
        
        for(int i=0;i<arr.length;i++){
            
            for(int j=arr[i].deadline;j>0;j--){     //note i>0 not i>=0 0th index will never breached 
                
                
                //empty slot
                if(result[j]==false){
                    
                    result[j]=true;
                    profit += arr[i].profit;
                    job++;
                    break;
                    
                    //one slot is taken for this job, so now cheack for other job. 
                    
                    
                }
            }     
        }
        
       
        
        //unit of time consumed == no of jobs done
        
        int [] ans = new int[2];
        ans[0] = job;
        ans[1] =profit;
        
        return ans;
        
        
    }
}

/*

its already defined;
class Job {
    int id, deadline, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/

class myComparator implements Comparator<Job>{
    public int compare(Job j1 , Job j2){
        //i want to sort according to profit in desending order
        
        if(j1.profit<j2.profit){
            return 1;  //reverse
        }else if(j1.profit>j2.profit){
            return -1;  //ignore
        }else{
            return 0;
        }
        
        //alternative 
       // return j2.profit -j1.profit;
    }
}
