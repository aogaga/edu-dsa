class SumLinkedList{
	 // Linked List Node
    static class Node {
      int value;
      Node next;
    };

     static Node insertAtHead(Node temp_head, int new_value) {
      Node new_Node = new Node();
      new_Node.value = new_value;
      new_Node.next = (temp_head);
      (temp_head) = new_Node;

      return temp_head;
    }


    public static void main(String [] args){

		 Node head = null;

        // Linked List = 1->2->3->4->5
        head = insertAtHead(head, 2);        
        head = insertAtHead(head, 8);        
        head = insertAtHead(head, 5);        
        head = insertAtHead(head, 1);        
        head = insertAtHead(head, 3);

       System.out.println(sum(head));
	}

	public static int sum(Node node){
		if(node == null){
			return 0;
		}


		return node.value + sum(node.next);
	}
}