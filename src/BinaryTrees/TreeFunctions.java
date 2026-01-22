package BinaryTrees;

import Nodes.BTNodes;

public class TreeFunctions {

    static class TreeInfo{
        int height;
        int diameter;

        TreeInfo(int h, int d){
            this.height = h;
            this.diameter = d;
        }
    }

    static void showTraversals(BinaryTree tree, BTNodes root){
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        tree.levelOrder(root);
    }

    static int countNodes(BTNodes root){
        if (root==null){
            return 0;
        }
        return countNodes(root.left)+countNodes(root.right) + 1;
    }

    static int sumOfNodes(BTNodes root){
        if (root==null){
            return 0;
        }
        return root.data + sumOfNodes(root.left)+sumOfNodes(root.right);
    }

    static int heightOfTree(BTNodes root){
        if(root==null){
            return 0;
        }
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        return Math.max(left,right)+1;
    }

    static int diameterOfTree(BTNodes root){
        if(root==null){
            return 0;
        }
        int d1 = diameterOfTree(root.left);
        int d2 = diameterOfTree(root.right);
        int d3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(d3,Math.max(d2,d1));
    }

    static TreeInfo advancedDiameterOfTree(BTNodes root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = advancedDiameterOfTree(root.left);
        TreeInfo right = advancedDiameterOfTree(root.right);

        int myHeight = Math.max(left.height,right.height) + 1;

        int d1 = left.diameter;
        int d2 = right.diameter;
        int d3 = left.height+ right.height + 1;

        int myDiameter = Math.max(Math.max(d1,d2),d3);

        return new TreeInfo(myHeight,myDiameter);
    }

    static boolean isSubTree(BTNodes root, BTNodes subRoot){

    }

}
