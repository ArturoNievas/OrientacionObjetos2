package armadura;

import arma.*;

public abstract class Armadura {

	public abstract double recibirDanio(Espada e);
	public abstract double recibirDanio(Arco e);
	public abstract double recibirDanio(BastonMago e);
}
