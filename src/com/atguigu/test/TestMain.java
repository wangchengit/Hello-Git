package com.atguigu.test;

import com.atguigu.service.PhoneCheck;
import com.atguigu.service.PhoneCheckImplService;

public class TestMain {

	public static void main(String[] args) {
		PhoneCheck phoneCheck = new PhoneCheckImplService().getPhoneCheckImplPort();
		
		System.out.println("--------------------------");
		while (true) {
			String checkTypeByPhoneNum = phoneCheck.checkTypeByPhoneNum("15938778");
//			System.out.println(checkTypeByPhoneNum);
		}
		
	}
}
