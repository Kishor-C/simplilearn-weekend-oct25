let fruits = ["apple", "orange", "kiwi"];
// push(): adds the element at the end
fruits.push("watermelon");
console.log('Fruits: '+fruits);
// unshift(): adds the element at the beginning
fruits.unshift("cherry");
console.log('Fruits: '+fruits);
// pop(): removes the element at the end
let popped = fruits.pop();
console.log('popped element: '+popped);
console.log('Fruits: '+fruits);
// shift(): removes the element at the beginning
let shifted = fruits.shift();
console.log('shifted element: '+shifted);
console.log('Fruits: '+fruits);
// slice(startIndex, endIndex): creates a subarray, endIndex is exclusive
let sliced = fruits.slice(1, 3);
console.log('Sliced: '+sliced);

