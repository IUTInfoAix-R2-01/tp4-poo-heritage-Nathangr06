package cycles;

public class VeloElec extends Velo {
	private double DEFAUT_FACTEUR_PUISSANCE_MOTEUR=15.0;
	private double facteurPuissanceMoteur;
	
	
	public VeloElec() {
		super();
	}
	
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		this.setDiamRoue(diamRoue);
		this.facteurPuissanceMoteur=coupleMoteur;
	}
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		this.setBraquet(braquet);
		this.setDiamRoue(diamRoue);
		this.facteurPuissanceMoteur=coupleMoteur;
	}
	
	public double getDEFAUT_COUPLE_MOTEUR() {
		return this.DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		this.DEFAUT_FACTEUR_PUISSANCE_MOTEUR=DEFAUT_COUPLE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return this.facteurPuissanceMoteur;
	}
	
	
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur=facteurPuissanceMoteur;
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
		VeloElec v2 = new VeloElec(10.0,60.5,74.6);
		System.out.println(v2.getPuissance(10.0));
		
		/*
		VeloElec v1 = new VeloElec();
		System.out.println(v1);
		System.out.println(v1);
		*/
	}
	
}
