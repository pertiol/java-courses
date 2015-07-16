package com.lessons;
/**
 * Class describes client
 * @author pertiol
 * @version 1.0
 */
public class Client {
	private String name;
	private Pet pet;
	/**
	 * Constructor for Client
	 * @param name client name
	 * @param pet object of type Pet
	 */
	public Client(String name, Pet pet) {
		this.name = name;
		this.pet = pet;
	}
	/**
	 * Change client name
	 * @param name new client name
	 */
	void changeName(String name) {
		this.name = name;
	}
	/**
	 * Return client name
	 * @return client name
	 */
	String getName() {
		return this.name;
	}
	/**
	 * Return client's pet name
	 * @return pet name
	 */
	String getPetName() {
		return this.pet.getPetName();
	}
	/**
	 * Return client's pet type (Dog or Cat)
	 * @return pet type
	 */
	String getType() {
		return this.pet.getType();
	}
	/**
	 * Change client's pet name
	 * @param petName new pet name
	 */
	void changePetName(String petName) {
		this.pet.changePetName(petName);
	}
}