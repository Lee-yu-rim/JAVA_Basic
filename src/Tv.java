
public class Tv {
	//�Ӽ�
	//ũ��,������ư,ä��,����,����,���ͳ�...,��,��������,������
	//���(����)
	//���� on/off, ä�� up/down, ���� up/down...
	
	//����(�������)
	boolean power ;   //������ư
	int channel;      //ä��
	int volume;       //����
	String color;     //����
	String model;     //��
	int year;         //��������
	String company;   //������
	
	//�޼ҵ�
	void power() {       //���� on/off
		power = !power;
	}
	
	void channelUp() {     //ä�� up/down
		channel++;
	}
	
	void channelDown() {     //ä�� up/down
		channel--;
	}
	
	void volumeUp() {   //���� up/down
		volume++;
	}
	
	void volumeDown() {   //���� up/down
		volume--;
	}
	
	void showInfo() {
		System.out.println(model);
		System.out.println(year);
		System.out.println(company);
	}
	
	
	
	 
	
	
	
	
	
	
	

}
