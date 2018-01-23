
public class Mediclaim {
	

	private double rate;
	
	
	
	public double getRate() {
		return rate;
	}



	public void setRate(double rate) {
		this.rate = rate;
	}



	public double mediclaimCalc(double salary){
		return salary * this.rate*12 / 100;
		
	}
	
	
	

}
