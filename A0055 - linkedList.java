

/* Title: Linked List
 * Ref: YouTube-ApnaCollege-V26
 */

 public class A0055 {
  Node head;
  private int size;

  A0055() {
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
    while(currNode.next != null) {
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

  public void reverseIterate() {

    if (head == null || head.next == null) {
      return;
    }
    Node prevNode = head;
    Node currNode = head.next;
    while (currNode != null) {
      Node nextNode = currNode.next;
      currNode.next = prevNode;

      // update
      prevNode = currNode;
      currNode = nextNode;
    }
    head.next = null;
    head = prevNode;
  }

  public Node reverseRecursive(Node head) {
    if(head == null || head.next == null){
      return head;
    }
    Node newHead = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;

    return newHead;
  }
  
  public static void main(String[] args) {
    A0055 list = new A0055();
    list.addLast("1");
    list.addLast("2");
    list.addLast("3");
    list.addLast("4");
    list.addLast("5");
    list.printList();


    list.head = list.reverseRecursive(list.head);
    list.printList();
  }
}

