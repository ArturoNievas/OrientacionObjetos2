package armadura;

import arma.*;

public class ArmaduraAcero extends Armadura {

	@Override
	public double recibirDanio(Espada e) {
		return 3;
	}

	@Override
	public double recibirDanio(Arco e) {
		return 2;
	}

	@Override
	public double recibirDanio(BastonMago e) {
		return 1;
	}

}
