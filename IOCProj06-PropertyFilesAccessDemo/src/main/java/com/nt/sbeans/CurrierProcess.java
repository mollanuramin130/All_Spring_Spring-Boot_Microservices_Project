package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("currierProcess")
public class CurrierProcess {
	@Autowired
	@Qualifier("shipper")
	private CurrierService currierService;
	@Value("${cust.name}")
	private String customerName;
	
	public void delivery() {
		System.out.println("Customer Name: "+customerName);
		currierService.currierService();
	}
}
