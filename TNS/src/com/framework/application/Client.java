package com.framework.application;

import com.framework.application.GSNormal;
import com.framework.application.GSPrime;
import com.framework.application.GSShopFactory;

public class Client {

	public static void main(String[] args) {
		GSShopFactory obj=new GSShopFactory();
		
		// prime account creation
		
		GSPrime ga=(GSPrime)obj.getNewPrimeAccount(12, "suma", 500.6f, true);
		ga.bookproduct(ga.getCharges());
		
		//normal account creation
		
		GSNormal ge=(GSNormal)obj.getNewNormalAccount(13, "raju", 500.6f, 65.4f);
		ge.bookproduct(ge.getCharges());
	}
}

