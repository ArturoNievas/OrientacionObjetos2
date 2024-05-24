package armadura;

import arma.*;

public class ArmaduraHierro extends Armadura {

	@Override
	public double recibirDanio(Espada e) {
		return 5;
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
