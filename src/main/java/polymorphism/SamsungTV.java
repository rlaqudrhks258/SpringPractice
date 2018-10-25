package polymorphism;

public class SamsungTV implements TV {
	public void initMethod() {
		System.out.println("객체 초기화 적업 처리");
	}
	public SamsungTV() {
		System.out.println("==> samsungtv 객체 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("삼성티비 전원 킨다");
		
	}

	@Override
	public void powerOff() {
		System.out.println("삼성티비 전원 끈다");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("삼성티비 볼륨높인다.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("삼성티비 볼륨낮춘다.");
		
	}
	

}
