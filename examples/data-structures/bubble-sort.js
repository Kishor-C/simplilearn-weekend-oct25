// take some numbers
let numbers = [15, 10, 8, 12, 6, 5];
console.log("Before sorting");
console.log(numbers);
// logic - two loops 
for(let i = 0; i < numbers.length; i++) {
    for(let j = 0; j < numbers.length - 1;  j++) {
        // compare two numbers & swap
        if(numbers[j] > numbers[j+1]) {
            let temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;
        }
    }
    //console.log("Phase -> "+(i + 1)+": "+numbers);
}
console.log("After sorting");
console.log(numbers);