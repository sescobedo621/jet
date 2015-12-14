package jet;
import java.util.*;
public class Fleet {
	Jet[] fleet;
	Scanner keyboard = new Scanner(System.in);
	int choice;
	
	public int getChoice()
	{
		return choice;
	}

	public void setChoice(int choice)
	{
		this.choice = choice;
	}

	public void setUpJetFleet()
	{
		fleet = new Jet[4];
		fleet[0] = new Jet();
		fleet[1] = new Military(100000, 1000, 600000f, 3);
		fleet[2] = new Passenger(50000, 15000, 8900000f, 120);
		fleet[3] = new Cargo(50000, 5000, 700000f, 350);
	}

	public void printFleet()
	{
		for (Jet jet : fleet) {
			jet.displayJet();
			System.out.println();
		}

	}
	
	public void fastestJet(Jet[] jet){
		int fastestSpeed = 0;
		Jet fastestJet = null;
		for(int i = 0; i < fleet.length; i++){
			if(fleet[i].getSpeed()> fastestSpeed){
				fastestSpeed = fleet[i].getSpeed();
				fastestJet = fleet[i];
			}
		}
		fastestJet.displayJet();
	}
	
	public void longestRangeJet(Jet[] jet){
		int longestRange = 0;
		Jet longestRangeJet = null;
		for(int i = 0; i < fleet.length; i++){
			if(fleet[i].getRange() > longestRange){
				longestRange = fleet[i].getRange();
				longestRangeJet = fleet[i];
			}
		}
		longestRangeJet.displayJet();
	}
	public Jet[] increaseArray(){
		Jet[] newFleet = new Jet[fleet.length + 1];
		for(int i = 0; i < fleet.length; i++){
			newFleet[i] = fleet[i];
		}
		return newFleet;
		
	}
	
	public void addJet(){
		int i = fleet.length - 1;
		fleet[i] = new Jet();
		System.out.print("Enter speed of jet: ");
		fleet[i].setSpeed(keyboard.nextInt());
		System.out.print("Enter range of jet: ");
		fleet[i].setRange(keyboard.nextInt());
		System.out.print("Enter price of jet: ");
		fleet[i].setPrice(keyboard.nextFloat());
	}
	
	public void printMenuTwo(){
		System.out.println("1. Hire Pilot");
		System.out.println("2. Back to main menu");
	}
	
	public void printMenu(){
		System.out.println("1. List Fleet");
		System.out.println("2. View fastest jet");
		System.out.println("3. View jet with longest range");
		System.out.println("4. Add jet to fleet");
		System.out.println("5. Quit");
		System.out.print("Enter option: ");
	}
	public void hirePilot(){
		printMenuTwo();
		choice = keyboard.nextInt();
		while(choice != 2){
			if (choice == 1){
				System.out.println("Enter jet id number: ");
				int jetNum = keyboard.nextInt();
				for(int i = 0; i < fleet.length; i++){
					if(jetNum != fleet[i].getJetNum())
						continue;
					else{
						System.out.println("Enter name: ");
						String name = keyboard.next();
						System.out.println("Enter years flying: ");
						int yearsFlying = keyboard.nextInt();
						System.out.println("Were you in the airforce? (Y/N) ");
						char airForce = keyboard.next().toUpperCase().charAt(0);
						boolean inAirforce;
						if(airForce == 'Y')
							inAirforce = true;
						else
							inAirforce = false;
						fleet[i].hirePilot(name, yearsFlying, inAirforce);
						printMenuTwo();
						choice = keyboard.nextInt();
					}
				}
			}
		}
	}
	public void menuChoices(){
		while(choice != 5){
			printMenu();
			choice = keyboard.nextInt();
			switch (choice){
			case 1:
				printFleet();
				hirePilot();
				break;
			case 2:
				fastestJet(fleet);
				break;
			case 3:
				longestRangeJet(fleet);
				break;
			case 4:
				fleet = increaseArray();
				addJet();
				break;
			case 5:
				break;
			default:
				System.out.println("WRONG ACTION! TRY AGAIN");
				break;
			}
		}
		keyboard.close();
	}
	
}
