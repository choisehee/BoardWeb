
public class SamsungTV implements TV{
	
	public void initMethod(){
		System.out.println("initMethod���� �Ｚtv��ü����2");
	}
	
	
	/*
	 * public SamsungTV() { System.out.println("�Ｚtv��ü����"); }
	 */
	
	public void powerOn(){
		System.out.println("L-Tv ��");
	}
	
	public void poweroff(){
		System.out.println("S-Tv ��");
	}
	
	public void volumeUp(){
		System.out.println("S-Tv �Ҹ�  �ø�");
	}
	
	public void volumeDown(){
		System.out.println("S-Tv �Ҹ� ����");
	}
	
	public void destroyMethod(){
		System.out.println("��ü �������� ó���� ���� ó��...");
	}

}
