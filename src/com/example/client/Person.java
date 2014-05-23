package com.example.client;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONNumber;


class Person {

	private String name;
	private int age;


	public Person(String name, int age) {
		if (name == null) {
			throw new NullPointerException("Name cannot be null.");
		}

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public JSONObject toJson() {
		JSONObject result = new JSONObject();

		JSONString jsonName = new JSONString(this.name);
		result.put("name", jsonName);

		JSONNumber jsonAge = new JSONNumber(this.age);
		result.put("age", jsonAge);

		return result;
	}
}
