package hospital;

public class Patient extends Person {
	
	private int age;
	private String contact_no;
	private int doctor_fee;
	private int seat_fee;
	
	public Patient(String name, int age, String contact)
	{
		this.name = name;
		this.age = age;
		this.contact_no = contact;
	}
	
	public void total_cost( int doctor_fee, int seat_cost)
	{
		int total;
		this.doctor_fee = doctor_fee;
		this.seat_fee = seat_cost;
		total = this.doctor_fee+ this.seat_fee;
		System.out.println("Total Cost : "+total);
		System.out.println("");
	}
	public void showing()
	{
		System.out.println("Patient Information");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Contact No : "+contact_no);
		System.out.println("");
	}

}
