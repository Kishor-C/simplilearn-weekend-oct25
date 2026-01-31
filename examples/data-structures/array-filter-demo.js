let numbers = [6, 1, 3, 4, 5, 8, 9, 10, 15, 14, 13, 12];
// filter with arrow function the expression must be boolean
let even = numbers.filter((ele) => ele % 2 == 0)
console.log('Even: '+even);
let odd = numbers.filter(ele => isOdd(ele));
console.log('Odd: '+odd);
function isOdd(n) {
    return n % 2 != 0;
}

/*
    first try even and odd then try the above activity
    #1) create an array of strings and store only those names that starts with letter 'S' and print them
    Sample Input: ['Ajay', 'Vijay', 'Sachin', 'Sourav', 'Sony', 'Kiran']
    Expected Output: ['Sourav', 'Sachin', 'Sony' ]
    
    #2) print the prime numbers using filter function 
    Sample Input : [17, 19, 21, 29, 31, 13, 5, 6]
    Expected Output: [17, 19, 29, 31, 13, 5]
*/
function isPrime(n) {
    for(let i = 2; i < n; i++) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}
numbers = [17, 19, 21, 29, 31, 13, 5, 6];
let primeNum = numbers.filter(n => isPrime(n));
console.log('Output: '+primeNum);
// solution for start with 'S' or 'Sa'
let names = ["Sachin", "Sanjay", "Sony", "Raj", "Kiran"];
let filterNames = names.filter(n => n.startsWith("Sa"));
console.log('Filter names: '+filterNames);
/* you can apply filter on complex objects like filter based on movies/products ratings or price*/
let products = [
    {name:"Shoes", price:5000, rating: 4.5},
    {name:"Bag", price:3000, rating: 4.6},
    {name:"Multi Cooker", price:2000, rating: 4.6},
    {name:"Mouse", price:700, rating: 4.8},
];
let filterProducts = products.filter(p => p.rating >= 4.5 && p.price > 2000);
console.log(filterProducts);
//how to print only name if rating greater then 4.5
filterProducts.forEach(p => console.log(p.name));