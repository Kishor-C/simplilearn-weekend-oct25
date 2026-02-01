// we can use complex datastructure like object as an accumulator in reduce
/*
Consider a banking system has SUCCESS & FAIL status in the logs array
logs = ["SUCCESS", "FAIL", "SUCCESS", "SUCCESS", "FAIL"]
expected: {SUCCESS: 3 , FAIL: 2}
*/
let logs = ["SUCCESS", "FAIL", "SUCCESS", "SUCCESS", "FAIL"];

// traditional way

// create empty object
let count = { }; // it doesn't have any property

for(let i = 0; i < logs.length; i++) {
    let status = logs[i];  // SUCCESS or FAIL
    // if status exists, increase count, if not start from 1
    count[status] = (count[status] || 0) + 1;   // count[status] = (count[status] || 0) + 1
                                                // count["fail"] = (count["fail"] || 0) + 1
}                                               // count["fail"] = (1 || 0) + 1 = 2
console.log('_____ Modifying datastructure in traditional way ______')
console.log(count);
console.log('_____ Modifying datastructure with reduce ______')
// re-initialize count
count = { };
let anotherCount = logs.reduce((result, status)=> {
    result[status] = (result[status] || 0) + 1;
    return result;
}, count);
console.log(anotherCount);

// ACTIVITY: use the same program with reduce() method
/*
    step        status          result before                  result after
     1          "SUCCESS"       {}                              {success: 1}
     2           "FAIL"         {success: 1}                    {success:1, fail:1}
     3          "SUCCESS"     {success:1, fail:1}               {success:2, fail: 1}
     4          "SUCCESS"      {success:2, fail: 1}             {success:3, fail: 1}
     5          "FAIL"          {success:3, fail: 1}            {success:3, fail: 2}
*/