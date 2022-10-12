
public class ArrayMaxTest {

	public static void main(String[] args) {
		//1.ArrayMax 객체 생성
		//2.생성된 객체의 배열에 1부터 100사이의 값을 랜덤하게 저장한다.
		//3.메소드를 정의한다. (배열의 최댓값을 구해서 반환하도록 한다.)
		//4.반환된 최댓값을 출력한다. 
		
		//1번 객체생성
		ArrayMax ay = new ArrayMax();
		
		//2번 객체 배열에 랜덤값 지정
		for(int i=0;i<ay.arr.length;i++) {
			ay.arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int i : ay.arr) {
			System.out.println(i);
			}
		int max = arrayMax(ay.arr);
		System.out.println("max = " + max);
		}
	

	//3번 메소드 정의
	static int arrayMax(int[] arr) { //값이 들어있는 배열을 가져온다.
		//arrayMax라는 함수를 생성하고 역할을 부여한 뒤, 그 함수를 이용해서 값을 반환하도록 한다.
		//max값의 타입이 int이므로 void가 아닌 int로 바꿔준다.
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max <  arr[i]) {
				max = arr[i];
			}
		}return max;
	}


}
