package Practice;

public class Encapsulation 
{
	private String name;
	private int age;
	private int perc;
	
	Encapsulation(String name, int age, int perc)
	{
		this.name = name;
		this.age = age;
		this.perc = perc;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getPerc() 
	{
		return perc;
	}
	
	public void setPerc(int perc)
	{
		this.perc = perc;
	}
}

