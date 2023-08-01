let inputField = 'total exp';

let student = {
    name : 'achal',
    age : '22',
    isInterested : true,
    'total exp' : 1,
    parentDetails : {
       // nameOfTheParent1 : 'Dad',
        nameOfTheParent2 : 'Mom',
    }
}

// console.log(student);
// console.log(student.parentDetails);
// console.log(student.parentDetails?.nameOfTheParent1);
// console.log(student?.parentDetails?.nameOfTheParent1?.length);

// delete student?.parentDetails;

// console.log(student);

//for in

for(let val in student)
      console.log(val, student[val]);





/*console.log(student.isInterested);

console.log(student['isInterested']);

console.log(student['total exp']);

console.log(student[inputField]);*/