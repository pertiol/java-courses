package com.lessons;
/**
 * Class for describing pet
 */
public abstract class Pet {
	private String petName;
	/**
	 * Standard constructor
	 */
	public Pet(String petName) {
		this.petName = petName;
	}
	/**
	 * Return pet name
	 */
	String getPetName() {
		return this.petName;
	}
	/**
	 * Return pet type
	 */
	String getType() {
		return "Unknown type";
	}
	/**
	 * Change pet name
	 * @param petName new pet name
	 */
	public void changePetName(String petName) {
		this.petName = petName;
	}

    public abstract String getBreed();
}