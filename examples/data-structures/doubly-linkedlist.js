class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList { 
    constructor() {
        this.head = null;
        this.tail = null;
    }
    add(data) {
        let newNode = new Node(data); //newNode[prev, data, next]
        // head must reference to the first node
        if(this.head === null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        // connecting the tail to the next node
        this.tail.next = newNode;
        // point back to the previous node
        newNode.prev = this.tail;
        // tail points to the new node
        this.tail = newNode;

    }
    // traverse in forward direction
    displayForward() {
        let current = this.head;
        let output = "";
        while(current !== null) {
            output = output + current.data + "<-->";
            current = current.next;
        }
        output = output + "null";
        console.log(output);
    }
    // traverse in backward direction
    displayBackward() {
        // start from the end
        let current = this.tail;
        let output = "";

        while(current !== null) {
            output = output + current.data + "<-->"
            current = current.prev;
        }
        
        output = output + "null";
        console.log(output);
    }
    reverse() {
        let current = this.head;
        // swaping the next & prev
        while(current !== null) {
            let temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.prev;
        }
        // swaping the head and tail
        let temp = this.head;
        this.head = this.tail;
        this.tail = temp;
    }
}
// create a list, then add & display in both the direction
let list = new DoublyLinkedList(); // head = null
list.add(30);
list.add(40);
list.add(20);
console.log("Traversing in forward direction");
list.displayForward();
console.log("Traversing in backward direction");
list.displayBackward();
console.log("Before reverse");
list.displayForward();
list.reverse();
console.log("After reverse");
list.displayForward();