package com.crm.generic_utility;

import java.util.Random;

public class Java_utility {
	/**
	 * in this we are adding any random number in our data and to avoid duplicate value 
	 * @return
	 */
	public int javaran() {
		Random ran= new Random();
		int rannum = ran.nextInt(1000);
		return rannum;

	}

}
