package com.fraestudy.simpleFactory.test.factory;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.framestudy.simpleFactory.factory.BeanFactory;

import junit.framework.Assert;

public class test {
	private BeanFactory factory;
	
	@Before
	public void before(){
		System.out.println("0");
	}
	  
	
	@Test
	public void testGetBean(){
		Assert.assertEquals(1, 3-2);
		System.out.println("45");
	}
	
	@After
	public void after(){
		System.out.println("-1");
	}
	
	@Ignore
	public void testGetBean2(){
		System.out.println("2");
	}
	
	
}
