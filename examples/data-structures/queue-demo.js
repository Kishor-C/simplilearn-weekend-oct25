class Queue { 
    constructor() {
        this.items = [];
    }
    // add element at the end
    enqueue(element) {
        this.items.push(element);
    }
    // remove from the front
    dequeue() {
        if(this.items.length == 0) {
            console.log("Queue is empty");
            return;
        }
        return this.items.shift();
    }
    // return the front element
    front() {
        return this.items[0];
    }
    display() {
        console.log("--- Tasks in the queue  ----")
        console.log(this.items.join(" <- "))
    }
}
let queue = new Queue();
queue.enqueue("Print Request - 1");
queue.enqueue("Print Request - 2");
queue.enqueue("Print Request - 3");
queue.enqueue("Print Request - 4");
queue.display();
console.log("Must process: "+queue.dequeue());
queue.display();
console.log("Must process: "+queue.dequeue());
queue.display();

