package polymorphism;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		//��������
//		SamsungTV stv = new SamsungTV();

//		BeanFactory factory = new BeanFactory();
		
		//�پ缺�� ���� ���
		//���������� �����丮�� 
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		//������ �����̳ʷ� ���� �Ｚtv  ��ü�� ��
		
		
//		TV tv = (TV) factory.getBean("tv");
		//System.out.println(tv);
		
		TV tv = (TV) factory.getBean("ltv");
//		TV tv2 = (TV) factory.getBean("tv");
//		TV tv3 = (TV) factory.getBean("tv");
//		TV tv4 = (TV) factory.getBean("tv");

		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.poweroff();
		
		
		//������ �����̳� ����
		//Close this application context, destroying all beans in its bean factory. 
		factory.close();

	}

}
