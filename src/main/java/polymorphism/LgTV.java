package polymorphism;

public class LgTV implements TV {

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
		System.out.println("LG티비 볼륨높인다.");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG티비 볼륨낮춘다.");
		
	}
	

}
