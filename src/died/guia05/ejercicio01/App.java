package died.guia05.ejercicio01;

public class App {

	public static void main(String[] args) {
		
		int[] arreglo = {4, 6, 3, 1, 8, 5, 2, 7, 3, 2, 1, 3, 2};
		System.out.println(mediana(arreglo));
	}
	
	public static int mediana(int[] arreglo) {
		return mediana(arreglo, arreglo.length, 0, 0);
	}
	
	private static int mediana(int[] arreglo, int tam, int izq, int der) {

		int[] menores, mayores;
		int cantmay = 0, cantmen = 0, iguales = 0;
		menores = new int[tam];
		mayores = new int[tam];

		for(int i=1; i<tam; i++) {
			if(arreglo[i] < arreglo[0]) {
				menores[cantmen] = arreglo[i];
				cantmen++;
			}else {
				if(arreglo[i] > arreglo[0]) {
					mayores[cantmay] = arreglo[i];
					cantmay++;
				}else {
					iguales++;
				}
			}
		}
		if((cantmen+izq) == (cantmay+der)) {
			return arreglo[0];
		}else {
			if(((cantmen+izq) - (cantmay+der)) == 1 || ((cantmay+der) - (cantmen+izq)) == 1){
				return arreglo[0];
			}else {
				if(cantmen > cantmay) {
					return mediana(menores, cantmen, izq, der+cantmay+iguales);
				}else {
					return mediana(mayores, cantmay, izq+cantmen+iguales, der);
				}
			}
		}
	}
		
	
}
