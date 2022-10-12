
public class OverlodingTest {

	public static void main(String[] args) {
		
		Overloding ol = new Overloding();
		
		//동일한 이름을 가진 여러 메소드를 호출하는 방법들
		ol.add();
		ol.add(3);    //매개변수가 한개짜리인 메소드를 자동으로 호출한다. => (int x)
		ol.add(3L);   //접미사L을 붙여야 long 메소드가 호출이 된다.
		ol.add(2,3);  
		ol.add(2,3L);
		ol.add(2L,3);
		
		
		//System.out.println(3);     //매개변수의 타입 int
		//System.out.println('C');   //매개변수의 타입 char
		//System.out.println("abc"); //매개변수의 타입 String
		//println도 마찬가지로 오버로드를 사용해서 출력값을 내는 것
		
		//오버로딩을 사용하는 이유는 출력할 때 여러개의 변수를 호출하기 번거롭기 때문에,
		//하나의 메소드 이름을 정의하여 한가지 이름으로 메소드를 호출하고 출력하여 사용하기 위함
		
		

	}

}
