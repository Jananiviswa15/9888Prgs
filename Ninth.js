let valArray = new Array();
let emptyArray = [];

console.log(emptyArray)
console.log(valArray)


emptyArray[0] = 10;
emptyArray[3] = 20;
emptyArray[5] = 10;
//0 1 2 3 

console.log(emptyArray);
console.log(emptyArray.length);

valArray[0] = 10;


valArray[1] = false;

valArray[2] = 'dsfdf';

valArray[3] = {
    name : 'sanjana',
    marks : 100
}


valArray[5] = function(){
    console.log("function and objs are possible in array in js")
    return 'hi';
}


// console.log(valArray[0])
// console.log(valArray[3].name)
// console.log(valArray[5]())

//0 1 2 3 4 5 6
valArray.push(23232);
console.log(valArray);
let val = valArray.pop();
console.log(val);
console.log(valArray);

valArray.shift();
console.log(valArray);
valArray.unshift(314);
console.log(valArray);