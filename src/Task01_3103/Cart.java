package Task01_3103;

public class Cart implements Home
{
	public void Stationery()
	{
		System.out.println("1.Books");
		System.out.println("2.pens");
		System.out.println("3.Register");
		
	
	}

	@Override
	public void Groceries() {
		System.out.println("1.wheat");
		System.out.println("2.Rice");
		System.out.println("3.dal");
		
	}

	@Override
	public void Medicine() {
		System.out.println("1.Nicip");
		System.out.println("Crocin");
		System.out.println("Dolo 650");
		
	}

	
	public static void main(String[] args) 
	{
		Cart ob = new Cart();
		ob.Medicine();
		ob.Groceries();
		ob.Stationery();
	}
}
