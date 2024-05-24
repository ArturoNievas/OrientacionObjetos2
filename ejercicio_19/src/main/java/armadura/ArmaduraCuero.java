package armadura;

import arma.*;

public class ArmaduraCuero extends Armadura{

	@Override
	public double recibirDanio(Espada e) {
		return 8;
	}

	@Override
	public double recibirDanio(Arco e) {
		return 5;
	}

	@Override
	public double recibirDanio(BastonMago e) {
		return 2;
	}

}
