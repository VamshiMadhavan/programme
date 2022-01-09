package com.te.singleton;

public class WhatsApp {
	private static WhatsApp whatsApp;
	/*if whatsapp vriable  is not static then we can 
	reasign it as null and can have many obj*/
	
	private WhatsApp() {
		
	}
	
	static WhatsApp helperMethod() {
		if(whatsApp==null) {
			whatsApp = new WhatsApp();
			return whatsApp;
		}
		return whatsApp;
	}

}
