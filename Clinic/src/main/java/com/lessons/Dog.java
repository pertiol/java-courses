package com.lessons;
/**
 * Class for describing dog
 */

public class Dog extends Pet {
	private String breed;

    /**
     *
     * @param petName dog name
     * @param breed dog's breed
     */
    public Dog(String petName, String breed) {
        super(petName);
        this.breed = breed;
    }


	/**
	 * {@inheritDoc}
	 */
	@Override
	String getType() {
		return "Dog";
	}

    public String getBreed() {
        return breed;
    }
}