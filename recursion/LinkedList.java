
public class LinkedList {
  public Node head;
  public Node tail;

  public void add(Node node) {
    if (head == null && tail == null) {
      head = node;
      tail = node;
    } else {
      tail.setNext(node);
      tail = tail.getNext();
    }

  }

  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public Node getTail() {
    return tail;
  }

  public void setTail(Node tail) {
    this.tail = tail;
  }
}