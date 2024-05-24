package arma;

import armadura.Armadura;

public class Arco extends Arma{

	@Override
	public double hacerDanio(Armadura a) {
		return a.recibirDanio(this);
	}

}
