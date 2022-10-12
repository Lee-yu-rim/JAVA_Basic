import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		//조건문: 실행문장을 선택적으로 실행
		// if , switch ~ case
		
//		if(조건식(true or false)) {
//			실행문
//		}

//		int age = 15;
//		
//		if(age >= 20) {
//			System.out.println("성인 입니다.");
//		}else {
//			System.out.println("미성년 입니다.");
//		}
		
//		int num = 10;
//		
//		if(num % 2 == 1) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
//		}
		
		//다중 if문  --> "또는"의 개념
//		int score = 85;
//		
//		if(score >= 90 && score <= 100) {
//			System.out.println("A학점");
//		}else if(score >= 80 && score <= 89) {
//			System.out.println("B학점");  // 맞는 조건을 만나면 실행을 멈춘다. 나머지 조건문은 실행x
//		}else if(score >= 70 && score <= 79) {
//			System.out.println("C학점");
//		}else if(score >= 60 && score <= 69) {
//			System.out.println("D학점");
//		}else if(score >= 0 && score <= 59) {
//			System.out.println("F학점");
//		}else {
//			System.out.println("조건에 부합하지 않는다.");
//		}
		
		//중첩  if문  --> "그리고"의 개념
//		if() {
//			if() {
//				
//			}else {
//				
//			}
//		}else {
//			if() {
//				
//			}
//		}
			
	
//		int x = 6;
//		
//		if(x % 2 == 0) {
//			if(x % 3 == 0) {
//				System.out.println("x는 2와 3의 공배수");
//			}
//		}
		// =
//		if(x % 2 == 0 && x % 3 == 0) {
//			System.out.println("x는 2와 3의 공배수");
//		}
		
//		switch(비교값) {  //등가연산(==) 1대1 비교만 가능, 범위지정x
//		case 값1: 실행문;
//		break;
//		case 값2: 실행문;
//		break;
//		default: 실행문;
//		}
		
//		int sel = 2;
//		
//		switch(sel) {  //숫자, 문자, 문자열 입력 가능  *실수는 불가
//		case 1: System.out.println("1번 선택");
//		break;
//		case 2: System.out.println("2번 선택");
//		break;
//		case 3: System.out.println("3번 선택");
//		break;
//		default: System.out.println("조건에 부합하지 않습니다."); 
//		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자 입력: ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자 입력: ");
//		int num2 = sc.nextInt();
//		
//		sc.nextLine();   //버퍼를 비워주는 작업!(\n이라는 공백을 지워주는 작업) -> String 타입을 사용할 때만 적용   ** 연산자는 문자열타입이기때문에 이 작업이 필요함
//		
//		System.out.print("연산자를 입력하세요(+,-,*,/): ");
//		String op = sc.nextLine();
//		
//		switch(op) {   //연산자를 통해 입력된 숫자를 계산할 것이므로 비교값은 연산자가 된다?
//		case "+": System.out.println(num1 + num2);  //기호는 문자열이기 때문에 ""입력
//		break;
//		case "-": System.out.println(num1 - num2);
//		break;
//		case "*": System.out.println(num1 * num2);
//		break;
//		case "/": System.out.println(num1 / num2);
//		break;
//		default: System.out.println("연산 불가");
//		}
		
			
		
	}

}
