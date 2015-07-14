
/**
 * Class describes client
 * @author pertiol
 * @version 1.0
 */
public class Client {
	private String name;
	private Pet pet;
	
	public Client(String name, Pet pet) {
		this.name = name;
		this.pet = pet;
	}
	
	void changeName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	String getPetName() {
		return this.pet.getPetName();
	}
	
	String getType() {
		return this.pet.getType();
	}
	
	void changePetName(String petName) {
		this.pet.changePetName(petName);
	}
}