package com.springbook.ioc.injection;

import java.util.List;

public class CollectionBean {
	private List<String> addressList;


	public void setAddressList(List<String> addressList) {
		System.out.println("==> ���͸޼ҵ� ����");
		this.addressList = addressList;
	}
	
	public List<String> getAddressList() {
		System.out.println("==> ���͸޼ҵ� ����");
		return addressList;
	}
	
	

}
