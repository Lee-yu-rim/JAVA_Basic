
public class TvTest {
	
	//int sum;  //�������

	public static void main(String[] args) {
		
		//int sum = 0;  //��������  -> main �Լ� �ȿ����� ��� ���� / ��� �ȿ� ����� ��� ������
		//���������� ���� �Ǳ� ���� ���� �ʱ�ȭ �Ǿ����� ���� ���¸� ����� �Ұ����ϴ�.
		
		//��������� �ʱ�ȭ ���� �ʾƵ� ����� �����ϴ� ex)TvŬ�������� channel�̶�� ������ ���� �ʱ�ȭ ���� �ʾ������� channel++�� ���� ���� ����� �����ϴ�.
		//=> �ֳ��ϸ� �տ� ���� Ÿ�Կ� �⺻���� �������ֱ� ����! ex) boolean = false/int = 0/String = null ...
		
		//sum += 10;
		
		//System.out.println(new Tv());   //��ü ���� -> ������ ���ÿ� ������ �޼ҵ尡 �޸𸮿� �Ҵ�ȴ�. -> ���ÿ� ��ü�� ������ �޸��� ù��° ��ġ�� �ּҰ��� �޾ƿ´�.
		// => Tv@15db9742
		//new Tv() -> ������ Tv��ü�� ù��° ���(Ŭ���� �ȿ� �ִ� ����)�� �ּҰ�
		
		//System.out.println(new Tv());   // =>Tv@15db9742
		//System.out.println(new Tv());   // =>Tv@6d06d69c
		//������ Tv��� ��ü�� �����ȴ�. ���� ������ ���� Tv�� ���� ������.
		
		//new Tv().power = true;   // . : ���������� => Tv��� Ŭ���� �ȿ� ������ ����� �����Ͽ� ����� �� �ִ�.
		//new Tv().channel = 10;   //�� �� ���� Tv�ʹ� �ٸ� Ŭ������ �ȴ�.
		
		Tv t = new Tv();   //��ü�� �ּҰ��� �޴� ������ ������ ��ü�� ���� �̸����� Ÿ���� �����ϰ� ���� �̸��� �����Ͽ� ����Ѵ�.  => ��������(=�ּҰ�)
		//System.out.println(t);  // => Tv@15db9742
		t.power = true;
		t.channel = 10;
		System.out.println(t.channel);  // 10
		
		t.channelDown();
		System.out.println(t.channel);  // 9
		
		Tv t2 = new Tv();
		t2.channel = 20;
		
		System.out.println(t.channel);  // 9
		System.out.println(t2.channel); // 20
		t2.channelDown();
		
		System.out.println(t.channel);  // 9
		System.out.println(t2.channel); // 19
		
		t2 = t; // �� ���������� Ÿ���� �����ؾ� ġȯ�� �����ϴ�.
		
		System.out.println(t.channel);  // 9
		System.out.println(t2.channel); // 9
		
		t.channelDown();
		
		System.out.println(t.channel);  //8
		System.out.println(t2.channel); //8
		
		
		
		
		
		
	}

}

