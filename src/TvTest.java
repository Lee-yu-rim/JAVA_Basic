
public class TvTest {
	
	//int sum;  //멤버변수

	public static void main(String[] args) {
		
		//int sum = 0;  //지역변수  -> main 함수 안에서만 사용 가능 / 블록 안에 선언된 모든 변수들
		//지역변수는 연산 되기 전에 값이 초기화 되어있지 않은 상태면 사용이 불가능하다.
		
		//멤버변수는 초기화 하지 않아도 사용이 가능하다 ex)Tv클래스에서 channel이라는 변수에 값을 초기화 하지 않았음에도 channel++와 같은 변수 사용이 가능하다.
		//=> 왜냐하면 앞에 적힌 타입에 기본값이 정해져있기 때문! ex) boolean = false/int = 0/String = null ...
		
		//sum += 10;
		
		//System.out.println(new Tv());   //객체 생성 -> 생성과 동시에 변수와 메소드가 메모리에 할당된다. -> 동시에 객체에 생성된 메모리의 첫번째 위치의 주소값을 받아온다.
		// => Tv@15db9742
		//new Tv() -> 생성된 Tv객체의 첫번째 멤버(클래스 안에 있는 변수)의 주소값
		
		//System.out.println(new Tv());   // =>Tv@15db9742
		//System.out.println(new Tv());   // =>Tv@6d06d69c
		//각각의 Tv라는 객체가 생성된다. 같은 조건을 가진 Tv가 따로 생성됨.
		
		//new Tv().power = true;   // . : 참조연산자 => Tv라는 클래스 안에 생성된 멤버를 참조하여 사용할 수 있다.
		//new Tv().channel = 10;   //위 에 적은 Tv와는 다른 클래스가 된다.
		
		Tv t = new Tv();   //객체의 주소값을 받는 변수는 생성된 객체가 가진 이름으로 타입을 선언하고 변수 이름을 지정하여 사용한다.  => 참조변수(=주소값)
		//System.out.println(t);  // => Tv@15db9742
		t.power = true;
		t.channel = 10;
		System.out.println(t.channel);  // 10
		
		t.channelDown();
		System.out.println(t.channel);  // 9
		
		Tv t2 = new Tv();
		t2.channel = 20;
		
		System.out.println(t.channel);  // 9
		System.out.println(t2.channel); // 20
		t2.channelDown();
		
		System.out.println(t.channel);  // 9
		System.out.println(t2.channel); // 19
		
		t2 = t; // 두 참조변수의 타입이 동일해야 치환이 가능하다.
		
		System.out.println(t.channel);  // 9
		System.out.println(t2.channel); // 9
		
		t.channelDown();
		
		System.out.println(t.channel);  //8
		System.out.println(t2.channel); //8
		
		
		
		
		
		
	}

}

