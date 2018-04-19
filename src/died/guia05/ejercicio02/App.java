package died.guia05.ejercicio02;

public class App {

	public static void main(String[] args) {

		PisoArreglo ejercicio = new PisoArreglo();
		int[] arreglo = {2, 8, 12, 30, 45, 62};

		for(int x: arreglo)
			System.out.print(x+" ");
		System.out.print("\n");
		
		System.out.println(ejercicio.piso(arreglo, 10));
		
	}

}
