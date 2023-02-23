package hospital;

public class main {

	public static void main(String[] args) {
		
     Patient p1 = new Patient("Mohammad Abdullah",21,"01757930344");
     Doctor d1 = new Doctor("Sheikh Hasibullah Hismat","Cardiologist","MBBS",1500);
     Room r1 = new Room(613,1307);
     
     
     p1.showing();
     d1.showing();
     r1.showing();
     p1.total_cost(2000, 2500);
     
	}

}
