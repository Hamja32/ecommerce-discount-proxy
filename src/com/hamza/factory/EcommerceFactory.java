package com.hamza.factory;

import com.hamza.component.FlipcartService;
import com.hamza.component.FlipcartServiceImpl;
import com.hamza.proxy.FlipcartServiceProxy;
public class EcommerceFactory {
	//getInstance method - it will give eight proxy r real object
	public static FlipcartService getInstance(String cuponCode) {
		if(cuponCode.equals("") || cuponCode.trim().length() ==0) {
			return new FlipcartServiceImpl();
		}else {
			if(cuponCode.equalsIgnoreCase("CodeKaro20")) {
				return new FlipcartServiceProxy(20);
			}else if(cuponCode.equalsIgnoreCase("CodeKaro10")) {
				return new FlipcartServiceProxy(10);
			}else {
				return new FlipcartServiceImpl();
			}
		}
	}
}

