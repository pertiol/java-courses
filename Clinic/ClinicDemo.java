import java.util.*;
/**
 * Demo Clinic class
 * @author pertiol
 * @version 1.0
 */

public class ClinicDemo {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Clinic myClinic = new Clinic(10);
		/**
		 * Fill client list
		 */
		myClinic.fillList();
		int enter = 1;
		int ID = 0;
		int type = 0;
		try {
			do {
				/**
				* Check user selection and proceed selected operation
				*/
				System.out.println("\nEnter '1' to add new client, or '2' to remove existent, or '0' to quit.");
				System.out.println("To change client name enter '3', to change pet name enter '4'.");
				System.out.println("To find pet name by client ID enter '5', or to find by name '6'.");
				System.out.println("To find client name by pet name enter '7'\n");
				enter = scan.nextInt();
				if(enter == 1) {
					System.out.println("Enter '1' to add cat, or '2' to add dog\n");
					type = scan.nextInt();
					if(type == 1) {
						System.out.println("\nEnter ID, name of client, name of his pet, e.g. \"1 Mike Poppy\"");
						ID = scan.nextInt();
						if (ID < 1 || ID > 10) {
							System.out.println("\nInvalid ID.");
							continue;
						} else
							myClinic.addClient(ID, new Client(scan.next(), new Cat(scan.next())));
					} else if (type == 2) {
						System.out.println("\nEnter ID, name of client, name of his pet, e.g. \"1 Mike Poppy\"");
						ID = scan.nextInt();
						if (ID < 1 || ID > 10) {
							System.out.println("\nInvalid ID.");
							continue;
						} else
							myClinic.addClient(ID, new Client(scan.next(), new Dog(scan.next())));
					} else {
						System.out.println("\nInvalid type of pet.");
						continue;
					}
				} else if (enter == 2) {
					System.out.println("\nEnter ID of client to remove:\n");
					ID = scan.nextInt();
					if (ID < 1 || ID > 10) {
						System.out.println("Invalid ID.");
						continue;
					} else
						myClinic.removeClient(ID);
				} else if (enter == 3) {
					System.out.println("\nEnter client ID and new name, e.g. \"1 Tom\":\n");
					ID = scan.nextInt();
					if (ID < 1 || ID > 10) {
						System.out.println("\nInvalid ID.");
						continue;
					} else
						myClinic.changeClientName(ID, scan.next());
				} else if (enter == 4) {
					System.out.println("\nEnter client ID and new pet name, e.g. \"1 Jerry\":\n");
					ID = scan.nextInt();
					if (ID < 1 || ID > 10) {
						System.out.println("\nInvalid ID.");
						continue;
					} else
						myClinic.changePetName(ID, scan.next());
				} else if (enter == 5) {
					System.out.println("\nEnter client ID:\n");
					ID = scan.nextInt();
					if (ID < 1 || ID > 10) {
						System.out.println("\nInvalid ID.");
						continue;
					} else
						System.out.println(myClinic.getPetName(ID));
				} else if (enter == 6) {
					System.out.println("\nEnter client name:\n");
					System.out.println("\n" + myClinic.getPetNamebyClientName(scan.next()));
				} else if (enter == 7) {
					System.out.println("\nEnter pet name:\n");
					System.out.println("\n" + myClinic.getClientNamebyPetName(scan.next()));
				} else if(enter == 0)
					continue;
				else 
					System.out.println("\nInvalid operation type.");
			} while(enter != 0);
		} catch (NumberFormatException | InputMismatchException e) {
			System.out.println("Error occurred.");
		}
		scan.close();
	}
}