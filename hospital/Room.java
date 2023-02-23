package hospital;

public class Room {

	private int room_no;
	private int cost;
	
	public Room()
	{
		
	}
	
	public Room(int room_no, int cost)
	{
		this.room_no = room_no;
		this.cost = cost;
	}
	
	public void showing()
    {
        System.out.println("Room No : "+room_no);
        System.out.println("Room Cost : "+cost);
    }
}
