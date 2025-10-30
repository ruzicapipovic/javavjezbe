package projekat;

public class Automobil extends Vozilo {
	private int brojVrata;
	private String tipMotora;
	
	public Automobil(String proizvodjac, int godinaProizvodnje, float kubikaza, String boja, int brojVrata,
			String tipMotora) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.brojVrata = brojVrata;
		this.tipMotora = tipMotora;
	}

	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}

	public String getTipMotora() {
		return tipMotora;
	}

	public void setTipMotora(String tipMotora) {
		this.tipMotora = tipMotora;
	}
	public double izracunajCijenuRegistracije() {
		double cijena = super.izracunajCijenuRegistracije();
		if (tipMotora.equalsIgnoreCase("dizel"))
			cijena +=20;
		return cijena;	

	}

	@Override
	public String toString() {
		return "Automobil [brojVrata=" + brojVrata + ", tipMotora=" + tipMotora + "]";
	}

}
