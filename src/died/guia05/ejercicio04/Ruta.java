package died.guia05.ejercicio04;

import java.util.ArrayList;

public class Ruta {

	ArrayList<Ciudad> ciudades;

	public Ruta() {
		ciudades = new ArrayList<Ciudad>();
	}

	public ArrayList<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(ArrayList<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
	public void agregar(Ciudad c) {
		if(!ciudades.contains(c))
			ciudades.add(c);
	}
	
	
}
