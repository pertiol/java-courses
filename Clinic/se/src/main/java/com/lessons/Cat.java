package com.lessons;
/**
 * Class for describing cat
 */

public class Cat extends Pet {
	/**
	 * {@inheritDoc}
	 */
	Cat(String catName) {
		super(catName);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	String getType() {
		return "Cat";
	}

	public String getBreed() {
		return "";
	}
}