import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
		//���������
		//+ - * /(��) %(������)
		
//		int x = 5;
//		int y = 2;
//		
//		System.out.println(x/y);  // = 2
//		System.out.println(x%y);  // = 1
		
		//��� = �ٲ��� �ʴ� ��  *������ ���� �� �ִ� ��
		//final double PI = 3.14;   //����� �����ϴ� �޼ҵ� -> ���� �տ� final : ���� �ٲ� �� ���� ��  //PI�� �빮�ڷ�
		//System.out.println(PI);
		
		//����ȯ(�ڷ��� or ������Ÿ��)
		//������ Ÿ���� ��ȯ ��Ű�� ��  ** boolean�� ����
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)  / float, double�� ���� + �Ǽ����� ǥ���ϹǷ� �� ŭ
		//   char(2)  -> ����� ǥ�� / byte, short�� ������ ǥ�� / byte�� char, short�� char�� ũ�⸦ ���� �� ������ int ���ٴ� �۴�.
		// ----------------------------------------------------------> �ڵ�����ȯ (��>ū)
		//      ��������ȯ(ū>��)  <--------------------------------------------------------
		
		//byte b = 85;
		//int i = b;  //byte�� int ���� �����Ƿ� �ڵ�����ȯ
		
		
//		int i = 85;
//		byte b = (byte)i;  //int�� byte ���� ũ�Ƿ� �ڵ�����ȯ�� �ȵǼ� ��������ȯ ����
		
//		int i = 300;
//		byte b = (byte)i;
//		System.out.println(b);   //= 44  -> ��������ȯ�� ���� �ս��� �߻� (byte�� 300�̶�� ���� ����� �� ���� ����)
		

//		double d = 3.14;
//		int i = (int)d;
//		System.out.println(i);  // = 3  -> int�� �����̹Ƿ� �Ҽ������� �ڸ��� ��Ÿ�� �� ���� : ���� �ս�
		
		//int i = 3;
		//double d = i;
		//System.out.println(d);  // = 3.0
		
//		byte b = 65;
//		char c = (char)b;//�ΰ��� ������Ÿ���� ���� ���� �� ���⶧���� ��������ȯ
//		System.out.println(c);  // = A -> A�� �����ڵ� ���ڰ� 65�̱⶧��

		//int x = 10;
		//int y = 20;
		
		//int result = x + y;
		//System.out.println(result);  // = 30
		
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = b1 + b2;  // => byte b = int + int  
		
//		byte result = (byte)(b1 + b2);  // = 30 
//		System.out.println(result);  
//		 int���� ���� ���� ������Ÿ�Ե��� ���� �������� int�� �ڵ�����ȯ�� ��.
//		byte + byte -> int + int
//		byte + short -> int + int
//		char + byte -> int + int
		
//		int + long -> long + long 
//		int + float -> float + float
//		float + double -> double + double
//		 -> ū Ÿ������ ����.
		
//		int x = 5;
//		int y = 2;
//		double result = x/y;
//		double result = x%y; // = 1.0
//		System.out.println(result);  // = 2.0
		
//		int x = 3;
//		int y = 5;
//		double result = x / y;   // = 0.0
		//x / y �� ���� ����ؼ� -> int�� int�� ���� ���̱� ���� ������ 0�̰�, �� ���������� double�̱� ������ 0.0���� ���� / ������ ��� ���� -> �� ���� Ÿ�� ��ȯ
//		double result = (double)x / y;  // = 0.6 (3.0 / 5.0)   
		//x�� y ���� �ϳ��� Ÿ���� �ٲ㵵 ū ������ Ÿ������ ����
//		System.out.println(result); 
		
		
//		String str = "java";
//		double ver = 1.8;
//		String result = str + ver;  // = java1.8 String�� double�� �������� �ϳ��� ���ڿ��� ���´�!
//		System.out.println(result);
		
		//String + anyType -> String => "String + � Ÿ���� �͵� �ϳ��� ���ڿ��� ��µȴ�."
		//String + double -> String + String => String
		
		// + => ���, ����, ��ȣ
		
		
		//���������� : ���� 1����, ���� 1 ����
		// ++ , --
		//�������� ��� ����
		//��ġ, ��ġ  => ����� ����
		
//		int x = 10;
//		++x;   // ++����/����++ => ������ 1��ŭ ����
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
//		��ġ�� ������ �������� ���߿� ���� ���� �� ����
//		
//		//y = ++x + 10;  //y =(3) ++(1)x +(2) 10;   -> x = 11 / y = 21 
//		System.out.println("x =" + x + ", " + "y= " + y);
		
		
		//���Կ�����
		//������ ���Ǵ� ������
		// = , += , -= , *= , /= , <<= , |= .......
		
		
