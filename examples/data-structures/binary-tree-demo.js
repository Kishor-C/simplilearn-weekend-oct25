
// imagine each node is a person in a family
// this class creates one person (Node)
class Node { 
    constructor(value) {
        this.value = value; // person's name / numbers
        this.left = null; // left child (initially no child)
        this.right = null; // right child (initially no child)
    }
}
// binary tree class that creates family tree
class BinaryTree { 
    constructor() {
        this.root = null; // root means the top person
    }
    // function that adds new person to the tree
    insert(value) {
        console.log("Adding: "+value);
        // create a new node
        let newNode = new Node(value); // Node[value, left, right]
        //if tree is empty, make that node as root node
        if(this.root === null) {
            this.root = newNode;
            console.log(value+" is now Root");
        } else {
            // add towards left or right of the root
            this.insertNode(this.root, newNode);
        }
    }
    // function decides where to place new node
    insertNode(currentNode, newNode) {
        // if new value is smaller -> go LEFT
       
        if(newNode.value < currentNode.value) {
            console.log(newNode.value+" is smaller than "+currentNode.value+" -> go LEFT");
            // if left is empty -> place here
            if(currentNode.left === null) {
                currentNode.left = newNode;
                console.log("Placed "+newNode.value+" to LEFT of "+currentNode.value);
            } else {
                //move left again
                this.insertNode(currentNode.left, newNode);
            }
        }
         // if new value is greater -> go RIGHT
        else {
            console.log(newNode.value+" is bigger than "+currentNode.value+" -> go RIGHT");
            // if right is empty -> place here
            if(currentNode.right === null) {
                currentNode.right = newNode;
                console.log("Placed "+newNode.value+" to RIGHT of "+currentNode.value);
            } else {
                // move right again
                this.insertNode(currentNode.right, newNode);
            }
        }
    }
    print(node) {
       if(node !== null) {
        this.print(node.left);
        console.log("Node value: "+node.value);
        this.print(node.right);
       }
    }
}
// create tree
let tree = new BinaryTree();
tree.insert(10);
tree.insert(5);
tree.insert(20);
tree.insert(3);
tree.insert(7);
tree.insert(15);
console.log("Final tree is")
tree.print(tree.root);
