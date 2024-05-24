package arma;

import armadura.Armadura;

public class BastonMago extends Arma {

	@Override
	public double hacerDanio(Armadura a) {
		return a.recibirDanio(this);
	}

}
