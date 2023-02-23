package hospital;

public class Ward extends Room{
	
	private int seat_no;
	
	public Ward(int seat_no)
	{
		this.seat_no = seat_no;
	}
		
	public void showing()
	{
		System.out.println("Seat No : "+seat_no);
	}

}
