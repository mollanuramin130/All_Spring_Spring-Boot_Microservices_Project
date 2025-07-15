package com.nt.sbeans.question1;

public class CyclicDI_A {
	private CyclicDI_B cdiB;
	
	public CyclicDI_A(CyclicDI_B cdiB) {
		this.cdiB=cdiB;
	}
	
	public void checkValue() {
		System.out.println("Cyclic Dependency Indection Value: "+this.cdiB);
	}
}
