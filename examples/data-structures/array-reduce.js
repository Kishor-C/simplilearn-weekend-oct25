let numbers = [10, 20, 30, 40, 50];
// finding sum in a tradional way
let init = 0;
let temp = 0;
for(let i = 0; i < numbers.length; i++) {
    temp = temp + numbers[i];
}
console.log(`Traditional way to add: ${temp}`);
// finding the sum in modern way with reduce
// syntax: arrays.reduce(callbackFn, initialValue), callbackFn = (accumulator, current) => expression
let sum = numbers.reduce((acc, cur) => acc + cur, init);
console.log(`Modern way to add with reduce = ${sum}`)

let products = [ 
    {id: 222, name : "Apple", price : 2000, quantity: 5},
    {id: 333, name : "Orange", price : 3000, quantity: 10},
    {id: 444, name : "Watermelon", price : 1000, quantity : 5}
];
// find the sum in a traditonal way 
let total = 0;
for(let i = 0; i < products.length; i++) {
    total = total + products[i].price;
}
console.log(`Total Bill = ${total}`)
let bill = products.reduce((acc, ele)=> acc + ele.price, init);
// expected output : 10000 + 30000 + 5000 = 45000
console.log(`Total Bill = ${bill}`);