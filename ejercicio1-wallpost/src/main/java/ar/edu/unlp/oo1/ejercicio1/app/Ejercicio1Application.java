package ar.edu.unlp.oo1.ejercicio1.app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

import javax.swing.SwingUtilities;

import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		Logger app = Logger.getLogger("");
		app.info("Aplicacion iniciada");
		
		FileHandler handler = new FileHandler("model.txt");
		handler.setFormatter(new ShoutingMessageFormat());
		Logger.getLogger("app.model").setLevel(Level.WARNING);
		Logger.getLogger("app.model").addHandler(handler);
		
		FileHandler handler2 = new FileHandler("ui.txt");
		handler2.setFormatter(new JSONFormatter());
		Logger.getLogger("app.ui").setLevel(Level.INFO);
		Logger.getLogger("app.ui").addHandler(handler2);
		
		FileHandler handler3 = new FileHandler("sarasa.txt");
		handler3.setFormatter(new JSONFormatter());
		List<String> palabrotas = new ArrayList<String>();
		palabrotas.add("Menem");
		Handler f = new FilterHandler(handler3, palabrotas);
		Logger.getLogger("").setLevel(Level.INFO);
		Logger.getLogger("").addHandler(f);
		Logger.getLogger("").severe("Menem lo hizo");
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WallPostUI();
			}
		});
	}

}
