package polymorphism;

public class SamsungTV implements TV {
/*	public void initMethod() {
		System.out.println("객체 초기화 적업 처리");
	}
	//
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리");
	}*/
	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("==> samsungtv(1) 객체 생성");
	}
	//생성자의 매개변수에 의존관계에 있는 개체의 주소 정보를 전달!
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===>SamsungTV(2) 객체 생성");
		this.speaker=speaker; 
	}
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===>SamsungTV(3) 객체 생성");
		this.speaker=speaker;
		this.price=price;
	}
	

	@Override
	public void powerOn() {
		System.out.println("삼성티비 전원 킨다(가격 : "+price+")");
		
	}

	@Override
	public void powerOff() {
		System.out.println("삼성티비 전원 끈다");
		
	}

	public void volumeUp() {
		
		speaker.volumeUp();
	}
	public void volumeDown() {
		
		speaker.volumeDown();
	}
	

	

}
