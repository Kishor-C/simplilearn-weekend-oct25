/*
Express banking system
Node class for Linked List
Each node stores one bank account
*/
class Node { 
    constructor(accountNumber, balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.next = null;
    }
}

// Linkedist to store multiple accounts in sequence
class LinkedList { 
    constructor() {
        // head points to first node
        this.head = null;
    }
    // method to add new account
    add(accountNumber, balance) {
        // create a node object
        let newNode = new Node(accountNumber, balance);
        // if head is null add the first node to head
        if(this.head === null) {
            this.head = newNode;
        } else {
            // traverse the nodes and add new node at the end
            let current = this.head;
            while(current.next !== null) {
                current = current.next;
            }
            // now you can add the new node to the end
            current.next = newNode;
        }
        console.log("Account added in LinkedList: "+accountNumber);
    }
    // method to find account - activities

}
// Create another node for binary tree - activities
// add the node to the binary tree - activities

// Bank class to manage bank operations
class Bank {
    constructor() {
        // using LinkedList to store the account
        this.accountList = new LinkedList();
    }
    addAccount(accountNumber, balance) {
        // adds the account to the list
        this.accountList.add(accountNumber, balance);
    }
    // checkBalance - activities
    // transfer - activities
}

// main program that creates account & must perform other operations
let bank = new Bank();
bank.addAccount(12345, 5000);
bank.addAccount(12890, 15000);

