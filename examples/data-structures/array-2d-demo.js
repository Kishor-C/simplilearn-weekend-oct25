// storing temperatures of 3 cities on 4 days
let temps = [
    [25, 26, 28],
    [30, 31, 29],
    [29, 25, 27],
    [35, 30, 32]
]
let cities = ["CH", "BL", "MB"];

console.log("Day "+cities.join(" "));
console.log("_______________");
for(let i = 0; i < temps.length; i++) {
    let t = temps[i];
    console.log((i + 1)+"   "+temps[i].join(" "));
}
// 3 rows & 3 columns grid - all are empty 
let grid = [
    ["[ ]", "[ ]", "[ ]", "[ ]"],
    ["[ ]", "[ ]", "[ ]", "[ ]"],
    ["[ ]", "[ ]", "[ ]", "[ ]"]
]
console.log("_______________");
// book 2nd row, 3rd column [1][2] - inserting the data
grid[1][2] = "[X]";
grid[2][0] = "[X]";
console.log("***** 4X4 Booking *****")
for(let row of grid) {
    console.log(row.join(" | "));
}
printGrid(grid);
// unblock one seat
grid[1][2] = "[ ]";
printGrid(grid);
// traversing over the 2D array
function printGrid(grid) {
    console.log("**** Traversing over 2D array ******");
    for(let i = 0; i < grid.length; i++) {
        for(let j = 0; j < grid[i].length; j++) {
            console.log(`Row ${i + 1}, Col ${j + 1}: ${grid[i][j]}`);
        }
    }
}