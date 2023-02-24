// Made by Damian Sclafani
package CSCE145AND146;

public class Concert {
    
    private String name;
	private int capacity;
	private int soldByPhone;
	private int soldByVenue;
	private double priceByPhone;
	private double priceByVenue;
	
	//default constructor
	public Concert()
	{
		this.name = "unknown";
		this.capacity = 0;
		this.soldByPhone = 0;
		this.soldByVenue = 0;
		this.priceByPhone = 0.0;
		this.priceByVenue = 0.0;
	}
	
	public Concert(String xName, int xCapacity, double xPriceByPhone, double xPriceByVenue)
	{
		this.setBandName(xName);
		this.setCapacity(xCapacity);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceByVenue);
	}
	
	public Concert(String xName, int xCapacity, int xSoldByPhone, int xSoldByVenue, double xPriceByPhone, double xPriceByVenue)
	{
		this.setBandName(xName);
		this.setCapacity(xCapacity);
		this.setSoldByPhone(xSoldByPhone);
		this.setSoldAtVenue(xSoldByVenue);
		this.setPriceByPhone(xPriceByPhone);
		this.setPriceAtVenue(xPriceByVenue);
	}
	
	public String getBandName()
	{
		return this.name;
	}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	
	public int getNumTicketsSoldByPhone()
	{
		return this.soldByPhone;
	}
	
	public int getNumTicketsSoldAtVenue()
	{
		return this.soldByVenue;
	}
	
	public double getPriceByPhone()
	{
		return this.priceByPhone;
	}
	
	public double getPriceByVenue()
	{
		return this.priceByVenue;
	}
	
	public void setBandName(String xName)
	{
		this.name = xName;
	}
	
	public void setCapacity(int xCapacity)
	{
		if(xCapacity >= 0)
		{
			this.capacity = xCapacity;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public void setPriceByPhone(double xPriceByPhone)
	{
		if(xPriceByPhone >= 0.0)
		{
			this.priceByPhone = xPriceByPhone;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public void setPriceAtVenue(double xPriceByVenue)
	{
		if(xPriceByVenue >= 0.0)
		{
			this.priceByVenue = xPriceByVenue;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public void setSoldByPhone(int xSoldByPhone)
	{
		if(xSoldByPhone >= 0)
		{
			this.soldByPhone = xSoldByPhone;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public void setSoldAtVenue(int xSoldByVenue)
	{
		if(xSoldByVenue >= 0)
		{
			this.soldByVenue = xSoldByVenue;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public int totalNumberOfTicketsSold()
	{
		return this.soldByPhone + this.soldByVenue;
	}
	
	public int ticketsRemaining()
	{
		return this.capacity - (this.soldByPhone + this.soldByVenue);
	}
	
	public void buyTicketsAtVenue(int xSoldByVenue)
	{
		this.soldByVenue += xSoldByVenue;
	}
	
	public void buyTicketsByPhone(int xSoldByPhone)
	{
		this.soldByPhone += xSoldByPhone;
	}
	
	public double totalSales()
	{
		return (this.priceByVenue * this.soldByVenue) + (this.priceByPhone * this.soldByPhone);
	}
}
