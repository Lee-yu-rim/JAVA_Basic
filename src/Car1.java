
public class Car1 {
	//Ŭ������ �����ϴ� ���
	
	//�Ӽ� - �ν��Ͻ� ���� / Ŭ���� ����
	//������ - �������(�� �ν��Ͻ�)�� �ʱ�ȭ �Ѵ�.
	//       Ŭ������ �̸��� �����ϰ� �ۼ��Ѵ�.
	//       ��ü�� �����ϴ� ������ �� ���� ȣ��Ǿ�����.
	//       �⺻�����ڴ� ���� ���� => �ٸ������ڰ� �������� ��������
	//       ������ �����ε��� ����
	//       ��� Ŭ������ �����ڸ� �����Ѵ�.
	//       this // this()
	//�޼ҵ� - �ν��Ͻ� �޼ҵ� / Ŭ���� �޼ҵ�
	
	String color;
	String gearType;
	int door;
	
//	//�⺻������ => ����(���๮)�� �ƹ��͵� ���� ���� �ۼ����� �ʰ�, �����Ǿ� �ִ�. 
//	Car1(){   
//		//���๮
//	}
	
	
	Car1(String color){
		this(color,"Auto");  //this() = ���� Ŭ���� �ȿ� �ִ� �ٸ� �����ڸ� ȣ��
		//this.color = color;  //�������� �̸��� ��������� �̸��� ���� �� ������� �տ� this�� ����Ѵ�.
	}                        //���⼭ this�� Car1(Ŭ���� �ڽ�)�� �ǹ��Ѵ�.
	
	Car1(String color, String gearType){  //�� �޼ҵ忡�� this(color,"Auto")��� ȣ�⹮�� ���� �� �޼ҵ带 �����Ŵ�� ���ÿ� gearType�̶�� �����ȿ� Auto��� ���� ��Ī�̵ȴ�.
		this(color,gearType,4);
		//this.color = color;
		//this.gearType = gearType;
	}
	
	Car1(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	

}
