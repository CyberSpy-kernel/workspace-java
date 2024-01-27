
/* 
 * Title: Linked List
 */

public class ACP08 {
  Node head;
  private int size;

  ACP08() {
    this.size = 0;
  }

  // Node
  class Node { 
    String data;
    Node next;  // new thing to learn

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
    if (head == null) { 
      head = newNode;
      return;
    }
    Node currNode = head;
    while(currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next  = newNode;
  }

  // print
  public void printList() {
    if(head == null) {
      System.out.println("List is empty");
      return;
    }
    Node currNode = head;
    while(currNode != null) {
      System.out.print(currNode.data + " => ");
      currNode = currNode.next;
    }
    System.out.println("NULL");
  }

  // delete first
  public void deleteFirst() {
    if(head == null) {
      System.out.println("The list is empty");
      return;
    }
    head = head.next;
    size--;
  }

  // delete last
  public void deleteLast() {
    if(head == null) {
      System.out.println("The last is empty");
      return;
    }
    size--;
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

  // get size 
  public int getSize() {
    return size;
  }

  
  public static void main(String[] args) {
    ACP08 list = new ACP08();
    list.addFirst("a");
    list.addFirst("is");
    list.printList();

    list.addLast("List");
    list.printList();

    list.addFirst("this");
    list.printList();

    list.deleteFirst();
    list.printList();

    list.deleteLast();
    list.printList();

    
    System.out.println(list.getSize());
    list.addFirst("this");
    System.out.println(list.getSize());

  }
}

