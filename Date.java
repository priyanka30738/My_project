package basics;

public class Date {
	
	private int day,month,year; //data members
	
	public void initDate() //member function
	{
		//to init date 
		day=10;
		month=10;
		year=2010;
	}
	public void printDate()
	{
		System.out.println("Date = "+day+"/"+month+"/"+year);
	}
	
	public static void main(String[] args) {
		
		/*
		 * syntax
		 *  className ref_variable = new classname();
		 */
		
		Date d1=new Date();//creating object of Date
		d1.initDate();//init
		d1.printDate();//print
	}
}
