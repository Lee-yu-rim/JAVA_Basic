
public class OverlodingTest {

	public static void main(String[] args) {
		
		Overloding ol = new Overloding();
		
		//������ �̸��� ���� ���� �޼ҵ带 ȣ���ϴ� �����
		ol.add();
		ol.add(3);    //�Ű������� �Ѱ�¥���� �޼ҵ带 �ڵ����� ȣ���Ѵ�. => (int x)
		ol.add(3L);   //���̻�L�� �ٿ��� long �޼ҵ尡 ȣ���� �ȴ�.
		ol.add(2,3);  
		ol.add(2,3L);
		ol.add(2L,3);
		
		
		//System.out.println(3);     //�Ű������� Ÿ�� int
		//System.out.println('C');   //�Ű������� Ÿ�� char
		//System.out.println("abc"); //�Ű������� Ÿ�� String
		//println�� ���������� �����ε带 ����ؼ� ��°��� ���� ��
		
		//�����ε��� ����ϴ� ������ ����� �� �������� ������ ȣ���ϱ� ���ŷӱ� ������,
		//�ϳ��� �޼ҵ� �̸��� �����Ͽ� �Ѱ��� �̸����� �޼ҵ带 ȣ���ϰ� ����Ͽ� ����ϱ� ����
		
		

	}

}
