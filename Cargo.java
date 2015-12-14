package jet;

public class Cargo extends Jet {
	
	private int cargoLoad;
	
	public Cargo(int speed, int range, float price, int cargoLoad)
	{
		super(speed, range, price);
		this.cargoLoad = cargoLoad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeoff()
	{
		System.out.println("All cargo loaded time to take off");
		
		// TODO Auto-generated method stub

	}

	@Override
	public void land()
	{
		
		System.out.println("Landing");
		// TODO Auto-generated method stub

	}

	public void fuel()
	{
		System.out.println("fueling up");
		// TODO Auto-generated method stub

	}

	public int getCargoLoad()
	{
		return cargoLoad;
	}

	public void setCargoLoad(int cargoLoad)
	{
		this.cargoLoad = cargoLoad;
	}
	
	public void dropOffCargo(){
		System.out.println("Operation Elephant Drop");
	}

}
