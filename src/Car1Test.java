
public class Car1Test {

	public static void main(String[] args) {
//		Car1 c1 = new Car1();  //�������� ȣ�� => ��ü�� �����ʰ� ���ÿ� �����ڰ� ȣ��Ǹ�, ��ü�� ������ �� �� ���� ȣ���� �� �ִ�.
//		c1.color = "red";
//		c1.gearType = "Auto";
//		c1.door = 4;
//		
//		System.out.println(c1.color);  //red
//		System.out.println(c1.gearType);  //Auto
//		System.out.println(c1.door);   //4
//		
//		Car1 c2 = new Car1();
//		
//		System.out.println(c2.color);   //blue
//		System.out.println(c2.gearType);  //stick
//		System.out.println(c2.door);   //3
//		//c2�� �����ڿ� �ʱ�ȭ�� ���� �����´�.
		
		Car1 c3 = new Car1("red");  //�Ѱ��� ������ ���� �޼ҵ尡 �����
		System.out.println(c3.color);   //red
		System.out.println(c3.gearType);  //null => �޼ҵ忡 �⺻���� �ʱ�ȭ�� �ȵ� �����̹Ƿ� �� ���� Ÿ���� �⺻���� ��µȴ�.
		System.out.println(c3.door);  //0
		
		Car1 c4 = new Car1("blue","Auto");  //�ΰ��� ������ ���� �޼ҵ尡 �����
		System.out.println(c4.color);   //blue
		System.out.println(c4.gearType);   //Auto
		System.out.println(c4.door);    //0
		
		Car1 c5 = new Car1("yellow", "Auto", 3);
		System.out.println(c5.color);   //yellow
		System.out.println(c5.gearType);   //Auto
		System.out.println(c5.door);   //3
		
		
		
		
		
		
				

	}

}
