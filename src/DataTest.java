
public class DataTest {

	public static void main(String[] args) {
		
		Data d = new Data();
//		d.x =10;
//		
//		Data d2 = copy(d);  
//		
//		System.out.println(d.x);  //10
//		System.out.println(d2.x); //10
//		//두개는 같은 값이지만 참조하는 주소는 다르다.
//		
//	}
//	
//	static Data copy(Data d) {
//		
//		Data tmp = new Data();
//		tmp.x = d.x;  //tmp라는 새로운 주소값의  x와 d라는 주소값의 x의 값이 똑같이 10이 되지만, 서로의 위치값은 다르다.
//		
//		return tmp;
//		
//		//copy(data d)라는 함수는 Data tmp라는 객체를 새로 생성하고 tmp.x의 값에 d.x의 값을 집어넣는 역할을 수행한 뒤, tmp의 주소값으로 반환된다.(원래 있던 함수로 돌아감)
//		//그리고 위에 있는 copy(d)라는 함수를 호출했을 때, copy(d)자체가 tmp의 주소값이 되어있기 때문에 Data d2 = copy(d)의 의미는 d2 = tmp 라는 것이며,
//		//이는 d2의 주소값이 tmp의 주소값과 같다는 의미이다.
//		
//	}

	
		
//      ================================================================================		
		
//		Data d = new Data();  //(1) d(주소값)가 옮겨가는 순서 
		
		//메소드의 기본형
//		d.x = 10;  //d라는 객체 안에 있는 x라는 변수의 값을 10으로 지정한다.
//		System.out.println(d.x);  // 10
//		
//		change(d.x);  //d.x = 10인 상태
//		System.out.println(d.x);  //10
		
		//메소드의 참조형
		d.x = 10;
		System.out.println(d.x);  //10
		
		change(d); //(2) //데이터를 넘길 때 타입이 동일해야함 -> 아래 매개변수의 타입이 Data 이므로 d라는 주소값을 넘길 수 있다.
	    //값을 전달하기 위한 변수생성	
	
		System.out.println(d.x);  //1000  --> 밑에서 d.x값을 1000으로 바꿨기 때문에 1000으로 변경됨
		//주소값을 이용해서 복사하기 때문에 복사한 값이 바뀌면 원본 데이터의 값도 바뀐다.

	}
	
	//메소드의 기본형
//	static void change(int x) {  //값의 복사 // int x = 매개변수이자 지역변수
//		x = 1000;
//		System.out.println("change() : " + x);  // 1000
		
//	}
	
	
	//메소드의 참조형  --> 매개변수를 주소값으로 만들어서 참조하여 변수를 사용하는 방법
	static void change(Data d) {  //(3)  // 매개변수(지역변수) Data d는 주소값을 받는다.  
	// 윗줄에 있는 d와 앞에 생성한 d는 블록을 넘어가기 때문에 서로 다른 d이다. 같은 변수가 아님. (지역변수는 블록을 넘어가면 사용할 수 없음)
		d.x = 1000;
		System.out.println(d.x);
		System.out.println("change() : " + d.x);
	}
	
	//정리!
	//메소드의 기본형은 데이터를 넘길 때 x라는 변수의 값을 복사해서 넘겨주는 것이기 때문에 아래 메소드의 x의 값이 바뀌어도 윗 블록 안에 있는 x의 값은 바뀌지 않는다. - 블록을 벗어나면 같은 값을 쓰지 못한다.
	//반면 메소드의 참조형은 데이터를 넘길 때 x라는 변수의 값이 아닌 d라는 주소값을 넘겨주는 것이기 때문에 아래 메소드의 x의 값이 바뀌면 윗 블록 안에 있는 x의 값도 바뀌게 된다! 
	//**중요한건 데이터를 넘길때 타입이 동일해야한다는 점!
	
	
	
	
	

}
