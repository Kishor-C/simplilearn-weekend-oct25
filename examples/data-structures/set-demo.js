// creating a Set
let names = new Set();
// to add elements we use add(ele)
names.add("Lenovo");
names.add("HP");
names.add("Dell");
names.add("Apple");
// size is a property
console.log(`Size: ${names.size}`);
// to check the element is present: has(ele)
console.log(`${names.has("Sony")}`);
// to print each element you can use for loop
console.log(names)
// to delete an element - delete(ele)
names.delete("HP");
console.log(names);
names.clear();
console.log(names);
// suppose you have array elements and want to remove their duplicates
// you can pass that array to the set i.e., new Set([....]);
let duplicateElements = [1, 2, 2, 3, 4, 4, 5, 8, 8, 9, 10, 11, 12];
let uniqueSet = new Set(duplicateElements);
console.log('*** Duplicate Elements ***');
console.log(duplicateElements);
console.log('**** Unique Set ****');
console.log(uniqueSet);
let newArray = [...uniqueSet]; // converting the Set to array
console.log(newArray);
