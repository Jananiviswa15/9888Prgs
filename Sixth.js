// function sayHi(){

//     console.log("good mrg");
//     return "helllo";
// }


/*sayHi();
let messg = sayHi();
console.log(messg)*/

/*function sayHi(userName){

        console.log("good mrg"+" "+userName);
        return "helllo";
    }
let name = "shradha";
    //let msg = sayHi("name of the person");
    sayHi(name);

*/

   let sumRef =  function( num1, num2){
        total = num1+num2;
        return total;
        
    }
let favSubj = "java";
let backUpSum = sumRef;
    // let catchVal = sumRef(10,10);
  //  let catchVal = backUpSum(100,10);
   // console.log(catchVal)

    function sayHi(userName){
        console.log(favSubj)
console.log(nameOfThePerson) //var defined after i am able to access
        console.log(`good mrg ${userName}`);
    }
  
    let nameOfThePerson = "ashanullah";
   // sayHi(nameOfThePerson);



    let sumRef1 =  function( num1, num2, num3 = 30){
        console.log(num1+" "+ num2+" "+ num3)
        total = num1+num2+num3;
        return total;
        
    }

  // console.log( sumRef1(1,2, 100));


   let sayGoodMrg = function(userName){
    console.log(`good mrg ${userName}`);
    return "bye";
}

//console.log(sayGoodMrg('shruthi'));


let greetMsg = (userName) => {
    console.log(`good mrg ${userName}`);
    return "bye";

}

//console.log(greetMsg('students'));


let arrowFunc = (number1, number2) =>  number1+number2;
console.log(arrowFunc(2,2));

let arrowFuncRef = arrowFunc
console.log(arrowFuncRef(0,2));