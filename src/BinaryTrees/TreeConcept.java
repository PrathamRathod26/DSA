package BinaryTrees;

import Nodes.BTNodes;
import static BinaryTrees.TreeFunctions.*;

public class TreeConcept {

    public static void main(String[] args) {
        int[] n1 = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] n2 = {1,2,4,8, -1, -1,9, -1, -1,5,-1,10, -1, -1,3,6,-1,11, -1, -1,7,12, -1, -1, -1};
        int[] n3 = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        int[] n4 = {1, 2, 3, 4, -1, -1, -1, -1, -1};
        int[] n5 = {1, -1, 2, 3, -1, 4, -1, -1, -1};

        BinaryTree tree = new BinaryTree();
        BTNodes root = tree.buildTree(n2);

//        showTraversals(tree, root);

//        System.out.println(countNodes(root));

//        System.out.println(sumOfNodes(root));

//        System.out.println(heightOfTree(root));

//        System.out.println(diameterOfTree(root));

//        System.out.println(advancedDiameterOfTree(root).diameter);
    }
}
