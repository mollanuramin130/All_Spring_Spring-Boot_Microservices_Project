package com.nit.factory.task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.components.task2.Bank;
import com.nit.components.task2.HDFC;
import com.nit.components.task2.SBI;

@Component("concreteBankFactory")
public class ConcreteBankFactory implements BankFactory {
	@Autowired
	@Qualifier("sbi")
	private SBI sbi;
	@Autowired
	@Qualifier("hdfc")
	private HDFC hdfc;

	@Override
	public Bank createBank(String bankType) {
		if(bankType.compareToIgnoreCase("sbi")==0) {
			return sbi;
		}
		else if(bankType.compareToIgnoreCase("hdfc")==0) {
			return hdfc;
		}else {
			throw new IllegalArgumentException("Select Bank Type: "+bankType+"\nNot a Valid Bank type");
		}
	}

}
