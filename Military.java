package jet;

public class Military extends Jet {

	private int numWeapons;
	
	public Military(int speed, int range, float price, int numWeapons){
		super(speed, range, price);
		this.numWeapons = numWeapons;
	}

	public int getNumWeapons()
	{
		return numWeapons;
	}

	public void setNumWeapons(int numWeapons)
	{
		this.numWeapons = numWeapons;
	}
	

	
	public void launchMissle(){
		System.out.println("Armed...Fire...Hit");
		numWeapons--;
	}


	public void fuel()
	{
		System.out.println("Fueling fighter jet");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeoff()
	{
		System.out.println("Prepare to take off in 3..2..1...");// TODO Auto-generated method stub
		
	}

	@Override
	public void land()
	{
		System.out.println("You are clear for landing");
		
	}
	
	
}
