
public class CaptionTv extends Tv{
	//Tv클래스로부터 변수 7개와 메소드 6개를 상속 받는다.
	boolean caption;  //false가 기본값
	
	void displayCaption(String text) {  //자막기능 만들기
		if(caption) {  //caption 자체가 논리값이된다.
			System.out.println(text);
		}
	}

}
