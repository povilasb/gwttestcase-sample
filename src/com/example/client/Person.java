package com.example.client;


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
}
