package com.lessons;
import java.util.*;
/**
 * Demo Clinic class
 * @author pertiol
 * @version 1.0
 */

public class ClinicDemo {
	
	public static void main(String args[]) {
		// Create new scanner
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int size = 2000000;
		// Create new clinic with size in size
		Clinic myClinic = new Clinic();
		// user enter
		int enter = 1;
		// user ID (position in array)
		int ID = 0;
		// type of pet
		int type = 0;
        // user input
        String input = "";

        do {
            try {
				/**
				* Check user selection and proceed selected operation
				*/
				System.out.println("\nWelcome to pet clinic accounting program! Usage:");
				System.out.println(" 1 - add new client, 2 - remove existing client");
                System.out.println(" 3 - change client name, 4 - change pet name");
				System.out.println(" 5 - to find pet name by client ID, 6 - to find pet by client name");
				System.out.println(" 7 - to find client name by pet name, 8 - to get client ID by name");
                System.out.println(" 0 - to quit \n");
				enter = scan.nextInt();
				if(enter == 1) {
					System.out.println("\n Cats and dogs are examined in different outhouses.\n" +
                            " Enter 1 - if pet is cat, 2 - if pet is dog.");
					type = scan.nextInt();
					if(type == 1) {
						System.out.println("\n Enter ID, name of client, name of his cat, e.g. \"1 Mike Poppy\"");
						ID = scan.nextInt();
						myClinic.addClient(new Client(ID, scan.next(), new Cat(scan.next())));
					} else if (type == 2) {
						System.out.println("\n Enter ID, name of client, name and breed of his dog, e.g. \"1 Mike Poppy Bulldog\"");
						ID = scan.nextInt();
						myClinic.addClient(new Client(ID, scan.next(), new Dog(scan.next(), scan.next())));
					} else {
						System.out.println("\n Invalid type of pet.");
						continue;
					}
				} else if (enter == 2) {
					System.out.println("\n Enter ID of client to remove:\n");
					ID = scan.nextInt();
					myClinic.removeClient(ID);
				} else if (enter == 3) {
					System.out.println("\n Enter client ID and new name, e.g. \"1 Tom\":\n");
					ID = scan.nextInt();
					myClinic.changeClientName(ID, scan.next());
				} else if (enter == 4) {
					System.out.println("\n Enter client ID and new pet name, e.g. \"1 Jerry\":\n");
					ID = scan.nextInt();
					myClinic.changePetName(ID, scan.next());
				} else if (enter == 5) {
					System.out.println("\n Enter client ID:");
					ID = scan.nextInt();
					System.out.println(myClinic.getPetName(ID));
				} else if (enter == 6) {
					System.out.println("\n Enter client name:");
                    input = scan.next();
					System.out.println("\n " + input + " has " + myClinic.getPetNameByClientName(input));
				} else if (enter == 7) {
					System.out.println("\n Enter pet name:");
                    input = scan.next();
					System.out.println("\n" + input + " is " + myClinic.getClientNameByPetName(input) + "'s pet");
				} else if (enter == 8) {
                    System.out.println("\nEnter client name:");
                    input = scan.next();
                    System.out.println("\n " + input + "'s ID is " + myClinic.getClientIDByClientName(input));
                }else if(enter == 0)
					continue;
				else 
					System.out.println("\n Invalid operation type.");
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println(" Input error.");
                scan.next();
            } catch (UserException e) {
                System.out.println(e);
            }
        } while(enter != 0);

		scan.close();
	}
}