// a node contains 2 properties
class Node {
    constructor(data) {
        this.data = data; // store the value
        this.next = null; // pointer to the next node
    }
}
// example of creating one node
let node1 = new Node("Alex"); // Node[data=Alex, next=null]
console.log(node1);