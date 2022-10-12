import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
		//산술연산자
		//+ - * /(몫) %(나머지)
		
//		int x = 5;
//		int y = 2;
//		
//		System.out.println(x/y);  // = 2
//		System.out.println(x%y);  // = 1
		
		//상수 = 바뀌지 않는 값  *변수는 변할 수 있는 값
		//final double PI = 3.14;   //상수를 지정하는 메소드 -> 변수 앞에 final : 값을 바꿀 수 없게 됨  //PI는 대문자로
		//System.out.println(PI);
		
		//형변환(자료형 or 데이터타입)
		//데이터 타입을 변환 시키는 것  ** boolean은 제외
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)  / float, double은 정수 + 실수까지 표현하므로 더 큼
		//   char(2)  -> 양수만 표현 / byte, short는 음수도 표현 / byte와 char, short와 char의 크기를 비교할 수 없지만 int 보다는 작다.
		// ----------------------------------------------------------> 자동형변환 (작>큰)
		//      강제형변환(큰>작)  <--------------------------------------------------------
		
		//byte b = 85;
		//int i = b;  //byte는 int 보다 작으므로 자동형변환
		
		
//		int i = 85;
//		byte b = (byte)i;  //int가 byte 보다 크므로 자동형변환이 안되서 강제형변환 해줌
		
//		int i = 300;
//		byte b = (byte)i;
//		System.out.println(b);   //= 44  -> 강제형변환시 값의 손실이 발생 (byte는 300이라는 수를 출력할 수 없기 때문)
		

//		double d = 3.14;
//		int i = (int)d;
//		System.out.println(i);  // = 3  -> int는 정수이므로 소수점뒤의 자리는 나타낼 수 없음 : 값의 손실
		
		//int i = 3;
		//double d = i;
		//System.out.println(d);  // = 3.0
		
//		byte b = 65;
//		char c = (char)b;//두개의 데이터타입은 서로 비교할 수 없기때문에 강제형변환
//		System.out.println(c);  // = A -> A의 유니코드 숫자가 65이기때문

		//int x = 10;
		//int y = 20;
		
		//int result = x + y;
		//System.out.println(result);  // = 30
		
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = b1 + b2;  // => byte b = int + int  
		
//		byte result = (byte)(b1 + b2);  // = 30 
//		System.out.println(result);  
//		 int보다 작은 정수 데이터타입들은 연산 과정에서 int로 자동형변환이 됨.
//		byte + byte -> int + int
//		byte + short -> int + int
//		char + byte -> int + int
		
//		int + long -> long + long 
//		int + float -> float + float
//		float + double -> double + double
//		 -> 큰 타입으로 따라감.
		
//		int x = 5;
//		int y = 2;
//		double result = x/y;
//		double result = x%y; // = 1.0
//		System.out.println(result);  // = 2.0
		
//		int x = 3;
//		int y = 5;
//		double result = x / y;   // = 0.0
		//x / y 를 먼저 계산해서 -> int와 int로 나눈 것이기 값은 정수인 0이고, 그 다음변수가 double이기 때문에 0.0으로 나옴 / 연산자 계산 먼저 -> 그 다음 타입 변환
//		double result = (double)x / y;  // = 0.6 (3.0 / 5.0)   
		//x와 y 둘중 하나만 타입을 바꿔도 큰 데이터 타입으로 따라감
//		System.out.println(result); 
		
		
//		String str = "java";
//		double ver = 1.8;
//		String result = str + ver;  // = java1.8 String과 double이 합쳐지면 하나의 문자열로 나온다!
//		System.out.println(result);
		
		//String + anyType -> String => "String + 어떤 타입이 와도 하나의 문자열로 출력된다."
		//String + double -> String + String => String
		
		// + => 산술, 연결, 부호
		
		
		//증감연산자 : 값을 1증가, 값을 1 감소
		// ++ , --
		//변수에만 사용 가능
		//전치, 후치  => 결과는 같음
		
//		int x = 10;
//		++x;   // ++변수/변수++ => 변수에 1만큼 증가
//		System.out.println(x);  // = 11
//		x++;
//		System.out.println(x);  // = 12
//		--x;
//		System.out.println(x);  // = 11
//		x--;
//		System.out.println(x);  // = 10
		
//		int x = 10;
//		int y = 0;
//		
//		y = x++ + 10;   //y =(3) x(1)++(4) +(2) 10;  -> x = 11 / y = 20
//		후치는 증감을 먼저할지 나중에 할지 정할 수 있음
//		
//		//y = ++x + 10;  //y =(3) ++(1)x +(2) 10;   -> x = 11 / y = 21 
//		System.out.println("x =" + x + ", " + "y= " + y);
		
		
		//대입연산자
		//변수에 사용되는 연산자
		// = , += , -= , *= , /= , <<= , |= .......
		
		
