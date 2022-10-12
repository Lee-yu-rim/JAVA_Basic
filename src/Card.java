
public class Card {
	//속성 
	//멤버변수(자동초기화) : 
	//      인스턴스 변수 - int age 
	//      클래스(스태틱) 변수 - static int size
	//                       필요에 따라서 선언과 동시에 초기화를 한다.
	//                       생성없이 사용이 가능하다.
	//                       공유되어진다.
	
	//int iv;
	//static int cv = 100;
	
//	void channer() {
//		int x;   // 지역변수(강제 초기화)
//	}
	
	
	//속성 :  숫자, 모양, 크기(높이,넓이)...
	
	int number;
	String kind;
	static int height = 100;
	static int width = 80;
	//카드의 크기는 고정되어 있기 때문에 높이와 가로길이는 static 변수를 이용하는 것이 효율적이다.  
	
	
	
}
