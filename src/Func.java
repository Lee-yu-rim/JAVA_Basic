
public class Func {
	
	//메소드(함수) : 객체의 기능을 구현한다.
	
//	리턴타입 메소드명([매개변수1,매개변수2,...]) {  //[] => 대괄호 부분은 생략이 가능하다.
//		실행문장
//		[return 값]
//		
//	}
	
	//리턴타입 : void, 기본자료형, 참조형
	//메소드명 : 낙타 표기법 -소문자대문자 (ex.tvTest)
	//매개변수 : int x, double d, Tv t
	// => 매개변수의 타입 2가지 call by value(기본형)/call by reference(참조형)
	//return : 리턴타입이 void가 아닌 경우에 사용(기본자료형, 참조형일 때)
	
	void add() {   //메소드의 선언부(시그니처)
		System.out.println(2 + 3);  //메소드의 구현부      //void가 들어가기 때문에 return은 쓸 수 없다.
	}
	
	void add2(int x, int y) {  //매개변수 -> 값을 외부에서 받아오는 역할
		System.out.println(x + y);
	}
	
//	void add3(int x, int y) {  //return타입은 void를 사용할 수 없기 때문에 return 타입에 맞춰서 메소드를 변경해줘야 함.
//		int sum = x + y;   //지역변수
//		return sum;   // 돌려받고 싶은 값을 입력
//	}
	
	int add3(int x, int y) {  //sum의 타입이 int 이므로 void를 int로 변경해준다.
		int sum = x + y;   
		return sum;   
	}
	
	
	int sub(int x, int y) {
		int sub = x - y;
		return sub;
	}
	
	int mul(int x, int y) {
		int mul = x * y;
		return mul;
	}
	
	int div(int x, int y) {
		int div = x / y;
		return div;
	}
	
	
	void test(int x, int y) {
		
		if(x < y) {
			System.out.println("함수의 종료");
			return;   //함수의 즉시 종료  == 반복문에서의 break와 같은 용도
		}
		
		int result = x + y;
		System.out.println(result);
	}
		
	int test2(int x, int y) {
		
		int result;
		
		if(x > y) {
			result =  x;
		}else {
			result = y;   //조건에 부합하지 않는 경우과 조건해 부합하는 경우 두가지를 모두 생성해줘야한다.
		}
		return result;
	}
	
	
	void call1() {
		System.out.println("call1");
		call2();  //call2를 호출한다.
	}
	
	void call2() {
		System.out.println("call2");
		call3();  //call3를 호출한다.
	}
	
	void call3() {
		System.out.println("call3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
