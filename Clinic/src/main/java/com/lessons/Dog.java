/**
 * Class for describing dog
 */

public class Dog extends Pet {
	/**
	 * {@inheritdoc}
	 */
	Dog(String dogName) {
		super(dogName);
	}
	/**
	 * {@inheritdoc}
	 */
	@Override
	String getType() {
		return "Dog";
	}
}