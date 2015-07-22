package com.lessons;
/**
 * Class describes client
 * @author pertiol
 * @version 1.0
 */
public class Client {
	private String name;
	private int ID;
	private Pet pet;
	/**
	 * Constructor for Client
	 * @param ID ID of client
	 * @param name client name
	 * @param pet object of type Pet
	 */
	public Client(int ID, String name, Pet pet) {
		this.ID = ID;
		this.name = name;
		this.pet = pet;
	}

	/**
	 * Returns ID of client
	 * @return ID of client
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Set ID for client
	 * @param ID ID of client
	 */
	public void setID(int ID) {
		this.ID = ID;
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
	public String getName() {
		return this.name;
	}
	/**
	 * Return client's pet name
	 * @return pet name
	 */
	public String getPetName() {
		return this.pet.getPetName();
	}
	/**
	 * Return client's pet type (Dog or Cat)
	 * @return pet type
	 */
	public String getType() {
		return this.pet.getType();
	}
	/**
	 * Change client's pet name
	 * @param petName new pet name
	 */
	public void changePetName(String petName) {
		this.pet.changePetName(petName);
	}

    /**
     * Get dog's breed
     * @return breed
     */
	public String getBreed() {
        return this.pet.getBreed();
    }
}