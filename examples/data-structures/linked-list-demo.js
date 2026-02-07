// you must create a Node [data, next]
class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}
// Single direction list -> 
class SingleLinkedList {
    // it must have add, display, update, delete functions
    constructor() {
        this.head = null;
    }
    // add the new element at the end
    add(data) {
        // create a new node
        // NODE [this.data=data, this.next=null]
        let NODE = new Node(data); 
        // if head is null
        if(this.head === null) {
            this.head = NODE;
            return;
        }
        let current = this.head;
        while(current.next !== null) {
            current = current.next;
        }
        current.next = NODE;
    }
    // display all the elements
    display() {
        if(this.head == null) {
            console.log("List is empty!");
            return;
        }
        let current = this.head;
        let result = ""; // result = 10 -> 20 -> 30 -> 40 -> null
        // move the current to the next node until next node is null
        while(current !== null) {
            result = result + current.data + "->";
            current = current.next;
        }
        result = result + "NULL";
        console.log(result);
    }
    // iterate over the list and replace the value
    update(oldValue, newValue) {
        // first refer to the first node
        let current = this.head;
        // loop only if current != null
        while(current !== null) {
            // compare the data of the node to which current points
            if(current.data === oldValue) {
                current.data = newValue;
                return; // control is returned
            }
            // move the current to the next node
            current = current.next;
        }
    }
    delete(data) {
        // if the data is present in the head
        if(this.head.data === data) {
            // move the head to next node
            this.head = this.head.next;
            return;
        }
        // if the data is present in other nodes
        let current = this.head;
        while(current.next !== null && current.next.data !== data) {
            current = current.next;
        }
        if(current.next == null) {
            console.log("Data not found");
        } else {
            // move the previous node of the node you want to delete
            // to the next one of the node you want to delete
            current.next = current.next.next;
        }

    }
}
// from here execution starts
let list = new SingleLinkedList(); // head = null;
list.add(10); // 10 -> nulllist.display();
list.add(20); // 10 -> 20 - null
list.display();
list.add(30); // 10 -> 20 -> 30 -> null
list.display();
list.update(30, 35); // 10 -> 20 -> 35 -> null
list.display();
list.delete(20); // 10 -> 35 -> null
list.display(); // Expected Output: 10 -> 35 -> null