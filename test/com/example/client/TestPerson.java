package com.example.client;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONValue;

import com.google.gwt.junit.client.GWTTestCase;
import static com.google.gwt.junit.client.GWTTestCase.assertTrue;


public class TestPerson extends GWTTestCase {

	@Override
	public String getModuleName() {
		return "com.example.Main";
	}

	public void testCreate() {
		Person person = new Person("Povilas", 23);
		assertTrue(person.getName() == "Povilas");
		assertTrue(person.getAge() == 23);
	}

	public void testToJson() {
		Person person = new Person("Povilas", 23);
		JSONObject jsonPerson = person.toJson();
		assertTrue(jsonPerson != null);

		JSONValue jsonValue = jsonPerson.get("name");
		assertTrue(jsonValue != null);
		JSONString jsonName = jsonValue.isString();
		assertTrue(jsonName != null);
		assertTrue(jsonName.stringValue() == "Povilas");

		jsonValue = jsonPerson.get("age");
		assertTrue(jsonValue != null);
		JSONNumber jsonAge = jsonValue.isNumber();
		assertTrue(jsonAge != null);
		assertTrue(jsonAge.doubleValue() == 23);
	}
}
