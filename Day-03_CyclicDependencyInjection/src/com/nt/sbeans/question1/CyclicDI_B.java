package com.nt.sbeans.question1;

public class CyclicDI_B {
	private CyclicDI_A cdiA;
	
	public CyclicDI_B() {
		
	}
	
	/*public CyclicDI_B(CyclicDI_A cdiA) {
		this.cdiA=cdiA;
	}*/
	
	public void checkValue() {
		System.out.println("Cyclic Dependency Indection Value: "+this.cdiA);
	}
	
	public void setCdiA(CyclicDI_A cdiA) {
		this.cdiA = cdiA;
	}
}
