let numberData = 678;
let convertVal = "678";

let strVal = String(numberData);
console.log(typeof strVal);

console.log(typeof Number(strVal));

let numberVal = 10;
numberVal += "";
console.log(typeof numberVal);
numberVal -= 2;  //10 - 2 == 8
console.log(typeof numberVal)


console.log(!numberVal);
console.log(!"hi");

console.log(!0);  // "",'', null, undef, nan

let name1 = "2353janani";
console.log(parseInt(name1));

let name2 = "dfd2353janani";
console.log(parseInt(name2));

let val = 10;
let result = Math.pow(10, 3);
//10 ** 3
console.log(result);

console.log("7" >= 3);


let emptyVal = ''
let isBoring = false
let result1 = emptyVal == isBoring  //val 
let result2 = emptyVal === isBoring  //val and type
console.log(result1);
console.log(result2);
