//object literal
var studentObj = {
    stdName: "minal",
    marks: 100,
    sayHi: function () { }
};
studentObj.sayHi = function () {
    console.log("sayhi" + studentObj.stdName);
};
studentObj.sayHi();
console.log(studentObj.stdName);
