
public class Car1Test {

	public static void main(String[] args) {
//		Car1 c1 = new Car1();  //생성자의 호출 => 객체가 생성됨과 동시에 생성자가 호출되며, 객체가 생성될 때 한 번만 호출할 수 있다.
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
//		//c2는 생성자에 초기화된 값을 가져온다.
		
		Car1 c3 = new Car1("red");  //한가지 변수를 가진 메소드가 실행됨
		System.out.println(c3.color);   //red
		System.out.println(c3.gearType);  //null => 메소드에 기본값이 초기화가 안된 상태이므로 각 변수 타입의 기본값이 출력된다.
		System.out.println(c3.door);  //0
		
		Car1 c4 = new Car1("blue","Auto");  //두가지 변수를 가진 메소드가 실행됨
		System.out.println(c4.color);   //blue
		System.out.println(c4.gearType);   //Auto
		System.out.println(c4.door);    //0
		
		Car1 c5 = new Car1("yellow", "Auto", 3);
		System.out.println(c5.color);   //yellow
		System.out.println(c5.gearType);   //Auto
		System.out.println(c5.door);   //3
		
		
		
		
		
		
				

	}

}
