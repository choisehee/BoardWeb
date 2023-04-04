import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

		//심플패턴
//		SamsungTV stv = new SamsungTV();

//		BeanFactory factory = new BeanFactory();
		
		//다양성을 위한 사용
		//스프링에서 빈팩토리와 
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		//구동된 컨테이너로 부터 삼성tv  객체를 얻어냄
		
		
//		TV tv = (TV) factory.getBean("tv");
		//System.out.println(tv);
		
		TV tv1 = (TV) factory.getBean("tv");
		TV tv2 = (TV) factory.getBean("tv");
		TV tv3 = (TV) factory.getBean("tv");
		TV tv4 = (TV) factory.getBean("tv");

//		tv.powerOn();
//		tv.poweroff();
//		tv.volumeUp();
//		tv.volumeDown();
		
		
		//스프링 컨테이너 종료
		//Close this application context, destroying all beans in its bean factory. 
		factory.close();

	}

}
