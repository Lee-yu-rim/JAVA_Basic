
public class Tv {
	//속성
	//크기,전원버튼,채널,볼륨,색상,인터넷...,모델,제조연도,제조사
	//기능(행위)
	//전원 on/off, 채널 up/down, 볼륨 up/down...
	
	//변수(멤버변수)
	boolean power ;   //전원버튼
	int channel;      //채널
	int volume;       //볼륨
	String color;     //색상
	String model;     //모델
	int year;         //제조연도
	String company;   //제조사
	
	//메소드
	void power() {       //전원 on/off
		power = !power;
	}
	
	void channelUp() {     //채널 up/down
		channel++;
	}
	
	void channelDown() {     //채널 up/down
		channel--;
	}
	
	void volumeUp() {   //볼륨 up/down
		volume++;
	}
	
	void volumeDown() {   //볼륨 up/down
		volume--;
	}
	
	void showInfo() {
		System.out.println(model);
		System.out.println(year);
		System.out.println(company);
	}
	
	
	
	 
	
	
	
	
	
	
	

}
