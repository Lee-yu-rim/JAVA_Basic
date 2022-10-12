import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		//반복문 : 실행문을 여러번 동작하게 한다.
		//for , while , do-while
		
//		for(초기값;조건식(언제까지 반복할 것인지);증감식) {
//			실행문 (이 구문을 반복한다)
//      }
		
		
//		for(int i=0;i<10;i++) {  //조건식이  false가 되면 실행 종료
//			System.out.println(i + " :hello");  //실행되는 순서: 초기값 -> 조건식 -> 실행문 -> 증감식  **초기값은 구문이 시작될때 처음만 실행 -> 조건식 -> 실행문 -> 증감식 반복
//		}
		
//		for(int i=0;i<10;i+=2) {  // 0,2,4,6,8
//			System.out.println(i + " :hello");
//		}
		
		
//		for(int i=10;i>0;i--) {
//			System.out.println(i + " :hello");
//		}
		
//		for(;true;) {   //무한반복문
//			System.out.println("hello");
//		}
		
//		int k = 1;
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(k++);   //k라는  외부변수를 통해 결과값 출력
//		}
		
		//1 ~ 10 사이의 정수값 중에 짝수만 출력
		
//		for(int i=1;i<=10;i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);	
//			}
//		}

		
		//1 + 2 + 3 + ... + 10  => 55
		
//		int sum = 0;    //변수에 값을 저장하기 위해서는 초기화가 필요하다.
//		
//		for(int i=1;i<=10;i++) {
//			sum += i;		//sum = sum + i
//		}
//		
//		System.out.println(sum);

		
		//1부터 10까지의 정수중에 홀수의 합과 짝수의 합
//		int sum1 = 0;  // 값을 선언하기 위한 변수
//		int sum2 = 0;
//	
//		for(int i=1;i<=10;i++) {
//			if(i % 2 == 1) {
//				sum1 += i;
//			}else {
//				sum2 += i;
//			}
//		}
//		
//		System.out.println("홀수: " + sum1);
//		System.out.println("짝수: " + sum2);
		
//		초기값  //초기값은 시작할 때 한 번 실행된 뒤 다시 실행되지 않는다.
//		while(조건식) {
//			실행문
//		        증감식
//		}
		
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int i = 10;
//		while(i > 0) {
//			System.out.println(i);
//			i--;
//		}
		
		
//		int sum = 0;
//		int i = 1;
//		
//		while(i <= 10) {
//			sum += i;
//			i++;
//			
//		}System.out.println(sum);  // = 55
		
		//while의 무한반복문
//		while(true) {
//			System.out.println("hello");
//		}
		
		
		//while의 반복문에서 종료시점을 지정하는 방법
//		boolean flag = true;
//		int cnt = 0;
//		while(flag) {
//			
//			cnt++;
//			System.out.println(cnt);
//			
//			if(cnt > 100) {
//				flag = false;
//			}
//		}
		
//		//중첩 반복문
//		for() {  // n = 5(반복횟수)      전체 반복 횟수 = n x m = 25
//			for() {   // m = 5(반복횟수)
//				실행문  // -> 25회 반복된다.
//			}
//		}
		
//		int k = 1;
//		for(int i=0;i<5;i++) {    //중첩 구문 안에 변수는 달라야함
//			for(int j=0;j<5;j++) {
//				System.out.println(k++);  // =  1 2 3 4...25의 횟수만큼 출력
//				
//			}  
//		}
			
//		i  j
//		0  0
//		0  1
//		0  2
//		0  3
//		0  4
//		1  0
//		1  1
//		1  2
//		1  3
//		1  4
//		....
//		4  0
//		4  1
//		4  2
//		4  3
//		4  4   -> 총 25회
		
		
		//위에서 아래로 나오는 구구단
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i + "x" + j + "=" + i*j);				
//			}
//			System.out.println();   //2x1=2
//			                        //2x2=4...
//		}
		
		
		//왼쪽에서 오른쪽으로 가는 구구단 -> 출력의 방식도 고려해야함 println 에서 ln을 제거해야 가능
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.print(j + "x" + i + "=" + j*i + " ");
//			}
//			System.out.println();   // 2x1=2 3x1=3 4x1=4...9x1=9
//			                        // 2x2=4 3x2=6 4x2=8...9x2=18 
//		}
		
//		초기값1
//		while(조건식) {
//			초기값2
//			while(조건식) {
//				실행문
//				증감식2;
//			}
//			증감식1;
//		}
		
//		int k = 1;
//		int i = 0;   //i의 초기값
//		while(i<5) {
//			int j=0;   //j의 초기값 -> 위치 중요!
//			while(j<5) {
//				System.out.println(k++);
//				j++;
//			}
//			i++;
//		}
		
	
//		int i = 2;
//		while(i<10) {
//			int j = 1;
//			while(j<10) {
//				System.out.println(i + "x" + j + "=" + i*j);
//				j++;
//			}System.out.println();
//			i++;
//		}
		
