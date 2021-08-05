
package linklist;
import static java.nio.file.Files.list;
import java.util.*;
import static java.util.Collections.list;

public class LinkList {
   //Class node 
    class newNode{
        int value ; 
        newNode next; 
    }
   
    newNode head; 
    
   public   void addNode(int x){
        newNode myNode = new newNode();
        myNode.value = x; 
        myNode.next = head; 
        head = myNode; 
    }
    
     static void deleteNode(LinkList l, int x){
    
            newNode cur = l.head;
            newNode prev = null; 
            while(cur.value  != x ){
            
                prev = cur; 
                cur = cur.next; 
                
            }
             if(cur.value != x){
             
                 System.out.println("Element to delete is not in the list\n");
                 ///return head; 
             }
             prev.next = cur.next; 
           
        
            //return head; 
    
    }
    
   public String toString(){
   
       
       newNode n = head; 
       String str = " ";
       while(n != null){
          str = str + (n.value) + "->" ; 
          n = n.next;
       }
   
       //str = str + "]";
   
       return str; 
   }

   public static void main(String[] args) {
       LinkedList<Integer> myList = new LinkedList<Integer>();
       LinkList list = new LinkList();
       list.addNode(10);
       list.addNode(20);
       list.addNode(30);
       list.addNode(100);
       
        System.out.println(list);
        
        System.out.println("Removal of an element from the list");
        
      deleteNode(list, 20);
        
        System.out.println(list);
       
       
}
}
