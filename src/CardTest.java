
public class CardTest {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.number = 1;
		c1.kind = "heart";
				
		Card c2 = new Card();
		c2.number = 3;
		c2.kind = "spade";
		
		System.out.println(c1.number);
		System.out.println(c1.kind);
		
		System.out.println(c2.number);
		System.out.println(c2.kind);
		
		System.out.println(Card.height);
		System.out.println(Card.width);
		
		
		
//		System.out.println("Card.cv = " + Card.cv);
//		// 생성 없이 변수의 사용이 가능하다.
//		
//		Card c1 = new Card();
//		c1.iv = 10;
//		
//		Card c2 = new Card();
//		c2.iv = 20;
//		
//		System.out.println("c1.iv = " + c1.iv);  //10
//		System.out.println("c2.iv = " + c2.iv);  //20
//		
//		System.out.println("c1.cv = " + c1.cv);  //100
//		System.out.println("c2.cv = " + c2.cv);  //100
//		
//		c1.cv = 80;   //c1 과 c2는 스태틱변수로 선언한 cv의 값을 공유해서 사용한다. -> 값이 바뀌면 같이 바뀜.
//		
//		System.out.println("c1.cv = " + c1.cv);  //80
//		System.out.println("c2.cv = " + c2.cv);  //80
//		
//		Card.cv = 200;
//		
//		System.out.println("c1.cv = " + c1.cv);  //200
//		System.out.println("c2.cv = " + c2.cv);  //200

	}

}