//		int x = 10;
//		x += 10;  // x = x + 10
//		System.out.println(x);  // = 20
		
//		x -= 10;  // x = x - 10
//		System.out.println(x);  // = 0
	
//		x *= 2;  // x = x * 2
//		System.out.println(x);  // 20
		
		
		//비교연산자
		//5 > 3
		// > , < , => , =< , == , !=
		//결과값 = true or false
		
//		int x = 10;
//		int y = 20;
	
//		System.out.println(x < y);
//		System.out.println(x > y);
//		System.out.println(x <= y);
//		System.out.println(x >= y);
//		System.out.println(x == y);  // == x와 y가 같으면 true
//		System.out.println(x != y);  // != x와 y가 같지않으면 true
		
		
		//논리연산자
		// &&(and) , ||(or) , !(not)
		//두가지 이상의 조건을 확인할 때 사용한다.
		
//		int x = 10;
//		int y = 20;
//		
//		System.out.println(x == 10);
//		System.out.println(y == 20);
		
//		System.out.println(x == 10 && y == 20);   // => true && true = true / 비교연산자 -> 논리연산자 순
//		System.out.println(x == 10 && y == 30);  //  => true && false = false
		
		//조건 모두가 true 여야만 결과가 true로 출력되고 하나라 도 틀리면 false가 출력됨
	
//		int x = 10;
//		int y = 20;
//		int z = 20;
	
//		System.out.println(x == 10 && y == 20 && z ==30);
		
//		int x = 10;
//		int y = 20;
//		int z = 20;
		
//		System.out.println(x == 10 || y == 20); 
//		System.out.println(x == 10 || y == 30);
		
		//하나 이상이 true 인 경우는 true, 모든 조건이 틀리면 false
		
		//!true -> false
		//!false -> true
		
//		int x = 10;
//		System.out.println(!(x == 10));  // x == 10 -> true 지만 앞에 !가 붙어서 결과는 false

//		3.45 <= 2  ->  double <= int  ->  double <= double  -> double
		
		//조건연산자(삼항연산자)
		//      조건식             ? 결과1 : 결과2
		// (true or false) ?(true):(false)  -> 앞 조건식의 결과에 따라 결과1 or 결과2가 출력된다
		
//		int x = 10;
//		int y = 20;
	
//		int result = (x > y) ? x : y;
//		System.out.println(result);
		
//		int age = 20;
//		String rs = (age >= 20) ? "성인 입니다." : "미성년 입니다.";  //결과값에 따라 변수 지정!
//		System.out.println(rs);
		
		// 456 -> 400 ,  111 -> 100
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("백의 자리 숫자를 입력하세요: ");
//		int num = sc.nextInt();
		
//		System.out.println("입력받은 값: " + num);
//		System.out.println("연산되어진 결과: " + num / 100 * 100);  // 456 / 100 -> 4 * 100 = 400
		
		// 333 -> 331 , 776 -> 771
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요: ");
//		int num = sc.nextInt();
		
//		System.out.println("입력받은 값: " + num);
//		System.out.println("연산되어진 결과: " + (num / 10 * 10 + 1));

		
//		10의 배수
//		19 -> 20 , 81 -> 90
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(num / 10 * 10 + 10);
		
//		10의 배수를 구한 뒤 나머지 구하기
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println((num / 10 * 10 + 10)%num);
//		=
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(10 - num % 10);
		
		//사과의 개수를 입력받는다.
		//한 바구니에 10개의 사과를 담을 수 있다.
		//그럼 몇 개의 바구니가 필요할까?
		// 123 -> 13개 , 456 -> 46개
		// 사과의 총 갯수는 123개이며, 바구니는 13개 필요합니다.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사과의 개수를 입력하세요: ");
//        int appleNum = sc.nextInt();
		
//        int bucketNum = appleNum / 10 + (appleNum % 10 > 0 ? 1 : 0);
//		System.out.print("사과의 개수는 총  " + appleNum + "개이며, ");
//		System.out.print("바구니는 " + bucketNum + "개 필요합니다.");
		
//		int x = 5;
//		System.out.println(x >= 0 && x <= 10);  // = true
//		System.out.println(x <= 0 || x >= 10);  // = false
//		System.out.println(!(x <= 0 || x >= 10));
	}

}
