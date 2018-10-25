package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
	/*
	GenericXmlApplicationContext - 파일 시스템이나 클래스 경로에 있는 xml 설정 파일을 로딩하여 구동하는 컨테이너, pre-loading방식
	XmlWebApplicationContext - 웹 기반의 스프링 어플리케이션을 개발할 때 사용하는 컨테이너이다. pre-loading방식
	 */
public class TVUser {
	public static void main(String[] args) {
		//1. 스프링 컨테이너를 구동한다.
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		//2. Spring 컨테이너로부터 필요한 객체를 요청한다.
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring 컨테이너를 종료한다.
		factory.close();
	}

}
