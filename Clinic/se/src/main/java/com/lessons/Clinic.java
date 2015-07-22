package com.lessons;

import java.util.LinkedList;
import java.util.List;

/**
 * Class describes pet clinic
 * @author pertiol
 * @version 1.0
 */
 
public class Clinic {
	
	/**
	 * Clients list
	 */
	private List<Client> clients = new LinkedList<>();

	/**
	 * Add client to list
	 * @param client new client of type Client
	 */
	public void addClient(Client client){
		clients.add(client);
	}
	
	/**
	 * Remove client from list
	 * @param ID existent client ID
	 */
	public void removeClient(int ID){
		boolean removed = false;
		for (Client client : clients) {
			if (client.getID() == ID) {
				clients.remove(client);
				removed = true;
			}
			break;
		}
		if(removed)
			System.out.println("Client " + ID + " successfully removed");
		else
			System.out.println("Client " + ID + " not found");
	}
	
	/**
	 * Change client name
	 * @param ID client ID
	 * @param name new client name
	 */
	public void changeClientName(int ID, String name){
		boolean changed = false;
		for (Client client : clients) {
			if (client.getID() == ID) {
				client.changeName(name);
				changed = true;
			}
			break;
		}
		if(changed)
			System.out.println("Client " + ID + " successfully renamed");
		else
			System.out.println("Client " + ID + " not found");
	}
	
	/**
	 * Change pet name
	 * @param ID client ID
	 * @param name new pet name
	 */
	public void changePetName(int ID, String name){
		boolean changed = false;
		for (Client client : clients) {
			if (client.getID() == ID) {
				client.changePetName(name);
				changed = true;
			}
			break;
		}
		if(changed)
			System.out.println("Client's " + ID + " pet successfully renamed");
		else
			System.out.println("Client " + ID + " not found");
	}
	/**
	 * Get pet name by client ID
	 * @param ID client ID
	 */
	public String getPetName(int ID){
		for (Client client : clients) {
			if (client.getID() == ID) return client.getPetName();
		}
		return "No such client";
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
				petName += " " + client.getBreed();
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
	 * @throws UserException
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

	/**
	 * Get client ID by client name
	 * @param name client's name
	 * @return client's ID
	 * @throws UserException
	 */
	public int getClientIDByClientName(String name) throws UserException {
		int ID = 0;
		for (Client client : clients) {
			if (client.getName().equals(name)) {
				ID = client.getID();
				break;
			}
		}
		if (ID == 0)
			throw new UserException("No such client");
		return ID;
	}
}