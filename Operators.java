
public class Operators {

	void toUnderstandShiftOperators(int num){
		System.out.println(num >> 2);  //right shift
		//1010
		System.out.println(num << 2);  //right shift
	}
	static void toUnderstandTernaryOperators(short age){
		//cond ? true : false
		int marks = 49;
		System.out.println(age >= 18  && age!= 0  ? " you are eligible" : " you are not eligible");

		System.out.println(marks >= 50  ? " you cleared" : " you did not clear");

	}
	
	static void toUnderstandBitwiseOperators(int number1, int number2) {
		System.out.println(number1 & number2);
		//10 & 7   1010   & 0111 --> 0010 --> 2
		System.out.println(number1 | number2);

	}
	//&& all cond should be true, || any one cond or all the cond should be true
	static void toUnderstandLogicalOperator(int num1, int num2) {
		System.out.println(num1 > num2  && num1 < 10 && num1 > 100 );
		System.out.println(num1 >= num2 || num1 < num2 || num1 <= num2 || num1 == num2);


	}

	static void toUnderstandComparationalOperator(int num1, int num2) {  //10,20
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);  //10 20
		System.out.println(num1 != num2);
	}

	static void toUnderstandCompundOperators(int num) {  //23
		num = num + 7;  //30
		num += 7;  //37
		System.out.println(num);
		num = num - 7;  //30
		num -= 7; //23
		System.out.println(num);
		num = num * 7; //23*7 = 161
		num *= 7; //161 * 7 = 1127 
		System.out.println(num);
		num = num / 7;  // 161
		num /= 7; //23
		System.out.println(num);
		num = num % 7;  // 2
		num %= 7;  //2
		System.out.println(num);
	}

	static void toUnderstandUnaryOperators(int num) {

		System.out.println(num++);  //curr line it ll 10 nxt line 11
		System.out.println(++num);  //12
		System.out.println(num--); //12 in curr line and frm nxt line it ll be 11
		System.out.println(--num);  //10

		//! --> inversion 
		boolean areStudentsActive = false;
		System.out.println(!areStudentsActive);
	}

	public static void main(String args[]) {
		byte age = 100;
		//unary operators 
		/* ++ --> incr --> pre inc --> inc by 1 and then assign the val
		 * post inc --> assign the val and then inc by 1
		 * -- --> dec --> pre dec --> dec by 1 and then assign the val
		 * post dec --> assign the val and then dec by 1
		 */

		//toUnderstandUnaryOperators(10);
		//	toUnderstandCompundOperators(23);
		//		toUnderstandComparationalOperator(10, 20);
		//		toUnderstandLogicalOperator(10, 20);
		//		toUnderstandBitwiseOperators(10,7);
		//toUnderstandTernaryOperators(age);
		Operators operatorObj = new Operators();
		operatorObj.toUnderstandShiftOperators(10);
	}
}
