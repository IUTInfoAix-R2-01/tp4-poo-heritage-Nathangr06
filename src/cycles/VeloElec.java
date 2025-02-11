package cycles;

public class VeloElec extends Velo {
	private double DEFAUT_FACTEUR_PUISSANCE_MOTEUR=15.0;
	private double facteurPuissanceMoteur;
	
	
	public VeloElec() {
		super();
	}
	
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		
	}
	
	
	@Override
	public String toString () {
		return "VeloElec[facteurPuissanceMoteur="+facteurPuissanceMoteur+"]";
	}
	
	
	@Override
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale)*facteurPuissanceMoteur;
	}
	
	
	public static void main(String[] args) {
		VeloElec v1 = new VeloElec();
		System.out.println(v1);

	}
	
}
