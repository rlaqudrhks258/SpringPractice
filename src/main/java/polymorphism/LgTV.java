package polymorphism;

public class LgTV implements TV {

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
		System.out.println("LGƼ�� �������δ�.");
	}

	@Override
	public void volumeDown() {
		System.out.println("LGƼ�� ���������.");
		
	}
	

}
