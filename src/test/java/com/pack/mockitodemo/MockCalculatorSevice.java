package com.pack.mockitodemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MockCalculatorSevice {

	Calculator c1=null;
	ClaculatorService cs= Mockito.mock(ClaculatorService.class);
	
	@Test
	public void testOperation() {
		assertEquals(30,c1.performCalculation(cs));
	}
	
	@Before
	public void createObject()
	{
		System.out.println("Object created..");
		c1=new Calculator();
		/*
		 * Anonymous class
		cs= new ClaculatorService() {
			
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
			*/
		}
	
	@After
	public void removeObject()
	{
		System.out.println("Object dereferenced");
		c1=null;
		
	}
	}

