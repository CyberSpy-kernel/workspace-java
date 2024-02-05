import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

// Tree - data structure

public class A0073 {

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {
    static int index = -1;
    public static Node buildTree(int nodes[]) {
      index++;
      if(nodes[index] == -1) {
        return null;
      }

      Node newNode = new Node(nodes[index]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode;
    }
  }

  // preorder
  
  public static void preorder(Node root) {
    if(root == null) {
      return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
  }

  // inorder

  public static void inorder(Node root) {
    if(root == null) {
      return;
    }

    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }

  // postorder

  public static void postorder(Node root) {
    if(root == null) {
      return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
  }

  // countOfNodes

  public static void levelOrder(Node root) {
    if (root == null) {
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while (!q.isEmpty()) {
      Node currNode = q.remove();
      if(currNode == null) {
        System.out.println();
        if(q.isEmpty()) {
          break;
        } else {
          q.add(null);
        }
      } else {
        System.out.print(currNode.data+" ");
        if(currNode.left != null) {
          q.add(currNode.left);
        } 
        if(currNode.right != null) {
          q.add(currNode.right); 
        }
      }
      
    }
  }

  // countOfNodes

  public static int countOfNodes(Node root) {
    if(root == null) {
      return 0;
    }
    int leftNodes = countOfNodes(root.left);
    int rightNodes = countOfNodes(root.right);

    return leftNodes + rightNodes + 1;
  }

  // sumOfNodes

  public static int sumOfNodes(Node root) {
    if(root == null) {
      return 0;
    }
    int leftSum = sumOfNodes(root.left);
    int rightSum = sumOfNodes(root.right);

    return leftSum + rightSum + root.data;
  }

  // height

  public static int height(Node root) {
    if(root == null) {
      return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    int myHeight = Math.max(leftHeight, rightHeight) + 1;

    return myHeight;
  }

  // diameter 

  public static int diameter(Node root) {
    if(root == null) {
      return 0;
    }
    int diam1 = diameter(root.left);
    int diam2 = diameter(root.right);
    int diam3 = height(root.left) + height(root.right) + 1;

    return Math.max(diam3, Math.max(diam1, diam2));
  }

  static class TreeInfo {
    int ht;
    int diam;

    TreeInfo(int ht, int diam) {
      this.ht = ht;
      this.diam = diam;
    }
  }

  // diameter2

  public static TreeInfo diameter2(Node root) {
    if(root == null) {
      return new TreeInfo(0, 0);
    }


    TreeInfo left = diameter2(root.left) ;
    TreeInfo right = diameter2(root.right);

    int myHeight = Math.max(left.ht, right.ht) + 1;

    int diam1 = left.diam;
    int diam2 = right.diam;
    int diam3 = left.ht + right.ht + 1;

    int mydiam = Math.max(Math.max(diam1, diam2), diam3);

    TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
    return myInfo;
  }

  // subtree

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val = val;} 
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
  public boolean isIdentical(TreeNode root, TreeNode subRoot) {
    if(root == null && subRoot == null) {
      return true;
    }
    if(root == null || subRoot == null) {
      return false;
    }
    if(root.val == subRoot.val) {
      return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }
    return false;
  }
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if(subRoot == null) {
      return true;
    }
    if(root == null) {
      return false;
    }
    if(root.val == subRoot.val) {
      if(isIdentical(root, subRoot)) {
        return true;
      }
    }
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  public static void main(String[] args) {
    int nodes[] = {1,2,4, -1,-1,5, -1,-1,3,-1,6,-1,-1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);

    // System.out.println(root.data);
    // preorder(root);
    // inorder(root);
    // postorder(root);
    // levelOrder(root); 
    // System.out.println(countOfNodes(root));
    // System.out.println(sumOfNodes(root));
    // System.out.println(height(root));
    // System.out.println(diameter(root));
    // System.out.println(diameter2(root).diam);

    /* ---------error-------- */
    // int nodes1[] = {1,2,4};
    // BinaryTree subTree = new BinaryTree();
    // Node root1 = subTree.buildTree(nodes1);
    // System.out.println(isSubtree(root, subTree));

  }
}
