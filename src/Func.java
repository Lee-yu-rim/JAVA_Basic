
public class Func {
	
	//�޼ҵ�(�Լ�) : ��ü�� ����� �����Ѵ�.
	
//	����Ÿ�� �޼ҵ��([�Ű�����1,�Ű�����2,...]) {  //[] => ���ȣ �κ��� ������ �����ϴ�.
//		���๮��
//		[return ��]
//		
//	}
	
	//����Ÿ�� : void, �⺻�ڷ���, ������
	//�޼ҵ�� : ��Ÿ ǥ��� -�ҹ��ڴ빮�� (ex.tvTest)
	//�Ű����� : int x, double d, Tv t
	// => �Ű������� Ÿ�� 2���� call by value(�⺻��)/call by reference(������)
	//return : ����Ÿ���� void�� �ƴ� ��쿡 ���(�⺻�ڷ���, �������� ��)
	
	void add() {   //�޼ҵ��� �����(�ñ״�ó)
		System.out.println(2 + 3);  //�޼ҵ��� ������      //void�� ���� ������ return�� �� �� ����.
	}
	
	void add2(int x, int y) {  //�Ű����� -> ���� �ܺο��� �޾ƿ��� ����
		System.out.println(x + y);
	}
	
//	void add3(int x, int y) {  //returnŸ���� void�� ����� �� ���� ������ return Ÿ�Կ� ���缭 �޼ҵ带 ��������� ��.
//		int sum = x + y;   //��������
//		return sum;   // �����ް� ���� ���� �Է�
//	}
	
	int add3(int x, int y) {  //sum�� Ÿ���� int �̹Ƿ� void�� int�� �������ش�.
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
			System.out.println("�Լ��� ����");
			return;   //�Լ��� ��� ����  == �ݺ��������� break�� ���� �뵵
		}
		
		int result = x + y;
		System.out.println(result);
	}
		
	int test2(int x, int y) {
		
		int result;
		
		if(x > y) {
			result =  x;
		}else {
			result = y;   //���ǿ� �������� �ʴ� ���� ������ �����ϴ� ��� �ΰ����� ��� ����������Ѵ�.
		}
		return result;
	}
	
	
	void call1() {
		System.out.println("call1");
		call2();  //call2�� ȣ���Ѵ�.
	}
	
	void call2() {
		System.out.println("call2");
		call3();  //call3�� ȣ���Ѵ�.
	}
	
	void call3() {
		System.out.println("call3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
