
public class Overloding {
	//오버로딩 : 메소드 정의 시 사용하는 방법
	//1. 메소드의 이름을 동일하게 정의한다.
	//2. 단, 매개변수의 타입 또는 갯수는 달라야한다.
	//3. 리턴타입과는 무관하다.
	//4. 객체의 다형성을 구현한 형식 => 다형성 : 하나의 이름으로 여러가지 기능을 수행하는 것 
	
	void add() {}
	
	void add(int x) {}
	
	void add(long l) {}
	
	void add(int x, int y) {}
	
	void add(int x, long y) {}
	
	void add(long x, int y) {}
	
	// =>이런식으로 같은 메소드의 이름이어도 매개변수의 타입이 다르거나, 갯수가 다르면 오버로딩이 가능하다.
	
	//int add() {} = void add() {} 와 같다고 인식하기 때문에 리턴타입과는 무관하다.

}
