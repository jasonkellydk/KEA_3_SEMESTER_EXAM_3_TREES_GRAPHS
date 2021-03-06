package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.logic.BinaryTree;

public class InOrderTraverseExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will show in order traverse tree search";
    }

    @Override
    public String getName()
    {
        return "Binary in order traverse";
    }

    @Override
    public void runExample()
    {
        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50, "Boss");

        theTree.addNode(25, "Vice President");

        theTree.addNode(15, "Office Manager");

        theTree.addNode(30, "Secretary");

        theTree.addNode(75, "Sales Manager");

        theTree.addNode(85, "Salesman 1");

        // Different ways to traverse binary trees

        theTree.inOrderTraverseTree(theTree.root);

        // Find the node with key 75

        System.out.println("\nNode with the key 75");

        System.out.println(theTree.findNode(75));
    }
}
