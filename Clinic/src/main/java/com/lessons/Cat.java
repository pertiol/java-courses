package com.lessons;
/**
 * Class for describing cat
 */

public class Cat extends Pet {
	/**
	 * {@inheritdoc}
	 */
	Cat(String catName) {
		super(catName);
	}
	/**
	 * {@inheritdoc}
	 */
	@Override
	String getType() {
		return "Cat";
	}
}