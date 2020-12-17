package autowriedBeans;

public class Traveller {

	Car c;
	
	public Traveller() {
		// TODO Auto-generated constructor stub
	}
	
	public Traveller(Car r){
		c=r;
	}
	
	
	
	public Car getC() {
		return c;
	}


	public void setC(Car c) {
		this.c = c;
	}


	public void startJourney(){
		c.move();
	}


	
}
