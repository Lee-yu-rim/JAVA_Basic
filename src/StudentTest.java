
public class StudentTest {

	public static void main(String[] args) {
		//���� : 100
		//���� : 60
		//���� : 76
		
		Student s1 = new Student("ȫ�浿",1,15,100,60,76);
		
		System.out.println("�̸� : " + s1.name);
		System.out.println("���� : " + s1.getTotal());
		System.out.println("��� : " + s1.getAverage());		

	}

}

//������
//
//�̸� : ȫ�浿
//���� : 236
//��� : 78.7 (�Ҽ��� ��° �ڸ����� �ݿø�)




//Student s1 = new Student("ȫ�浿",10,3);
////s1.name = "ȫ�浿";
////s1.age = 10;
////s1.grade = 3; 
////�̷������� �ڵ带 �ۼ��ϰ� �Ǹ� ��ȿ�����̰�, �̹� ������ �ȿ� �̷��� ������ ��������ֱ� ������ �̷������� �ۼ��� �ʿ䰡 ����.
//Student s2 = new Student("�̼���",10,3);
//Student s3 = new Student("������",10,3);
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