
public class ArrayMaxTest {

	public static void main(String[] args) {
		//1.ArrayMax ��ü ����
		//2.������ ��ü�� �迭�� 1���� 100������ ���� �����ϰ� �����Ѵ�.
		//3.�޼ҵ带 �����Ѵ�. (�迭�� �ִ��� ���ؼ� ��ȯ�ϵ��� �Ѵ�.)
		//4.��ȯ�� �ִ��� ����Ѵ�. 
		
		//1�� ��ü����
		ArrayMax ay = new ArrayMax();
		
		//2�� ��ü �迭�� ������ ����
		for(int i=0;i<ay.arr.length;i++) {
			ay.arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int i : ay.arr) {
			System.out.println(i);
			}
		int max = arrayMax(ay.arr);
		System.out.println("max = " + max);
		}
	

	//3�� �޼ҵ� ����
	static int arrayMax(int[] arr) { //���� ����ִ� �迭�� �����´�.
		//arrayMax��� �Լ��� �����ϰ� ������ �ο��� ��, �� �Լ��� �̿��ؼ� ���� ��ȯ�ϵ��� �Ѵ�.
		//max���� Ÿ���� int�̹Ƿ� void�� �ƴ� int�� �ٲ��ش�.
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max <  arr[i]) {
				max = arr[i];
			}
		}return max;
	}


}
