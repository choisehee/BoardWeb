package polymorphism;

import org.springframework.stereotype.Component;

@Component(value = "ltv")
public class LgTV implements TV{
	
	public void powerOn(){
		System.out.println("L-Tv ��");
	}
	
	public void poweroff(){
		System.out.println("L-Tv ��");
	}
	
	public void volumeUp(){
		System.out.println("L-Tv �Ҹ�  �ø�");
	}
	
	public void volumeDown(){
		System.out.println("L-Tv �Ҹ� ����");
	}

}
