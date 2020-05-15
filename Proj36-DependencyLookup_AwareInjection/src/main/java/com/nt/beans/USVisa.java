package com.nt.beans;

import java.time.LocalDate;

public class USVisa {
public USVisa() {
	System.out.println("USVisa.USVisa()");
}
public boolean isApprovled() {
	LocalDate ld=LocalDate.now();
	int month=ld.getMonthValue();
	if(month>=1 && month<=5) {
		return true;
	}
	else 
		return false;
}
}
