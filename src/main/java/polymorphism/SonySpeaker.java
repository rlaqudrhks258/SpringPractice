package polymorphism;

public class SonySpeaker implements Speaker {
	//积己磊.
	public SonySpeaker() {
		System.out.println("===> SonySpeaker按眉 积己");
	}
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker ---杭俘 棵府扁");
	}
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker ---杭俘 郴府扁");
	}
}
