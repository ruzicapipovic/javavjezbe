package projekat;

public class Kamion {
	private double kapacitetTereta;
	private boolean prikolicaDaNe;
	
	public Kamion(double kapacitetTereta, boolean prikolicaDaNe) {
		super();
		this.kapacitetTereta = kapacitetTereta;
		this.prikolicaDaNe = prikolicaDaNe;
	}

	public double getKapacitetTereta() {
		return kapacitetTereta;
	}

	public void setKapacitetTereta(double kapacitetTereta) {
		this.kapacitetTereta = kapacitetTereta;
	}

	public boolean isPrikolicaDaNe() {
		return prikolicaDaNe;
	}

	public void setPrikolicaDaNe(boolean prikolica) {
		this.prikolicaDaNe = prikolicaDaNe;
	}
	
	public double izracunajCijenuRegistracije() {
		double cijena = super.izracunajCijenuRegistracije();
		if(prikolicaDaNe)
			cijena += 50;
		return cijena;

	}

	@Override
	public String toString() {
		return "Kamion [kapacitetTereta=" + kapacitetTereta + ", prikolicaDaNe=" + prikolicaDaNe + "]";
	}

}
