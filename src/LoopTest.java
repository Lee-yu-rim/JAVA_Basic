import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		//�ݺ��� : ���๮�� ������ �����ϰ� �Ѵ�.
		//for , while , do-while
		
//		for(�ʱⰪ;���ǽ�(�������� �ݺ��� ������);������) {
//			���๮ (�� ������ �ݺ��Ѵ�)
//      }
		
		
//		for(int i=0;i<10;i++) {  //���ǽ���  false�� �Ǹ� ���� ����
//			System.out.println(i + " :hello");  //����Ǵ� ����: �ʱⰪ -> ���ǽ� -> ���๮ -> ������  **�ʱⰪ�� ������ ���۵ɶ� ó���� ���� -> ���ǽ� -> ���๮ -> ������ �ݺ�
//		}
		
//		for(int i=0;i<10;i+=2) {  // 0,2,4,6,8
//			System.out.println(i + " :hello");
//		}
		
		
//		for(int i=10;i>0;i--) {
//			System.out.println(i + " :hello");
//		}
		
//		for(;true;) {   //���ѹݺ���
//			System.out.println("hello");
//		}
		
//		int k = 1;
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(k++);   //k���  �ܺκ����� ���� ����� ���
//		}
		
		//1 ~ 10 ������ ������ �߿� ¦���� ���
		
//		for(int i=1;i<=10;i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);	
//			}
//		}

		
		//1 + 2 + 3 + ... + 10  => 55
		
//		int sum = 0;    //������ ���� �����ϱ� ���ؼ��� �ʱ�ȭ�� �ʿ��ϴ�.
//		
//		for(int i=1;i<=10;i++) {
//			sum += i;		//sum = sum + i
//		}
//		
//		System.out.println(sum);

		
		//1���� 10������ �����߿� Ȧ���� �հ� ¦���� ��
//		int sum1 = 0;  // ���� �����ϱ� ���� ����
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
//		System.out.println("Ȧ��: " + sum1);
//		System.out.println("¦��: " + sum2);
		
//		�ʱⰪ  //�ʱⰪ�� ������ �� �� �� ����� �� �ٽ� ������� �ʴ´�.
//		while(���ǽ�) {
//			���๮
//		        ������
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
		
		//while�� ���ѹݺ���
//		while(true) {
//			System.out.println("hello");
//		}
		
		
		//while�� �ݺ������� ��������� �����ϴ� ���
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
		
//		//��ø �ݺ���
//		for() {  // n = 5(�ݺ�Ƚ��)      ��ü �ݺ� Ƚ�� = n x m = 25
//			for() {   // m = 5(�ݺ�Ƚ��)
//				���๮  // -> 25ȸ �ݺ��ȴ�.
//			}
//		}
		
//		int k = 1;
//		for(int i=0;i<5;i++) {    //��ø ���� �ȿ� ������ �޶����
//			for(int j=0;j<5;j++) {
//				System.out.println(k++);  // =  1 2 3 4...25�� Ƚ����ŭ ���
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
//		4  4   -> �� 25ȸ
		
		
		//������ �Ʒ��� ������ ������
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i + "x" + j + "=" + i*j);				
//			}
//			System.out.println();   //2x1=2
//			                        //2x2=4...
//		}
		
		
		//���ʿ��� ���������� ���� ������ -> ����� ��ĵ� ����ؾ��� println ���� ln�� �����ؾ� ����
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.print(j + "x" + i + "=" + j*i + " ");
//			}
//			System.out.println();   // 2x1=2 3x1=3 4x1=4...9x1=9
//			                        // 2x2=4 3x2=6 4x2=8...9x2=18 
//		}
		
//		�ʱⰪ1
//		while(���ǽ�) {
//			�ʱⰪ2
//			while(���ǽ�) {
//				���๮
//				������2;
//			}
//			������1;
//		}
		
//		int k = 1;
//		int i = 0;   //i�� �ʱⰪ
//		while(i<5) {
//			int j=0;   //j�� �ʱⰪ -> ��ġ �߿�!
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
		
		
		//�ʿ信 ���� 2���� ���� ���� ����
//		for(int i=0,j=10;i<10;i++,j--) {
//			System.out.println("i: " + i + ", " + "j: " + j);
//		}
		
//		int s = 0;
//		for(int i=0;i<10;i++,s++) {
//			System.out.println("i: " + i + ", " + "s: " + s);
//		}
//		
//		System.out.println(i);   // -> i�� for��� �ȿ� �����ϱ� ������ �ٱ����� ������ ��� �Ұ�
		
//		int s = 0;  //�ܺκ���
//		int i;   //���� ������ for�� �ۿ����� ������ �����ϴ�  -> �� ������ for�� �ٱ������� ��밡��
//		for(i=0;i<10;i++,s++) {   //�ܺκ����� for�� �ȿ� ��ġ�Ͽ� ��� ����
//			System.out.println("i: " + i + ", " + "s: " + s);
//		}
//		System.out.println(i);  //i�� ��� �ۿ��� �����ϰ� �Ǹ� ��� �ۿ����� ���
		
//		�ʱⰪ
//		do {
//			���๮
//			������
//		}while(���ǽ�)
			
//		int i = 11;
//		do {
//			System.out.println(i);    //���๮�� ���ǽĺ��� ���� ������ ������ ������ false ���� �ʱⰪ�� �� �� ���´�.
//			i++;
//		}while(i <= 10);
	
		
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ���
		
