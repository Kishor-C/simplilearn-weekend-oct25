// class that creates Graph
class Graph {
    constructor() { 
        // this stores all friends list
        this.list = {};
    }
    // add a new person
    addPerson(name) { 
        // empty friends list
        // we will use the list with a name property
        // empty friend list in that person name
        this.list[name] = []; 
        console.log(`${name} joined the network`);
    }
    // connecting two people
    addFriend(person1, person2) {
        // add person2 as friend of person1
        this.list[person1].push(person2);
        // add person1 as friends of person2
        this.list[person2].push(person1);
        console.log(`${person1} and ${person2} are friends:)`)
    }
    // print all friendships
    printGraph() {
        console.log("*** Friend Network ***");
        // loop through each person using for in
        for(let person in this.list) {
            console.log(`${person} friends are ${this.list[person]}`)
        }
    }
}
// create a grapah
let g = new Graph();
// add people - registration
g.addPerson("A");
g.addPerson("B");
g.addPerson("C");
g.addPerson("D");
console.log("________________________");
// add friendships
g.addFriend("A", "B");
g.addFriend("A", "C");
g.addFriend("B", "D");
g.addFriend("C", "D");
// print graph
g.printGraph();