
public class Overloding {
	//�����ε� : �޼ҵ� ���� �� ����ϴ� ���
	//1. �޼ҵ��� �̸��� �����ϰ� �����Ѵ�.
	//2. ��, �Ű������� Ÿ�� �Ǵ� ������ �޶���Ѵ�.
	//3. ����Ÿ�԰��� �����ϴ�.
	//4. ��ü�� �������� ������ ���� => ������ : �ϳ��� �̸����� �������� ����� �����ϴ� �� 
	
	void add() {}
	
	void add(int x) {}
	
	void add(long l) {}
	
	void add(int x, int y) {}
	
	void add(int x, long y) {}
	
	void add(long x, int y) {}
	
	// =>�̷������� ���� �޼ҵ��� �̸��̾ �Ű������� Ÿ���� �ٸ��ų�, ������ �ٸ��� �����ε��� �����ϴ�.
	
	//int add() {} = void add() {} �� ���ٰ� �ν��ϱ� ������ ����Ÿ�԰��� �����ϴ�.

}