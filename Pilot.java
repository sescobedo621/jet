package jet;

public class Pilot {
	private boolean inAirforce;
	private String name;
	private int yearsFlying;
	private boolean pilotsLicense;
	
	public Pilot(String name, int yearsFlying, boolean airForce){
		this.name = name;
		this.yearsFlying = yearsFlying;
		inAirforce = airForce;
	}
	public Pilot(){
		this("John Doe", 4, true);
	}
	public boolean isInAirforce()
	{
		return inAirforce;
	}
	public void setInAirforce(boolean inAirforce)
	{
		if (inAirforce == false){
			System.err.println("Sorry we only accept pilots who were in the Air Force.");
		}
		this.inAirforce = inAirforce;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getYearsFlying()
	{
		return yearsFlying;
	}
	public void setYearsFlying(int yearsFlying)
	{
		if(yearsFlying < 3){
			System.err.println("Sorry you must have at least three years experience.");
		}
		this.yearsFlying = yearsFlying;
	}
	public boolean isPilotsLicense()
	{
		return pilotsLicense;
	}
	public void setPilotsLicense(boolean pilotsLicense)
	{
		this.pilotsLicense = pilotsLicense;
	}
	
	
}