//		int x = 10;
//		x += 10;  // x = x + 10
//		System.out.println(x);  // = 20
		
//		x -= 10;  // x = x - 10
//		System.out.println(x);  // = 0
	
//		x *= 2;  // x = x * 2
//		System.out.println(x);  // 20
		
		
		//�񱳿�����
		//5 > 3
		// > , < , => , =< , == , !=
		//����� = true or false
		
//		int x = 10;
//		int y = 20;
	
//		System.out.println(x < y);
//		System.out.println(x > y);
//		System.out.println(x <= y);
//		System.out.println(x >= y);
//		System.out.println(x == y);  // == x�� y�� ������ true
//		System.out.println(x != y);  // != x�� y�� ���������� true
		
		
		//��������
		// &&(and) , ||(or) , !(not)
		//�ΰ��� �̻��� ������ Ȯ���� �� ����Ѵ�.
		
//		int x = 10;
//		int y = 20;
//		
//		System.out.println(x == 10);
//		System.out.println(y == 20);
		
//		System.out.println(x == 10 && y == 20);   // => true && true = true / �񱳿����� -> �������� ��
//		System.out.println(x == 10 && y == 30);  //  => true && false = false
		
		//���� ��ΰ� true ���߸� ����� true�� ��µǰ� �ϳ��� �� Ʋ���� false�� ��µ�
	
//		int x = 10;
//		int y = 20;
//		int z = 20;
	
//		System.out.println(x == 10 && y == 20 && z ==30);
		
//		int x = 10;
//		int y = 20;
//		int z = 20;
		
//		System.out.println(x == 10 || y == 20); 
//		System.out.println(x == 10 || y == 30);
		
		//�ϳ� �̻��� true �� ���� true, ��� ������ Ʋ���� false
		
		//!true -> false
		//!false -> true
		
//		int x = 10;
//		System.out.println(!(x == 10));  // x == 10 -> true ���� �տ� !�� �پ ����� false

//		3.45 <= 2  ->  double <= int  ->  double <= double  -> double
		
		//���ǿ�����(���׿�����)
		//      ���ǽ�             ? ���1 : ���2
		// (true or false) ?(true):(false)  -> �� ���ǽ��� ����� ���� ���1 or ���2�� ��µȴ�
		
//		int x = 10;
//		int y = 20;
	
//		int result = (x > y) ? x : y;
//		System.out.println(result);
		
//		int age = 20;
//		String rs = (age >= 20) ? "���� �Դϴ�." : "�̼��� �Դϴ�.";  //������� ���� ���� ����!
//		System.out.println(rs);
		
		// 456 -> 400 ,  111 -> 100
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �ڸ� ���ڸ� �Է��ϼ���: ");
//		int num = sc.nextInt();
		
//		System.out.println("�Է¹��� ��: " + num);
//		System.out.println("����Ǿ��� ���: " + num / 100 * 100);  // 456 / 100 -> 4 * 100 = 400
		
		// 333 -> 331 , 776 -> 771
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ���: ");
//		int num = sc.nextInt();
		
//		System.out.println("�Է¹��� ��: " + num);
//		System.out.println("����Ǿ��� ���: " + (num / 10 * 10 + 1));

		
//		10�� ���
//		19 -> 20 , 81 -> 90
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(num / 10 * 10 + 10);
		
//		10�� ����� ���� �� ������ ���ϱ�
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println((num / 10 * 10 + 10)%num);
//		=
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(10 - num % 10);
		
		//����� ������ �Է¹޴´�.
		//�� �ٱ��Ͽ� 10���� ����� ���� �� �ִ�.
		//�׷� �� ���� �ٱ��ϰ� �ʿ��ұ�?
		// 123 -> 13�� , 456 -> 46��
		// ����� �� ������ 123���̸�, �ٱ��ϴ� 13�� �ʿ��մϴ�.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("����� ������ �Է��ϼ���: ");
//        int appleNum = sc.nextInt();
		
//        int bucketNum = appleNum / 10 + (appleNum % 10 > 0 ? 1 : 0);
//		System.out.print("����� ������ ��  " + appleNum + "���̸�, ");
//		System.out.print("�ٱ��ϴ� " + bucketNum + "�� �ʿ��մϴ�.");
		
//		int x = 5;
//		System.out.println(x >= 0 && x <= 10);  // = true
//		System.out.println(x <= 0 || x >= 10);  // = false
//		System.out.println(!(x <= 0 || x >= 10));
	}

}
