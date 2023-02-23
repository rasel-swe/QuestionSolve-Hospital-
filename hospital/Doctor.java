package hospital;

public class Doctor extends Person {

	private String department;
	private String degree;
	private int fees;
	
	public Doctor(String name, String department, String degree, int fees)
	{
		this.name = name;
		this.department = department;
		this.degree= degree;
		this.fees=fees;
	}
	
	public void showing()
	{
	System.out.println("Doctor Information");
	System.out.println("Name : "+name);
	System.out.println("Department : "+department);
	System.out.println("Degree : "+degree);
	System.out.println("Fees : "+fees);
	System.out.println("");
	}
	
}
