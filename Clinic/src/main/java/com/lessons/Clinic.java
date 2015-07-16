package com.lessons;

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
        this.fillList();
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
	public String getPetNameByClientName(String name) throws UserException {
		String petName = "";
		for (Client client : clients) {
			if (client.getName().equals(name)) {
				petName = client.getPetName();
				petName += " " + client.getType();
				break;
			}
		}
		if (petName.equals(""))
			throw new UserException("No such pet");
		return petName;
	}
	
	/**
	 * Get client name by pet name
	 * @param name pet name
	 */
	public String getClientNameByPetName(String name) throws UserException {
		String clientName = "";
		for (Client client : clients) {
			if (client.getPetName().equals(name)) {
				clientName = client.getName();
				break;
			}
		}
		if (clientName.equals(""))
			throw new UserException("No such client");
		return clientName;
	}

	public int getClientIDByClientName(String name) throws UserException {
		int ID = 0;
		for (int i = 0; i < clients.length; i++) {
			Client client = clients[i];
			if (client.getName().equals(name)) {
				ID = i + 1;
				break;
			}
		}
		if (ID == 0)
			throw new UserException("No such client");
		return ID;
	}
}