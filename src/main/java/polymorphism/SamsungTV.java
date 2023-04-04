package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//������ ������ �ϸ� �ȵȴ�
//applic���� �ϴ��� ������̼�����
@Component(value = "stv")
public class SamsungTV implements TV {
	
	
//	private Sonyspeaker speaker;
//	@Autowired //�����̳ʰ� ��Ƽ ����Ŀ ��ü�� ����Ŀ������ �ڵ����� �Ҵ�,@Autowired�� ������ Ÿ���� �������� ��ü�� �˻��Ͽ� ������ ó�������� ,  ��ſ� @Resource�� ��ü�� �̸��� �̿��Ͽ� ������ ����ó��
//	@Qualifier(value = "apple")
//	private Speaker speaker;
//	private int price;

	//�ѹ濡 ó��
	@Resource(name = "sony")//�����̳ʰ� ��Ƽ ����Ŀ ��ü�� ����Ŀ������ �ڵ����� �Ҵ�,@Autowired�� ������ Ÿ���� �������� ��ü�� �˻��Ͽ� ������ ó�������� ,  ��ſ� @Resource�� ��ü�� �̸��� �̿��Ͽ� ������ ����ó��
	private Speaker speaker;
	private int price;

//	public void initMethod() {
//		System.out.println("initMethod���� �Ｚtv��ü����2");
//	}
	
	public SamsungTV() {
		System.out.println("�Ｚtv��ü����1");
	}
	
	
//	�����ڸ� �̿��� ������ ó��(setter �޼��尡 �������� �ʴ� Ŭ������ ���ؼ��� ������ ������ ���)
//	public SamsungTV(AppleSpeaker speaker) {
//		System.out.println("�Ｚtv��ü����2");
//		this.speaker=speaker;
//	}
//	
//	public SamsungTV(AppleSpeaker speaker, int price) {
//		System.out.println("�Ｚtv��ü����3");
//		this.speaker=speaker;
//		this.price=price;
//	}
	
	//setter ������
	
	

	public void powerOn() {
		System.out.println("S-Tv ��"+price);
	}
	
	//-----------------------------
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		System.out.println("setPrice() ȣ��");
		this.price = price;
	}

	public Speaker getSpeaker() {
		return speaker;
	}


	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() ȣ��");
		this.speaker = speaker;
	}

	public void poweroff() {
		System.out.println("S-Tv ��");
	}
	

	public void volumeUp() {
//		speaker=new Sonyspeaker();
		speaker.volumeUp();
//		System.out.println("�Ҹ��ø�");
	}

	public void volumeDown() {
//		speaker=new Sonyspeaker();
		speaker.volumeDown();
//		System.out.println("�Ҹ�����");
	}
	
	
	

//	public void destroyMethod() {
////		speaker=new Sonyspeaker();
//		speaker.volumeDown();
//	}

}
