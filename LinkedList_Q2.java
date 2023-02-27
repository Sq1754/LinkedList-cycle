//Q2-> check wheather the list contains a cycle or loop 

public class LinkedList_Q2 {
	node head;
	private int size;
LinkedList_Q2(){
	size= 0;
}
  class node{
	  int data;
	  node next;
	
	  node(int data){
		  this.data=data;
		  this.next=null;
		  size++;
	  }
  }
  

 public boolean hasCycle(node head) {
	 
	 node turtle = head;
	 node rabbit = head;
	 
	 while(rabbit != null && rabbit.next != null) {
		 turtle = turtle.next;
		 rabbit = rabbit.next.next;
		 
		 if(turtle == rabbit)
			 return true;
	 }
	 
	 return false;
 }
 
  public static void main(String[]args) {
	  
	  
	  
  }
	
}
