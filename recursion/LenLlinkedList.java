
public class LenLlinkedList {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    list.add(node1);
    list.add(node2);
    list.add(node3);
    list.add(node4);
    System.out.println(lll(list.getHead()));
  }

  public static int lll(Node node) {

    if (node.getNext() == null) {
      return 1;
    }
    return 1 + lll(node.getNext());
  }
}
