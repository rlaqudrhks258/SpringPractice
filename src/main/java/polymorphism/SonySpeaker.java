package polymorphism;

public class SonySpeaker implements Speaker {
	//������.
	public SonySpeaker() {
		System.out.println("===> SonySpeaker��ü ����");
	}
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker ---���� �ø���");
	}
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker ---���� ������");
	}
}
