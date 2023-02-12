//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
  
*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        
        if(node==null || node.next==null || k==1){
            return node;
        }
        
        Node start = node;
        Node curr = node;
        
        int i=1;
        while(i<k && curr.next!=null){
            curr=curr.next;
            i++;
        }
        
        Node end =curr;
        
        
        
        Node rest_head = reverse(end.next,k);
        reverseK(start,end);
        start.next=rest_head;
        
        return end;
        
    }
    
    static void reverseK(Node start, Node end){
        Node prev = null;
        Node curr =start;
        
        while(prev!=end){
            Node next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
    }
}

