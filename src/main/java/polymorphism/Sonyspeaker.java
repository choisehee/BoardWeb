package polymorphism;

import org.springframework.stereotype.Component;
//applic���� �ϴ��� ������̼�����
@Component(value = "sony")
public class Sonyspeaker implements Speaker{
	
	public Sonyspeaker() {
		System.out.println("�Ҵ� ����Ŀ �������");
	}
	
	public void volumeUp(){
		System.out.println("�Ҵ� ����Ŀ �Ҹ�  �ø�");
	}
	
	public void volumeDown(){
		System.out.println("�Ҵ� ����Ŀ �Ҹ� ����");
	}

}
