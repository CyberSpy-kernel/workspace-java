public class ACP18 { // ACP18 = LL
  Node head;
  class Node {
    String data;
    Node next;
    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }


  // add - first, last
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }
  }

  public void addLast(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }
    Node currNode = head;
    while(currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  // delete first
  public void deleteFirst() {
    if(head == null) {
      System.out.println("The list is empty");
      return;
    }
  }

  // delete last 
  public void deleteLast() {
    if(head == null) {
      System.out.println("The list is empty");
      return;
    }
    if(head.next == null) {
      head = null;
      return;
    }
    Node secondLast = head;
    Node lastNode = head.next;
    while(lastNode.next != null) {
      lastNode = lastNode.next;
      secondLast = secondLast.next;
    }
    secondLast.next = null;
  }

  // print
  public void printList() {
    if(head == null) {
      System.out.println("list is empty");
      return;
    }

    Node currNode = head;
    while(currNode != null) {
      System.out.println(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println("Null");
  }
  public static void main(String[] args) {
    ACP18 list = new ACP18();
    list.addFirst("a");
    list.addFirst("is");
    list.printList();

    list.addLast("list");
    list.printList();

    list.addFirst("this");
    list.printList();

    list.deleteFirst();
    list.printList();

    list.deleteFirst();
  }
  
}
