package com.hamza.proxy;

import com.hamza.component.FlipcartService;
import com.hamza.component.FlipcartServiceImpl;

public class FlipcartServiceProxy implements FlipcartService{

	private FlipcartService flipcartService;
	float discount = 0;

	public FlipcartServiceProxy(float discount) {
		flipcartService = new FlipcartServiceImpl();
		this.discount = discount;
	}
	@Override
	public float buyNow(String[] items, float[] prices) {
		float billAmt = 0;
		float finalBillAfterDiscount = 0;
		for(float p : prices) {
			billAmt += p;
			
		}
		finalBillAfterDiscount = (billAmt - (billAmt * discount/ 100));
		return finalBillAfterDiscount;
	}
		
}
