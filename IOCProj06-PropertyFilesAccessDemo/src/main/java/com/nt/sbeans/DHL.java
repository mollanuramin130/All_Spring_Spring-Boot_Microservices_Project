package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component
public class DHL implements CurrierService {

	@Override
	public void currierService() {
		System.out.println("DHL currierService Execute..");
	}

}
