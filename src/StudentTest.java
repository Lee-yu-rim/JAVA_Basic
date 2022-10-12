
public class StudentTest {

	public static void main(String[] args) {
		//국어 : 100
		//영어 : 60
		//수학 : 76
		
		Student s1 = new Student("홍길동",1,15,100,60,76);
		
		System.out.println("이름 : " + s1.name);
		System.out.println("총점 : " + s1.getTotal());
		System.out.println("평균 : " + s1.getAverage());		

	}

}

//실행결과
//
//이름 : 홍길동
//총점 : 236
//평균 : 78.7 (소수점 둘째 자리에서 반올림)




//Student s1 = new Student("홍길동",10,3);
////s1.name = "홍길동";
////s1.age = 10;
////s1.grade = 3; 
////이런식으로 코드를 작성하게 되면 비효율적이고, 이미 생성자 안에 이러한 구조가 만들어져있기 때문에 이런식으로 작성할 필요가 없다.
//Student s2 = new Student("이순신",10,3);
//Student s3 = new Student("강감찬",10,3);
//
//System.out.println(s1.name);
//System.out.println(s1.age);
//System.out.println(s1.grade);
//
//System.out.println(s2.name);
//System.out.println(s2.age);
//System.out.println(s2.grade);
//
//System.out.println(s3.name);
//System.out.println(s3.age);
//System.out.println(s3.grade);