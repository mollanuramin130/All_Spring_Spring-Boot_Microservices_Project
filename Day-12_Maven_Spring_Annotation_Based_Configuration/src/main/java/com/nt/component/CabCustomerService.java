package com.nt.component;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;


public class CabCustomerService {
	Set<CabCustomer> custList=new HashSet<CabCustomer>();
	
	public void addCustomer(CabCustomer customer) {
		custList.add(customer);
	}
	
	public boolean isFirstCustomer(CabCustomer customer) {
		Stream<CabCustomer> filter = custList.stream().filter(cust->cust.getPhoneNumber().compareTo(customer.getPhoneNumber())==0);
		if(filter.count()!=0) {
			return false;
		}
		return true;
	}
	
	public double calculateBill(CabCustomer customer) {
		if(isFirstCustomer(customer)) {
			return 0.0;
		}else {
			return customer.getDistance()*6;
		}
	}
}
