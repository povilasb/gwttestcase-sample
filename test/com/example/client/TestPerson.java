package com.example.client;

import com.google.gwt.junit.client.GWTTestCase;


public class TestPerson extends GWTTestCase {

	@Override
	public String getModuleName() {
		return "com.example.Main";
	}

	public void testCreate() {
		Person person = new Person("Povilas", 23);
	}
}
