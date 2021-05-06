package ro.ase.cts.state.clase;

public class MasaOcupata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaOcupata) {
			System.out.println("Masa cu numarul " + masa.getNrMasa() + " nu poate fi rezervata");
		}else {
			masa.setStare(this);
			System.out.println("Masa " + masa.getNrMasa() + " este trecuta in starea ocupata");
		}
	}

}
