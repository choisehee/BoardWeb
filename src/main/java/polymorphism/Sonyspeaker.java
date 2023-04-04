package polymorphism;

import org.springframework.stereotype.Component;
//applic에서 하던걸 어너테이션으로
@Component(value = "sony")
public class Sonyspeaker implements Speaker{
	
	public Sonyspeaker() {
		System.out.println("소니 스피커 만들어짐");
	}
	
	public void volumeUp(){
		System.out.println("소니 스피커 소리  올림");
	}
	
	public void volumeDown(){
		System.out.println("소니 스피커 소리 내림");
	}

}
