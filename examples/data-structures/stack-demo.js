class Stack { 
    // create a property to store elements
    constructor() {
        this.items = [];
    }
    // adds element to the top of the stack
    push(item) { 
        console.log(`${item} added at the top of the stack`);
        this.items.push(item);
    }
    // remove the top most element
    pop() {
        if(this.items.length === 0) {
            console.log("Stack is empty");
            return;
        }
        return this.items.pop();
    }
    // return the top most element
    peek() {
        if(this.items.length === 0) {
            console.log("Stack is empty");
            return;
        }
        return this.items[this.items.length - 1];
    }
    // display all the elements
    display() { 
        console.log(this.items.join("->"))
    }
}
let stack = new Stack();
stack.push("A");
stack.push("p");
stack.push("p");
stack.push("l");
stack.push("e");
stack.display();
console.log(`Popped: ${stack.pop()}`);
stack.display();
console.log(`Peek: ${stack.peek()}`);
stack.display();
console.log(`Popped: ${stack.pop()}`);
stack.display();
