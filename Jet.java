package jet;

public  class Jet implements Flyable {
	private String engine;
	private int speed;
	private float price;
	private int range;
	private Pilot pilot;
	private Turn turnEngine;
	private int jetNum;
	private static int STARTNUM = 0;

	
	public Jet(){
		this(1000, 450, 20000.50f);
	}
	
	public Jet(int speed, int range, float price){
		this.speed = speed;
		this.range = range;
		this.price = price;
		setJetNum();
	}
	
	public int getJetNum(){
		return jetNum;
	}
	
	public void setJetNum(){
		jetNum = ++Jet.STARTNUM;
	}
	
	public String getEngine()
	{
		return engine;
	}
	public void setEngine(String engine)
	{
		this.engine = engine;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public int getRange()
	{
		return range;
	}
	public void setRange(int range)
	{
		this.range = range;
	}
	public Pilot getPilot()
	{
		return pilot;
	}
	public void setPilot(Pilot pilot)
	{
		this.pilot = pilot;
	}
	
	@Override
	public void start()
	{
		turnEngine = turnEngine.ON;
		
	}

	@Override
	public void stop()
	{
		turnEngine = turnEngine.OFF;
		
	}
	
	public Turn getTurnEngine()
	{
		return turnEngine;
	}

	public void setTurnEngine(Turn turnEngine)
	{
		this.turnEngine = turnEngine;
	}

	@Override
	public void takeoff()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land()
	{
		// TODO Auto-generated method stub
		
	}
	
	public void displayJet(){
		System.out.println(jetNum+". " +this.getClass().getSimpleName());
		System.out.println("Speed: " + this.getSpeed());
		System.out.println("Range: "+ this.getRange());
		System.out.println("Price: " + this.getPrice());
		if(pilot != null)
			System.out.println("Pilot: " + pilot.getName());
		
	}
	public void hirePilot(String name, int years, boolean airForce){
		pilot = new Pilot(name, years, airForce);
	}
}
