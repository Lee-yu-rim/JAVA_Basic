
public class FuncStatic {
	int iv;
	static int cv;
	
	//����޼ҵ� : �ν��Ͻ� �޼ҵ� 
	//          -> �ν��Ͻ� ����, Ŭ���� ���� ��� ��� ����
	//          -> �ν��Ͻ� �޼ҵ�, Ŭ���� �޼ҵ� ��� ��� ����
	//          Ŭ����(static) �޼ҵ� 
	//          -> ��ü �������� ��밡��
	//          -> Ŭ���� ����, Ŭ���� �޼ҵ常 ��� ����
	
	void instanceMethod() {
		System.out.println("instanceMethod() call");
		iv = 10;
		cv = 20;
		
		System.out.println("iv = " + iv);
		System.out.println("cv = " + cv);
		
		staticMethod();  //����ƽ �޼ҵ尡 �ν��Ͻ� �޼ҵ庸�� ���� �޸𸮰� �Ҵ�Ǿ� �ֱ� ������ ȣ�⿡ ������ ����
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() call");
		//iv = 30;   //Ŭ���� �޼ҵ� �ȿ����� �ν��Ͻ� ����� ����� �� ����.
		cv = 40;
		
		System.out.println("cv = " + cv);
		
		//instanceMethod(); //����ƽ �޼ҵ� �ȿ����� �ν��Ͻ� �޼ҵ带 ����� �� ����.
		
	}
	
	//�ν��Ͻ� �޼ҵ�� ����� ������ ���ÿ� �޸𸮿� �Ҵ��� ������,
	//Ŭ���� �޼ҵ�� ����� ������ ���̵� ����� �����ϱ� ������
	//�ν��Ͻ� �޼ҵ�(���)�� �����Ǳ� ������ �̹� �޸𸮿� �Ҵ�Ǿ� �ִ� ���´�.
	
	
	

}
