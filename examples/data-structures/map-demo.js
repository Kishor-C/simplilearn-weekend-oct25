let employees = new Map();

let user1 = {id: 1, name: "Alex"}
let user2 = {id: 2, name: "Alex"}
let user3= {id: 3, name: "Alex"}
let user4 = {id: 4, name: "Alex"}


// adding the elements
employees.set(user1.id, user1);
employees.set(user2.id, user2);
employees.set(user3.id, user3);
employees.set(user4.id, user4);
// reading the element based on the key
console.log(employees.get(2));
// updating the element
employees.set(2, {id: 2, name: "Brad Pit"})
// reading the element based on the key
console.log(employees.get(2));
// delete the element
employees.delete(2);
// reading the element based on the key
console.log(employees.get(2));
// count the elements
console.log(employees.size);
// how to iterate all the elements - keys()
let keys = employees.keys(); // keys() returns all the keys in an array form
for(let k of keys) {
    console.log(employees.get(k));
}