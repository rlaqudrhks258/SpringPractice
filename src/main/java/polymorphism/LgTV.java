package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
@Autowired
private Speaker speaker;
	@Override
	public void powerOn() {
		System.out.println("LG티비 티비 킨다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LG티비 티비를 끈다..");
		
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
	speaker.volumeDown();
		
	}
	

}
