let setval = new Set("janani");
//console.log(setval)


let emptySet = new Set();

emptySet.add(23);
emptySet.add(3);
emptySet.add(23);
emptySet.add('hi');
emptySet.add('hi');
emptySet.add('helllo');
emptySet.add('dfdsfdf');


//console.log(emptySet)


//emptySet.forEach((val) => {console.log(val)})

console.log(emptySet.has(23))