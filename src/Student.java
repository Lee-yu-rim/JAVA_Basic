
public class Student {
	
	String name;//�л��̸�
	int ban;//��
	int no;//��ȣ
	int kor;//��������
	int eng;//��������
	int math;//��������
	
	Student(String name,int ban,int no,int kor,int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	double getAverage() {
		return (int)(getTotal() / 3.0 * 10 + 0.5) / 10.0;  //78.666664
	}
	
//	78.666664 * 10  //786.6664
//	786.66664 + 0.5 //787.16664
//	(int)787.16664  //787
//	787 / 10.0  //78.7
	
	
	
	
	
//	String name;
//	int age;
//	int grade;
//	
//	Student(String name,int age,int grade){
//		this.name = name;
//		this.age = age;
//		this.grade = grade;	
//	}
	

	

}
