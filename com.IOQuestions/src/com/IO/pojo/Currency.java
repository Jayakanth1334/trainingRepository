package com.IO.pojo;

import java.io.Serializable;

public abstract class Currency implements Serializable {
	
	
	double amount;
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	String currencyType;
	
	public double getAmount() {
		return amount;
	}
	
	public Currency(double amount){
		this.amount=amount;
	}
	
	

}