//		int i = 1;
//		while(i<10) {
//			int j = 2;
//			while(j<10) {
//				System.out.print(j + "x" + i + "=" + i*j + " ");
//				j++;
//			}System.out.println();
//			i++;
//		}
		
		
		//필요에 따라 2가지 변수 지정 가능
//		for(int i=0,j=10;i<10;i++,j--) {
//			System.out.println("i: " + i + ", " + "j: " + j);
//		}
		
//		int s = 0;
//		for(int i=0;i<10;i++,s++) {
//			System.out.println("i: " + i + ", " + "s: " + s);
//		}
//		
//		System.out.println(i);   // -> i는 for블록 안에 존재하기 때문에 바깥으로 나가면 출력 불가
		
//		int s = 0;  //외부변수
//		int i;   //변수 선언을 for문 밖에서도 선언이 가능하다  -> 이 변수는 for문 바깥에서도 사용가능
//		for(i=0;i<10;i++,s++) {   //외부변수를 for문 안에 배치하여 사용 가능
//			System.out.println("i: " + i + ", " + "s: " + s);
//		}
//		System.out.println(i);  //i를 블록 밖에서 선언하게 되면 블록 밖에서도 출력
		
//		초기값
//		do {
//			실행문
//			증감식
//		}while(조건식)
			
//		int i = 11;
//		do {
//			System.out.println(i);    //실행문이 조건식보다 먼저 나오기 때문에 조건이 false 더라도 초기값이 한 번 나온다.
//			i++;
//		}while(i <= 10);
	
		
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 출력
		
//		int sum = 0;
//		int sum2 = 0;
//		for(int i=1;i<=10;i++) {
//			sum += i;  // (0+1) (0+1+2) (0+1+2+3)... -> 각각 연산된 결과가  sum에 대입됨
//			sum2 += sum;
//		}
//		System.out.println(sum2);
				
		//반복문의 제어
		//break, continue
		//조건문 안에서 사용
		
//		for(int i=1;i<=10;i++) {
//			if(i > 5) {
//				break;  //반복문의 종료
//			}
//			System.out.println(i);
//		}	
		
		//break문
//		int k=1;
//		for(int i=0;i<5;i++) {
//			System.out.println("i = " + i);
//			for(int j=0;j<5;j++) {
//				if(k%3==0) {
//					break;    //첫번째 for문은 제외하고 break가 들어있는 블록 안에 있는 for문에만 조건이 걸림
//				}
//				System.out.println("k = " + k++);  // = i가 0으로 출력 된 뒤, k가 1, 2만 출력되고 다시 i가 1부터 4까지 출력
//			}
//		}
		
		
//		int k=1;
//		for(int i=0;i<5;i++) {
//			System.out.println("i = " + i);
//			for(int j=0;j<5;j++) {
//				System.out.println("k = " + k++);
//				if(k%3==0) {
//					break;    //첫번째 for문은 제외하고 break가 들어있는 블록 안에 있는 for문에만 조건이 걸림
//				}
//			}
//		}
//		i = 0  // -> 3의 배수가 될때마다 구문이 멈춘뒤 위에 for문을 실행하고 다시 안쪽 for문을 실행함 -> 반복
//		k = 1
//		k = 2 
//		i = 1
//		k = 3
//		k = 4
//		k = 5
//		i = 2
//		k = 6
//		k = 7
//		k = 8
//		i = 3
//		k = 9
		
//		i j k
//		0 0 1
//		0 1 2
//		0 2 3
//		1 0 3
//		1 1 4
//		1 2 5
//		1 3 6
//		2 0 6 
//		2 1 7
//		2 2 8
//		2 3 9
//		3 0 9

//		for(int i=1;i<=10;i++) {
//			if(i%2==1) {
//				continue;    //종료가 아닌 실행문을 제어하는 것. 
//			}
//			System.out.println(i);   //실행문이 조건에 부합하지않으면 실행하고, 조건에 부합하면 실행하지 않고 증감식 -> 조건식순으로 계속 진행됨 
//		} // = 홀수 인 경우에는 동작하지 않게 조건을 걸었으므로 짝수의 값만 실행됨

		
		//12345 -> 1+2+3+4+5 -> 15
		
		
		//몇 번을 반복할지 모르는 경우 -> while문이 용이
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요: ");
//		int num = sc.nextInt();  //몇 번을 반복할지 결정되는 요소가 입력되는 숫자인 num 이므로 초기값을 지정하지 않고 num을 이용해서 while문을 작성할 수 있다.
//		
//		int sum = 0;
//		
////		12345 % 10 =5
////		12345 / 10 =1234
////		1234 % 10 =4
////		1234 / 10 =123
////		...
//	
//		while(num > 0) {   //num이 0이 되기전까지 실행한다
//			sum += num % 10;  // = 5+4+3+2+1
//			num /= 10;  // = 12345, 1234, 123, 12 , 1
//		}System.out.println(sum);
		
		
		
		//방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 
		//0<=x<=10, 0<=y<=10이다
		
		//x = 1, 3, 5
		//y = 2, 1, 0
		
