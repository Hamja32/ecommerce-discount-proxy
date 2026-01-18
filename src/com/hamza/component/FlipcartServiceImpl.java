package com.hamza.component;

public class FlipcartServiceImpl implements FlipcartService{
	@Override
	public float buyNow(String[] items, float[] prices) {
		float bill = 0;
		//calculate bill
		for(float p : prices) {
			bill += p;
		}
		return bill;
	}
	
}
