package Practice;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		Encapsulation e1 = new Encapsulation("Aditya", 21, 98);
		
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getPerc());
		
		e1.setName("Ankush");
		e1.setAge(22);
		e1.setPerc(97);
		
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getPerc());
	}

}
