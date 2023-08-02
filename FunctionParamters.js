

let numberArray = [23,45,23,12,4523,56,7]

/*numberArray.forEach((val, index, numberArray) =>
{ //console.log(val, index, numberArray)
});
*/


/*numberArray.filter(numberVal => numberVal % 2 === 0).
map(numberVal => numberVal * 3).
forEach((numberVal)=>
{ console.log(numberVal)
});
*/


let ans = numberArray.filter(numberVal => numberVal % 2 === 0).  //12 56
//map(numberVal => numberVal * 3).  //36 168   34 
reduce((num1, num2)  => num1+num2)


console.log(ans)