//		for(int i=0;i<=10;i++) {
//			for(int j=0;j<=10;j++) {
//				if((2*i) + (4*j) == 10) {
//					System.out.print("x = " + i + ", ");
//					System.out.println("y = " + j);
//				}
//			}
//		}
		
		
		//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 출력하시오
		
//		int sum = 0;
//		int s = 1;     //부호를 위한 변수
//		int num = 0;   
//		int i;
//		for(i=1;true;i++,s=-s ) {
//			num = s * i;
//			sum += num;
//				if(sum >= 100) {
//					break;
//				}
//		}
//		System.out.println(sum + ", " + i);  
					
		
//		Scanner sc = new Scanner(System.in);		
//		
//		int sel;
//		while(true) {
//			System.out.println("번호를 선택하세요: ");
//			System.out.println("1.빨간색 2.녹색 3.파란색 4.종료");
//			sel = sc.nextInt();
//			
//			if(sel == 1) {
//				System.out.println("빨간색 선택");
//			}else if(sel == 2) {
//				System.out.println("녹색 선택");
//			}else if(sel == 3) {
//				System.out.println("파란색 선택");
//			}else if(sel == 4) {
//				break;
//					}
//			}
		
		//난수(랜덤)
		//Math.random()    // 0.0 <= r < 1.0   -> 0.0 ~ 0.9999999...
		
		//System.out.println(Math.random());   //무작위의 숫자가 실행할때마다 다르게 나옴	
		//System.out.println(Math.random()* 10); // 0.0 ~ 9.99...
		//System.out.println((int)(Math.random() * 10));  // 0 ~ 9
		//System.out.println((int)(Math.random() * 10) + 1);  // 1 ~ 10
		
		//1 ~ 3		
		//System.out.println((int)(Math.random() * 3 - 1 + 1 ) + 1);
		
		
		//난수의 사용 공식
		//(int)(Math.random() * 난수의 개수(->난수의 최대값 - 난수의 최소값 + 1)) + 난수의 최소값
		
		
		
//		int com;
//		int me;
//		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			com = (int)(Math.random() * 3) + 1;
//			System.out.println("1.가위 2.바위 3.보 : ");
//			me = sc.nextInt();
//			
//			System.out.println("com = " + com + ", me = " + me);
//			
//			if(com == me) {
//				System.out.println("tie");
//				}else if(com == 3 && me == 2 || com == 2 && me == 1 || com == 1 && me == 3) {
//					System.out.println("lose");
//				}else if(com == 3 && me == 1 || com == 2 && me == 3 || com == 1 && me == 2) {
//						System.out.println("win");
//						break;
//						}
//			}
		
		//=
		
//		int com;
//		int me;
//		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			com = (int)(Math.random() * 3) + 1;
//			System.out.println("1.가위 2.바위 3.보 : ");
//			me = sc.nextInt();
//			
//			System.out.println("com = " + com + ", me = " + me);
//			
//			int result = com - me;
//					
//			if(result == -1 || result == 2) {
//				System.out.println("you win");
//				break;
//			}else if(result == 0) {
//				System.out.println("tie break");
//			}else {
//				System.out.println("you lose");
//			}
//		}
		
		
		
//		int com;
//		int me;
//		int correctCnt = 0;   //이긴 횟수
//		int challengeCnt = 0; //전체 도전 횟수
//		
//		Scanner sc = new Scanner(System.in); 
//		
//		while(true) {
//			
//			challengeCnt++;
//			if(challengeCnt == 4) {
//				System.out.println("3번의 도전기회를 다 사용하였습니다.");
//				break;
//			}    // 3번을 다 입력하면 아예 입력을 하지 못하도록 이곳에 위치시킨다.
//			
//			System.out.println("===================");
//			com = (int)(Math.random() * 3) + 1;
//			System.out.println("1.가위 2.바위 3.보 : ");
//			me = sc.nextInt();
//			
//			
//			System.out.println("com = " + com + ", me = " + me);
//			
//			int result = com - me;
//			
//			if(result == -1 || result == 2) {
//				System.out.println("you win");
//				correctCnt++;
//				System.out.println("이긴횟수: " + correctCnt + "회");
//				if(correctCnt == 1) {
//				break; 
//			}else if(result == 0) {
//				System.out.println("tie break");
//			}else {
//				System.out.println("you lose");
//			}
//		}


		
		
		
		
		
		
		
		
	
	}

}
