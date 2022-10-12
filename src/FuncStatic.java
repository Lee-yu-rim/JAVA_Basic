
public class FuncStatic {
	int iv;
	static int cv;
	
	//멤버메소드 : 인스턴스 메소드 
	//          -> 인스턴스 변수, 클래스 변수 모두 사용 가능
	//          -> 인스턴스 메소드, 클래스 메소드 모두 사용 가능
	//          클래스(static) 메소드 
	//          -> 객체 생성없이 사용가능
	//          -> 클래스 변수, 클래스 메소드만 사용 가능
	
	void instanceMethod() {
		System.out.println("instanceMethod() call");
		iv = 10;
		cv = 20;
		
		System.out.println("iv = " + iv);
		System.out.println("cv = " + cv);
		
		staticMethod();  //스태틱 메소드가 인스턴스 메소드보다 먼저 메모리가 할당되어 있기 때문에 호출에 문제가 없음
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() call");
		//iv = 30;   //클래스 메소드 안에서는 인스턴스 멤버를 사용할 수 없다.
		cv = 40;
		
		System.out.println("cv = " + cv);
		
		//instanceMethod(); //스태틱 메소드 안에서는 인스턴스 메소드를 사용할 수 없다.
		
	}
	
	//인스턴스 메소드와 멤버는 생성과 동시에 메모리에 할당이 되지만,
	//클래스 메소드와 멤버는 생성이 없이도 사용이 가능하기 때문에
	//인스턴스 메소드(멤버)가 생성되기 이전에 이미 메모리에 할당되어 있는 상태다.
	
	
	

}
