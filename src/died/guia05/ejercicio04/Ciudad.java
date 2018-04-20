package died.guia05.ejercicio04;

public class Ciudad {

	private String nombre;
	private Integer codigoPostal;
	
	
	
	public Ciudad() {
		super();
	}
	
	public Ciudad(String nombre, Integer codigoPostal) {
		super();
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", codigoPostal=" + codigoPostal + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj.getClass() == this.getClass())
			return codigoPostal.equals(((Ciudad) obj).getCodigoPostal());
		else
			return false;
	}
	
}
