//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        
        	int n = sc.nextInt();
        
            Node head = new Node(sc.nextInt());
            Node tail = head;
        
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
        
            Solution ob = new Solution();
            head = ob.reverseList(head);
            printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends


//function Template for Java

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        
        
        /*
        
        Method 1: Using array List
        ArrayList<Integer> list = new ArrayList<>();
        
        Node curr=head;
        while(curr!=null){
            list.add(curr.data);
            curr=curr.next;
        }
        
        
        curr = head;
        int i=0;
        
        while(curr!=null){
            curr.data=list.get(list.size()-1-i);
            i++;
            curr=curr.next;
        }
        
        return head;
    */
    
    //Method 2 reversing links
   /* 
    Node curr=head;
    Node prev = null;
    
    while(curr!=null){
        
        Node next = curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    
    return prev;
     */
     
     //Method 3 recursive;
     
     
     if(head==null) return null;
     if(head.next==null) return head;
     
     
     Node rest_head = reverseList(head.next);
     Node rest_tail = head.next;
     rest_tail.next=head;
     head.next=null;
    
    
     return rest_head;
        
    }
}
