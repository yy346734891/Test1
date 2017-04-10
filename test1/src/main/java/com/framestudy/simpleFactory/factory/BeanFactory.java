package com.framestudy.simpleFactory.factory;

public class BeanFactory {
	
		
	public static Object getBean(String msg) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Object obj = null;
		if (msg != null && !msg.equals("")) {
			Class<?> cl = Class.forName(msg);
			obj = cl.newInstance();
		}
		
		
		return obj;
		
	}
}
