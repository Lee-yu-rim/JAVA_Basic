
public class I3dTv extends Tv {
	//Tv클래스로부터 변수 7개와 메소드 6개를 상속 받는다.
	boolean i3d;
	
	void i3dPower() {
		if(i3d) {
			System.out.println("3D기능 동작중...");
		}
	}

}
