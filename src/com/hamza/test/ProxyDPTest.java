package com.hamza.test;

import com.hamza.component.FlipcartService;
import com.hamza.factory.EcommerceFactory;

public class ProxyDPTest {
	public static void main(String[] args) {
		
		FlipcartService service = null;
	
		//buy product
		String c_code = "blank";
		service = EcommerceFactory.getInstance(c_code);
		
		System.out.println("Real or Porxy class : " + service.getClass());
		
		float bill = service.buyNow(new String[] {"Tshirts","Shoes"}, new float[] {420.0f,1200.0f});
		System.out.println("Total bill of your itesm : " + bill);
	}
}
