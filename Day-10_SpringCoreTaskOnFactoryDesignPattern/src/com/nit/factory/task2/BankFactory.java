package com.nit.factory.task2;

import com.nit.components.task2.Bank;

public interface BankFactory {
	Bank createBank(String bankType);
}
