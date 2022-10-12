
public class MemberInitTest {

	public static void main(String[] args) {
		MemberInit mi = new MemberInit(88,99);
//		static 초기화 블럭
//		인스턴스  초기화 블럭
//		생성자의 호출
//		==> 생성자의 호출 순으로 초기화가 진행된다.
		MemberInit mi2 = new MemberInit(101,102);
//		static 초기화 블럭
//		인스턴스  초기화 블럭
//		생성자의 호출
//		인스턴스  초기화 블럭
//		생성자의 호출
//		==> static은 한 번만 실행되고, 나머지는 반복실행한다.
		
		

	}

}
