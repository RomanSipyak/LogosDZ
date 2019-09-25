package core.zoo;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		while (true) {
			System.out.println("Enter 1 to add member of club");
			System.out.println("Enter 2 to add animal for club members");
			System.out.println("Enter 3 to delete animal for club members");
			System.out.println("Enter 4 to delete member of club");
			System.out.println("Enter 5 to delete certain animal from all club members");
			System.out.println("Enter 6 to show zooclub");
			System.out.println("Enter 0 to exit the program");
			switch (controller.in.next()) {
			case "1":
				controller.addMember();
				break;
			case "2":
				controller.addAnimalForMember();
				break;
			case "3":
				controller.deletePetFromMember();
				break;
			case "4":
				controller.deleteMember();
				break;
			case "5":
				controller.deletePetFromAllMembers();
				break;
			case "6":
				controller.showZooClub();
				break;
			case "7":
				controller.writeTXT("ty");
				break;
			case "8":
				controller.restorfromTXT("ty");
				break;
			case "9":
				controller.reWriteTXT("ty");
				break;
				
			default:
				System.out.println("Bye");
				controller.in.close();
				
				return;
			}
		}
	}

}
