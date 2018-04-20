package died.guia05.ejercicio04;

public class App {

	public static void main(String[] args) {
		
		Ciudad city = new Ciudad("Santa Fe", 3000);
		Ciudad otraCity = new Ciudad("Parana", 3100);
		Ciudad city2 = new Ciudad("Santo Tome", 3000);
		Ruta road = new Ruta();
		
		System.out.println(city.equals(otraCity));
		System.out.println(city.equals(city2));
		
		road.agregar(city);
		System.out.println(road.getCiudades().size());
		road.agregar(otraCity);
		System.out.println(road.getCiudades().size());
		road.agregar(city2);
		System.out.println(road.getCiudades().size());
		
		
	}
	
}
