
public class ArrayArgTest {

	public static void main(String[] args) {
		ArrayArg ay = new ArrayArg();  //�迭������ �������̴� -> �迭���� ��ü�� �ּҰ��� ������ ����
		ay.x = 10;
		ay.arr[0] = 1;
		ay.arr[1] = 2;
		ay.arr[2] = 3;
		ay.arr[3] = 4;
		ay.arr[4] = 5;
		
		for(int i : ay.arr) {
			System.out.println(i);
			}
		
		int[] arr2 = change(ay.arr);  //arr2�� �����ϸ� �迭������ arr2�� �����ǰ�, (2)
		
		for(int i : arr2) {
			System.out.println(i);   //�迭�� �� arr2�� ���� ����϶� (3)
		}
		
	}
	
	static int[] change(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1) * 10;
		}
		
		int[] arr2;
		arr2 = arr;
		
		return arr2;  //arr2�� ���� ��ȯ�϶� (1)
		
	}
		
		
//		
//		change(ay.arr); //ArrayArg�� �ִ� arr�迭�� 0��°�� ���� �ǹ�
//		// -> 0��°�� ���� �ؿ��� 100���� �ٲ��־��� ������ arr[0]�� ���� 100�� �ȴ�.
//		
//		for(int i : ay.arr) {
//			System.out.println(i);  // 100 2 3 4 5 ���
//		}
//		
//
//	}
//	
//	static void change(int[] arr) {  //�迭������ �����ö��� �迭Ÿ������ �����;���
//		arr[0] = 100;
//		System.out.println("change() = " + arr[0]);
//	}
	

}