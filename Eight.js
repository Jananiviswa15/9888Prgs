function Student(stdName, marks){
this.stdName = stdName;
this.marks = marks;
//return this;

this.displayDetails = function(){
    console.log(this.stdName+" "+ this.marks)
        }
}



let student = new Student('sanjana', 100);
student.marks = 101;
//console.log(student.marks);

let student1 = new Student('minal', 99);
//console.log(student1.marks);
student.displayDetails();

student1.displayDetails();