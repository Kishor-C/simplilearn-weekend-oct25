// create two 2 X 3 matrix - store add, sub, multiply result in separate result matrix
let a = [[1, 2, 3],[4, 5, 6]]
let b = [[6, 5, 4],[3, 2, 1]]
// create result matrix whose initial size is 0
let addition = [[0, 0, 0],[0, 0, 0]]
// create result matrix whose initial size is 0
let subtraction = [[0, 0, 0],[0, 0, 0]]
// create result matrix whose initial size is 0
let multiplication = [[0, 0, 0],[0, 0, 0]]
// performing operations
for(let i = 0; i < a.length; i++) {
    for(let j = 0; j < a[i].length; j++) {
        addition[i][j] = a[i][j] + b[i][j];
        subtraction[i][j] = a[i][j] - b[i][j];
        multiplication[i][j] = a[i][j] * b[i][j];
    }
}
function printMatrix(matrix, label) {
    console.log(`***** ${label} ******`);
    for(let row of matrix) {
        console.log(row.join(" "))
    }
}
printMatrix(a, "A");
printMatrix(b, "B");
printMatrix(addition, "Addition(A + B)");
printMatrix(subtraction, "Subtraction(A - B)");
printMatrix(multiplication, "Multiplication(A * B)");
// create 2 more matrix for subtraction & multiplication
// store addition, subtract & multiplication values to each result matrx and display output
/*  Expected output
    addition  (a + b)
    7   7   7
    7   7   7
    subtraction (a - b)
    -5  -3  -1
    1   3   5
    multiplication (a * b)
    6   10  12
    12  10  6
*/