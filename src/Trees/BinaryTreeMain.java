package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeMain {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static  class BinaryTree{
        static int idx = -1;
        public static  Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1)
                return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return  newNode;

        }
    }
//    TC = O(N)
    public static void preOrderTraversal(Node root){
        if(root == null){
//            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static  void inorderTraversal(Node root){
        if(root == null)
        {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }

    public static  void postOrderTraversal(Node root){
        if(root == null)
        {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");

    }

    public static void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
           Node currNode = q.remove();
           if(currNode == null){
               System.out.println();
               if(q.isEmpty()){
                   break;
               }else{
                   q.add(null);
               }

           }else{
               System.out.print(currNode.data+" ");
               if(currNode.left != null){
                   q.add(currNode.left);
               }if(currNode.right !=null){
                   q.add(currNode.right);
               }
           }
        }
    }

    public static int countOfNode(Node root){
        if(root == null)
            return  0;
        int leftNode = countOfNode(root.left);
        int rightNode = countOfNode(root.right);
        return  leftNode + rightNode +1;
    }

    public  static int sumOfNode(Node root){
        if(root == null){
            return  0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        return leftSum + rightSum + root.data;
    }

    public  static  int heightOfTree(Node root){ // tc = O(N)
        if (root == null){
            return  0;
        }
        int leftHeight =  heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int height  = Math.max(leftHeight,rightHeight) +1;
        return  height;
    }


//    calculate the diameter of the binary tree

//    approch 1 TC O(N^2)

//    public static int diameter(Node root){
//        if(root == null) {
//            return 0;
//        }
//        int diam1 = heightOfTree(root.left) + heightOfTree(root.right) + 1;
//        int diam2 = diameter(root.left);
//        int diam3 = diameter(root.right);
//        return Math.max(diam1, Math.max(diam2, diam3));
//    }

//    approch 2 => calculate height and diameter togather

    static  class TreeInfo{
        int ht;
        int dia;
        TreeInfo(int ht,int dia){
            this.ht = ht;
            this.dia = dia;
        }
    }

    public static TreeInfo diameter(Node root){
        if (root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);
        int myHeight = Math.max(left.ht,right.ht)+1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht +1;
        int myDia = Math.max(dia3 , Math.max(dia1,dia2));
        return new TreeInfo(myHeight,myDia);
    }

    static  boolean isSubtree(){
        return true;
    }

    public static void main(String[] args) {
//        build a preorder tree using linked list
//        preorder means => rote, left, right
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        preOrderTraversal(root);

//        System.out.println(root.data);
//        inorderTraversal(root);
//        postOrderTraversal(root);
//        levelOrderTraversal(root);
//        System.out.println(countOfNode(root));
//        System.out.println(sumOfNode(root));
//        System.out.println(heightOfTree(root));
//        System.out.println(diameter(root).dia);

    }
}
