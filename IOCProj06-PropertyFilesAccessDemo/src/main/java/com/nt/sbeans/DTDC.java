package com.nt.sbeans;

import org.springframework.stereotype.Component;

//@Component("dtdc")
@Component
public class DTDC implements CurrierService{

	@Override
	public void currierService() {
		System.out.println("DTDC currierService Execute..");
	}

}
