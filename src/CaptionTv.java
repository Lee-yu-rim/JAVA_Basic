
public class CaptionTv extends Tv{
	//TvŬ�����κ��� ���� 7���� �޼ҵ� 6���� ��� �޴´�.
	boolean caption;  //false�� �⺻��
	
	void displayCaption(String text) {  //�ڸ���� �����
		if(caption) {  //caption ��ü�� �����̵ȴ�.
			System.out.println(text);
		}
	}

}
