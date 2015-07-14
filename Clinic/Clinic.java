import java.util.*;

/**
 * Class describes pet clinic
 * @author pertiol
 * @version 1.0
 */
 
public class Clinic {
	
	/**
	 * Clients list
	 */
	private Client[] clients;
	
	public Clinic(int size){
		this.clients = new Client[size];
	}
	
	/**
	 * Fill clients list for prevent NullPointerException
	 */
	public void fillList(){
		for (int i=0; i < clients.length; i++) {
			clients[i] = new Client("No such client", new Pet("No such client"));
		} 
	}

	/**
	 * Add client to list
	 * @param ID new client ID
	 * @param client new client of type Client
	 */
	public void addClient(int ID, Client client){
		clients[ID-1] = client;
	}
	
	/**
	 * Remove client from list
	 * @param ID existent client ID
	 */
	public void removeClient(int ID){
		clients[ID-1] = new Client("No such client", new Pet("No such client"));
	}
	
	/**
	 * Change client name
	 * @param ID client ID
	 * @param name new client name
	 */
	public void changeClientName(int ID, String name){
		clients[ID-1].changeName(name);
	}
	
	/**
	 * Change client name
	 * @param ID client ID
	 * @param name new client name
	 */
	public void changePetName(int ID, String name){
		clients[ID-1].changePetName(name);
	}
	/**
	 * Get pet name by client ID
	 * @param ID client ID
	 */
	public String getPetName(int ID){
		return clients[ID-1].getPetName();
	}
	
	/**
	 * Get pet name by client name
	 * @param name client name
	 */
	public String getPetNamebyClientName(String name){
		String petName = "";
		for(int i=0; i < clients.length; i++) {
			if (clients[i].getName().equals(name)) {
				petName = clients[i].getPetName();
				petName += " " + clients[i].getType();
				break;
			}
		}
		return petName;
	}
	
	/**
	 * Get client name by pet name
	 * @param name pet name
	 */
	public String getClientNamebyPetName(String name){
		String clientName = "";
		for(int i=0; i < clients.length; i++) {
			if (clients[i].getPetName().equals(name)) {
				clientName = clients[i].getName();
				break;
			}
		}
		return clientName;
	}
}