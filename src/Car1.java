
public class Car1 {
	//클래스를 구성하는 요소
	
	//속성 - 인스턴스 변수 / 클래스 변수
	//생성자 - 멤버변수(중 인스턴스)를 초기화 한다.
	//       클래스의 이름과 동일하게 작성한다.
	//       객체를 생성하는 시점에 한 번만 호출되어진다.
	//       기본생성자는 생략 가능 => 다른생성자가 존재하지 않을때만
	//       생성자 오버로딩이 가능
	//       모든 클래스는 생성자를 포함한다.
	//       this // this()
	//메소드 - 인스턴스 메소드 / 클래스 메소드
	
	String color;
	String gearType;
	int door;
	
//	//기본생성자 => 역할(실행문)이 아무것도 없는 경우는 작성하지 않고, 생략되어 있다. 
//	Car1(){   
//		//실행문
//	}
	
	
	Car1(String color){
		this(color,"Auto");  //this() = 같은 클래스 안에 있는 다른 생성자를 호출
		//this.color = color;  //생성자의 이름과 멤버변수의 이름이 같을 때 멤버변수 앞에 this를 사용한다.
	}                        //여기서 this는 Car1(클래스 자신)을 의미한다.
	
	Car1(String color, String gearType){  //위 메소드에서 this(color,"Auto")라는 호출문을 통해 이 메소드를 실행시킴과 동시에 gearType이라는 변수안에 Auto라는 값이 매칭이된다.
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
