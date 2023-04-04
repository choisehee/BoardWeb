package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//동일한 값으로 하면 안된다
//applic에서 하던걸 어너테이션으로
@Component(value = "stv")
public class SamsungTV implements TV {
	
	
//	private Sonyspeaker speaker;
//	@Autowired //컨테이너가 소티 스피커 객체를 스피커변수에 자동으로 할당,@Autowired는 변수의 타입을 기준으로 객체를 검색하여 의존성 처리하지만 ,  대신에 @Resource는 객체의 이름을 이용하여 의존성 주입처리
//	@Qualifier(value = "apple")
//	private Speaker speaker;
//	private int price;

	//한방에 처리
	@Resource(name = "sony")//컨테이너가 소티 스피커 객체를 스피커변수에 자동으로 할당,@Autowired는 변수의 타입을 기준으로 객체를 검색하여 의존성 처리하지만 ,  대신에 @Resource는 객체의 이름을 이용하여 의존성 주입처리
	private Speaker speaker;
	private int price;

//	public void initMethod() {
//		System.out.println("initMethod연습 삼성tv객체생성2");
//	}
	
	public SamsungTV() {
		System.out.println("삼성tv객체생성1");
	}
	
	
//	생성자를 이용한 의존성 처리(setter 메서드가 제공되지 않는 클래스에 대해서만 생성자 인젝션 사용)
//	public SamsungTV(AppleSpeaker speaker) {
//		System.out.println("삼성tv객체생성2");
//		this.speaker=speaker;
//	}
//	
//	public SamsungTV(AppleSpeaker speaker, int price) {
//		System.out.println("삼성tv객체생성3");
//		this.speaker=speaker;
//		this.price=price;
//	}
	
	//setter 인젝션
	
	

	public void powerOn() {
		System.out.println("S-Tv 켬"+price);
	}
	
	//-----------------------------
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		System.out.println("setPrice() 호출");
		this.price = price;
	}

	public Speaker getSpeaker() {
		return speaker;
	}


	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void poweroff() {
		System.out.println("S-Tv 끔");
	}
	

	public void volumeUp() {
//		speaker=new Sonyspeaker();
		speaker.volumeUp();
//		System.out.println("소리올림");
	}

	public void volumeDown() {
//		speaker=new Sonyspeaker();
		speaker.volumeDown();
//		System.out.println("소리내림");
	}
	
	
	

//	public void destroyMethod() {
////		speaker=new Sonyspeaker();
//		speaker.volumeDown();
//	}

}
