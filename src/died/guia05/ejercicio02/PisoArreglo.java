package died.guia05.ejercicio02;

public class PisoArreglo {
	
	public int piso(int[] arreglo, int x) {
		return piso(arreglo, 0, arreglo.length-1, x);
	}
	
	private int piso(int[] arreglo, int i, int f, int x) {
		
		int m = (i+f)/2;
		
		if(i >= f) {
			if(arreglo[i] > x)
				if(i == 0 ) 
					return -1;
				else 
					return arreglo[i-1];
			else
				return arreglo[i];
		}else {
			if(x < arreglo[m])
				return piso(arreglo, i, m, x);
			else
				if(x != arreglo[m])
					return piso(arreglo, m+1, f, x);
				else
					return arreglo[m];
		}
		
	}
	
}
