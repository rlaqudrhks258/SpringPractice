package polymorphism;

public class SamsungTV implements TV {
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ ���� ó��");
	}
	public SamsungTV() {
		System.out.println("==> samsungtv ��ü ����");
	}

	@Override
	public void powerOn() {
		System.out.println("�ＺƼ�� ���� Ų��");
		
	}

	@Override
	public void powerOff() {
		System.out.println("�ＺƼ�� ���� ����");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("�ＺƼ�� �������δ�.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("�ＺƼ�� ���������.");
		
	}
	

}
