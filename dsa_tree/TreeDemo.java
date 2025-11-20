import java.util.Scanner;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
    // @Override
    // public String toString() {
    //     return "Node [val=" + val + ", left=" + left + ", right=" + right + "]";
    // }
    
}

public class TreeDemo {

    /*

     10
   /    \
  20    30
 / \      \
40 50     60
   /
  70
    */


   static Scanner sc = new Scanner("10 20 40 -1 -1 50 70 -1 -1 -1 30 -1 60 -1 -1");
    static Node createTree2(){
        int data = sc.nextInt();
        if(data < 0){
            return null;
        }
        Node cn = new Node(data);
        cn.left = createTree2();
        cn.right = createTree2();
        return cn;
    }

    static Node createTree(){
        Node n1 = new Node(5);
        Node n2 = new Node(3);
        Node n3 = new Node(7);
        Node n4 = new Node(2);
        Node n5 = new Node(1);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;

        return n1;
    }

    static void inOrder(Node root){
        if(root == null){
            return;
        }

        String cv = String.valueOf(root.val);
        if(root.left!=null){
            cv = cv + ", Left: "+root.left.val;
        }
        if(root.right!=null){
            cv = cv + ", Right: "+root.right.val;
        }
        inOrder(root.left);
        System.out.println(cv);
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root == null){
            return;
        }

        String cv = String.valueOf(root.val);
        if(root.left!=null){
            cv = cv + ", Left: "+root.left.val;
        }
        if(root.right!=null){
            cv = cv + ", Right: "+root.right.val;
        }
        System.out.println(cv);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = createTree2();
        preOrder(root);
    }
}
