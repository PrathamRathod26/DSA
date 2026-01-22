package BinaryTrees;

import Nodes.BTNodes;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static int index = -1;
    public BTNodes buildTree(int[] nodes){
        index++;
        if(nodes[index] == -1){
            return null;
        }

        BTNodes newNode = new BTNodes(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public void preOrder(BTNodes root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(BTNodes root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(BTNodes root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrder(BTNodes root){
        if(root==null){
            return;
        }
        Queue<BTNodes> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            BTNodes currentNode = q.remove();
            if(currentNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");
                if (currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if (currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }
        }
    }
}
