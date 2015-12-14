package jet;

public class Passenger extends Jet {

	private int numPassenger;
	private String airlineName;
	private int cargoLoad;

	public Passenger(int speed, int range, float price, int numPassenger)
	{
		super(speed, range, price);
		this.numPassenger = numPassenger;
	}

	public int getNumPassenger()
	{
		return numPassenger;
	}

	public void setNumPassenger(int numPassenger)
	{
		this.numPassenger = numPassenger;
	}

	public String getAirlineName()
	{
		return airlineName;
	}

	public void setAirlineName(String airlineName)
	{
		this.airlineName = airlineName;
	}

	public int getCargoLoad()
	{
		return cargoLoad;
	}

	public void setCargoLoad(int cargoLoad)
	{
		this.cargoLoad = cargoLoad;
	}

	@Override
	public void takeoff()
	{
		System.out.println("Pilot: Flight Attendents prepare for take off...");
		System.out.println("Flight Attendent: Ladies and Gentlemen, please buckle your seatbelts"
				+ "and turn off your electronics");

	}

	@Override
	public void land()
	{
		System.out.println("Pilot: Flight Attendents prepare for take off...");
		System.out.println("Flight Attendent: Ladies and Gentlemen, please buckle your seatbelts"
				+ "and turn off your electronics");

	}

	public void fuel()
	{
		System.out.println("A bunch of workers putting on luggage and fueling plane");

	}

}
