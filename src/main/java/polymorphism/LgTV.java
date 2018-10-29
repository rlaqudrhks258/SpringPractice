package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
@Autowired
private Speaker speaker;
	@Override
	public void powerOn() {
		System.out.println("LGƼ�� Ƽ�� Ų��.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LGƼ�� Ƽ�� ����..");
		
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
