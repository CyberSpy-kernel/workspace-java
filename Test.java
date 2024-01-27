class Test {
  Node head;
  int size;

  Test() {
    size = 0;
  }

  // Node 
  class Node {
    String data;
    Node next;
    Node(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // add first
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // add last 
  public void addLast(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  // print
  public void printList() {
    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + " => ");
      currNode = currNode.next;
    }
  }

  public static void main(String[] args) {
    Test ll = new Test();
    ll.addFirst("this");
    ll.addLast("is");
    ll.printList();
  }
}