package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
	/*
	GenericXmlApplicationContext - ���� �ý����̳� Ŭ���� ��ο� �ִ� xml ���� ������ �ε��Ͽ� �����ϴ� �����̳�, pre-loading���
	XmlWebApplicationContext - �� ����� ������ ���ø����̼��� ������ �� ����ϴ� �����̳��̴�. pre-loading���
	 */
public class TVUser {
	public static void main(String[] args) {
		//1. ������ �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		//2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û�Ѵ�.
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring �����̳ʸ� �����Ѵ�.
		factory.close();
	}

}
