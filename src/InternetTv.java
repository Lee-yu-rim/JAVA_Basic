
public class InternetTv extends Tv {
	boolean internet;
	
	void internetPower() {
		if(internet) {
			System.out.println("인터넷 접속");
		}
	}

}
