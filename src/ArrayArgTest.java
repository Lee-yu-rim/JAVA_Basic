
public class ArrayArgTest {

	public static void main(String[] args) {
		ArrayArg ay = new ArrayArg();  //배열변수는 참조형이다 -> 배열변수 자체가 주소값을 가지기 때문
		ay.x = 10;
		ay.arr[0] = 1;
		ay.arr[1] = 2;
		ay.arr[2] = 3;
		ay.arr[3] = 4;
		ay.arr[4] = 5;
		
		for(int i : ay.arr) {
			System.out.println(i);
			}
		
		int[] arr2 = change(ay.arr);  //arr2을 리턴하면 배열형태의 arr2이 형성되고, (2)
		
		for(int i : arr2) {
			System.out.println(i);   //배열이 된 arr2의 값을 출력하라 (3)
		}
		
	}
	
	static int[] change(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1) * 10;
		}
		
		int[] arr2;
		arr2 = arr;
		
		return arr2;  //arr2의 값을 반환하라 (1)
		
	}
		
		
//		
//		change(ay.arr); //ArrayArg에 있는 arr배열의 0번째의 값을 의미
//		// -> 0번째의 값을 밑에서 100으로 바꿔주었기 때문에 arr[0]의 값은 100이 된다.
//		
//		for(int i : ay.arr) {
//			System.out.println(i);  // 100 2 3 4 5 출력
//		}
//		
//
//	}
//	
//	static void change(int[] arr) {  //배열변수를 가져올때는 배열타입으로 가져와야함
//		arr[0] = 100;
//		System.out.println("change() = " + arr[0]);
//	}
	

}