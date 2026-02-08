class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}
class CicularLinkedList { 
    constructor() {
        this.head = null;
    }
    // insert at end
    add(data) {
        let newNode = new Node(data);
        // if list is empty
        if(this.head === null) {
            this.head = newNode;
            // point new node to itself (circle starts here)
            newNode.next = this.head;
            return;
        }
        // if the list is not empty
        // we move to the last node
        let current = this.head;
        // stop when next points back to head
        while(current.next !== this.head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = this.head;   
    }
    // display all the elements
    display() {
        let current = this.head;
        let output = "";
        // we use do-while in circular
        do {
            output = output + current.data + "->";
            current = current.next;
        } while(current !== this.head);
        output = output + "head";
        console.log(output);
    }
}
let list = new CicularLinkedList();
list.add(20);
list.add(25);
list.add(10);
list.display();