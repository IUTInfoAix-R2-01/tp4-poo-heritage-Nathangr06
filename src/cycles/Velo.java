package cycles;
import java.util.Random;



public class Velo {
	private double DEFAUT_BRAQUET=13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea = new Random();
	
	
	public double getDEFAUT_BRAQUET() {
		return this.DEFAUT_BRAQUET; 
	}
	
	public void setDEFAUT_BRAQUET(double DEFAUT_BRAQUET) {
		this.DEFAUT_BRAQUET=DEFAUT_BRAQUET;
	}
	
	public Velo(double braquet, double diamRoue) {
		this.braquet=braquet;
		this.diamRoue=diamRoue;
	}
	
	public Velo(double braquet) {
		this.braquet=braquet;
	}
	
	public Velo() {
	}
	
	
	public Random getGenAlea() {
		return this.genAlea;
	}
	
	
	public void setGenAlea(Random genAlea) {
		this.genAlea=genAlea;
	}
	
	public double getBraquet() {
		return this.braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet=braquet;
	}
	
	public  double getDiamRoue() {
		return this.diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue=diamRoue;
	}

	@Override
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + ", genAlea=" + genAlea + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale*this.braquet*this.diamRoue*this.genAlea.nextDouble();
	}
	
	
	public static void main(String[] args) {
		Velo v1 = new Velo(5,8);
		System.out.println(v1.getPuissance(10));
	}
	
}
