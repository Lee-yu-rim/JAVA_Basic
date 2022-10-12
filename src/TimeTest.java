
public class TimeTest {

	public static void main(String[] args) {
		//Time t1,t2,t3;
		
		Time[] time = new Time[3];  // 참조변수를 배열로 정의하는 것.
		
		for(int i=0;i<time.length;i++) {
			time[i] = new Time();
		}
		
		//time[0] = new Time();
		time[0].hour = 10;
		time[0].minute = 29;
		time[0].second = 33;
		
		//time[1] = new Time();
		time[1].hour = 3;
		time[1].minute = 45;
		time[1].second = 11;
		
		//time[2] = new Time();
		time[2].hour = 5;
		time[2].minute = 15;
		time[2].second = 53;
		
		//10시 29분 33초
		//3시 25분 11초
		//5시 15분 53초
		
		for(int i=0;i<time.length;i++) {
			System.out.println(time[i].hour + "시 " + time[i].minute + "분 " + time[i].second + "초");
		}
		//==
		for(Time t : time) {
			System.out.println(t.hour + "시 " + t.minute + "분 " + t.second + "초");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
