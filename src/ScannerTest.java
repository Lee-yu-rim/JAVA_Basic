import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//Ű���带 ���� �Է��ϴ� ���
		Scanner sc = new Scanner(System.in);  //���� �Է� ���� �� �ְ� �ʱ�ȭ �Ǿ��ִ� ����
		System.out.print("���� �ϳ��� �Է��ϼ���: ");
		int num = sc.nextInt();   //�Է�   //sc.nextInt() -> ���ڸ� �Է� ���� �� �ִ� ��� ����
		System.out.println("�Է��Ͻ� ������ " + num + " �Դϴ�");  //���   
		//num�̶�� ������ �����Ͽ� ���ڸ� �Է��ϸ�, �� �Է��� ���ڸ� ����س����� �ϴ� ��
		
		System.out.print("�Ǽ� �ϳ��� �Է��ϼ���: ");
		double d = sc.nextDouble();
		System.out.println("�Է��Ͻ� ������ " + d);
		
		sc.nextLine();  //\n�� ���ֱ� ���� �޼ҵ带 �̸� �� �� �� �������� (3)
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		String str = sc.nextLine();  //String nextLine�̶�� �Լ��� \n �̶�� ���๮�ڸ� �����ϰ� ���� (1)
		System.out.println("�Է��Ͻ� ���ڴ� " + str);   //\n�� �̹� �а� ������ ���� �Ǿ��� ������ ���� �Է��� �Ұ��� (2)
		
		
	}

}
