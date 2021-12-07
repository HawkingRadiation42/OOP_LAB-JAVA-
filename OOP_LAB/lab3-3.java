import java.util.*;
public class Main{

    public static class node{
        int data;
        node next;
        node(int d) {
            this.data = d;
            next = null;
        }
    }
    node deleteFirst(node n){
      node temp = n;
      n=n.next;
      return n;
    }
    
    node deleteLast(node n){
      node temp = n;
      while(temp.next.next!=null){
        temp=temp.next;
      }
      temp.next=null;
      return n;
    }

    void show(node n){
      node temp=n;
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      System.out.println();
    }
  
    public static void main(String[] args)
    {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(30);
        node n4 = new node(40);
        node n5 = new node(50);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
    
        Main linked_list =  new Main();
        Main clone_list =  new Main();
        System.out.println("First Linked list is : ");
        linked_list.show(n1);
        clone_list = linked_list;
        //Deleting First Node
        n1=clone_list.deleteFirst(n1);
        //Deleting Last Node
        n1=clone_list.deleteLast(n1);
        
        System.out.println("Linked List after deletion of first and last element is : ");
        clone_list.show(n1);
    }
}

