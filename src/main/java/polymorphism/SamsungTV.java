package polymorphism;

public class SamsungTV implements TV {
/*	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ ���� ó��");
	}
	//
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��");
	}*/
	private SonySpeaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("==> samsungtv(1) ��ü ����");
	}
	//�������� �Ű������� �������迡 �ִ� ��ü�� �ּ� ������ ����!
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===>SamsungTV(2) ��ü ����");
		this.speaker=speaker; 
	}
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("===>SamsungTV(3) ��ü ����");
		this.speaker=speaker;
		this.price=price;
	}
	

	@Override
	public void powerOn() {
		System.out.println("�ＺƼ�� ���� Ų��(���� : "+price+")");
		
	}

	@Override
	public void powerOff() {
		System.out.println("�ＺƼ�� ���� ����");
		
	}

	public void volumeUp() {
		
		speaker.volumeUp();
	}
	public void volumeDown() {
		
		speaker.volumeDown();
	}
	

	

}
