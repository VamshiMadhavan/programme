package com.te.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Demo implements InitializingBean,DisposableBean{
	
	Demo(){
		System.out.println(" bean instantiated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("from set properties i.e..initialization");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("bean destroyed");
		
	}

}