//		int sum = 0;
//		int sum2 = 0;
//		for(int i=1;i<=10;i++) {
//			sum += i;  // (0+1) (0+1+2) (0+1+2+3)... -> ���� ����� �����  sum�� ���Ե�
//			sum2 += sum;
//		}
//		System.out.println(sum2);
				
		//�ݺ����� ����
		//break, continue
		//���ǹ� �ȿ��� ���
		
//		for(int i=1;i<=10;i++) {
//			if(i > 5) {
//				break;  //�ݺ����� ����
//			}
//			System.out.println(i);
//		}	
		
		//break��
//		int k=1;
//		for(int i=0;i<5;i++) {
//			System.out.println("i = " + i);
//			for(int j=0;j<5;j++) {
//				if(k%3==0) {
//					break;    //ù��° for���� �����ϰ� break�� ����ִ� ��� �ȿ� �ִ� for������ ������ �ɸ�
//				}
//				System.out.println("k = " + k++);  // = i�� 0���� ��� �� ��, k�� 1, 2�� ��µǰ� �ٽ� i�� 1���� 4���� ���
//			}
//		}
		
		
//		int k=1;
//		for(int i=0;i<5;i++) {
//			System.out.println("i = " + i);
//			for(int j=0;j<5;j++) {
//				System.out.println("k = " + k++);
//				if(k%3==0) {
//					break;    //ù��° for���� �����ϰ� break�� ����ִ� ��� �ȿ� �ִ� for������ ������ �ɸ�
//				}
//			}
//		}
//		i = 0  // -> 3�� ����� �ɶ����� ������ ����� ���� for���� �����ϰ� �ٽ� ���� for���� ������ -> �ݺ�
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
//				continue;    //���ᰡ �ƴ� ���๮�� �����ϴ� ��. 
//			}
//			System.out.println(i);   //���๮�� ���ǿ� �������������� �����ϰ�, ���ǿ� �����ϸ� �������� �ʰ� ������ -> ���ǽļ����� ��� ����� 
//		} // = Ȧ�� �� ��쿡�� �������� �ʰ� ������ �ɾ����Ƿ� ¦���� ���� �����

		
		//12345 -> 1+2+3+4+5 -> 15
		
		
		//�� ���� �ݺ����� �𸣴� ��� -> while���� ����
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���: ");
//		int num = sc.nextInt();  //�� ���� �ݺ����� �����Ǵ� ��Ұ� �ԷµǴ� ������ num �̹Ƿ� �ʱⰪ�� �������� �ʰ� num�� �̿��ؼ� while���� �ۼ��� �� �ִ�.
//		
//		int sum = 0;
//		
////		12345 % 10 =5
////		12345 / 10 =1234
////		1234 % 10 =4
////		1234 / 10 =123
////		...
//	
//		while(num > 0) {   //num�� 0�� �Ǳ������� �����Ѵ�
//			sum += num % 10;  // = 5+4+3+2+1
//			num /= 10;  // = 12345, 1234, 123, 12 , 1
//		}System.out.println(sum);
		
		
		
		//������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. ��, x�� y�� �����̰� ������ ������ 
		//0<=x<=10, 0<=y<=10�̴�
		
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
		
		
		//1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ����Ͻÿ�
		
//		int sum = 0;
//		int s = 1;     //��ȣ�� ���� ����
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
//			System.out.println("��ȣ�� �����ϼ���: ");
//			System.out.println("1.������ 2.��� 3.�Ķ��� 4.����");
//			sel = sc.nextInt();
//			
//			if(sel == 1) {
//				System.out.println("������ ����");
//			}else if(sel == 2) {
//				System.out.println("��� ����");
//			}else if(sel == 3) {
//				System.out.println("�Ķ��� ����");
//			}else if(sel == 4) {
//				break;
//					}
//			}
		
		//����(����)
		//Math.random()    // 0.0 <= r < 1.0   -> 0.0 ~ 0.9999999...
		
		//System.out.println(Math.random());   //�������� ���ڰ� �����Ҷ����� �ٸ��� ����	
		//System.out.println(Math.random()* 10); // 0.0 ~ 9.99...
		//System.out.println((int)(Math.random() * 10));  // 0 ~ 9
		//System.out.println((int)(Math.random() * 10) + 1);  // 1 ~ 10
		
		//1 ~ 3		
		//System.out.println((int)(Math.random() * 3 - 1 + 1 ) + 1);
		
		
		//������ ��� ����
		//(int)(Math.random() * ������ ����(->������ �ִ밪 - ������ �ּҰ� + 1)) + ������ �ּҰ�
		
		
		
//		int com;
//		int me;
//		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			com = (int)(Math.random() * 3) + 1;
//			System.out.println("1.���� 2.���� 3.�� : ");
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
//			System.out.println("1.���� 2.���� 3.�� : ");
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
//		int correctCnt = 0;   //�̱� Ƚ��
//		int challengeCnt = 0; //��ü ���� Ƚ��
//		
//		Scanner sc = new Scanner(System.in); 
//		
//		while(true) {
//			
//			challengeCnt++;
//			if(challengeCnt == 4) {
//				System.out.println("3���� ������ȸ�� �� ����Ͽ����ϴ�.");
//				break;
//			}    // 3���� �� �Է��ϸ� �ƿ� �Է��� ���� ���ϵ��� �̰��� ��ġ��Ų��.
//			
//			System.out.println("===================");
//			com = (int)(Math.random() * 3) + 1;
//			System.out.println("1.���� 2.���� 3.�� : ");
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
//				System.out.println("�̱�Ƚ��: " + correctCnt + "ȸ");
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
