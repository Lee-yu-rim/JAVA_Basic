import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//키보드를 통해 입력하는 방법
		Scanner sc = new Scanner(System.in);  //값을 입력 받을 수 있게 초기화 되어있는 상태
		System.out.print("정수 하나를 입력하세요: ");
		int num = sc.nextInt();   //입력   //sc.nextInt() -> 숫자를 입력 받을 수 있는 대기 상태
		System.out.println("입력하신 정수는 " + num + " 입니다");  //출력   
		//num이라는 변수를 지정하여 숫자를 입력하면, 그 입력한 숫자를 출력해내도록 하는 것
		
		System.out.print("실수 하나를 입력하세요: ");
		double d = sc.nextDouble();
		System.out.println("입력하신 정수는 " + d);
		
		sc.nextLine();  //\n를 없애기 위해 메소드를 미리 한 번 더 실행해줌 (3)
		
		System.out.print("문자를 입력하세요: ");
		String str = sc.nextLine();  //String nextLine이라는 함수는 \n 이라는 대행문자를 포함하고 있음 (1)
		System.out.println("입력하신 문자는 " + str);   //\n을 이미 읽고 실행이 종료 되었기 때문에 문자 입력이 불가함 (2)
		
		
	}

}
