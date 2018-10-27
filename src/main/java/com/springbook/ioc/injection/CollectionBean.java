package com.springbook.ioc.injection;

import java.util.List;

public class CollectionBean {
	private List<String> addressList;


	public void setAddressList(List<String> addressList) {
		System.out.println("==> 세터메소드 실행");
		this.addressList = addressList;
	}
	
	public List<String> getAddressList() {
		System.out.println("==> 게터메소드 실행");
		return addressList;
	}
	
	

}
