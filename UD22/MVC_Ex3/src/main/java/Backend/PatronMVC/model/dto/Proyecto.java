package Backend.PatronMVC.model.dto;

public class Proyecto {
	//Atributos
	private String Id;
	private String Nombre;
	private int Horas;

	//Getters y Setters
	public String getId() {
		return Id;
	}
	
	public void setId(String Id) {
		this.Id = Id;
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public int getHoras() {
		return Horas;
	}

	public void setHoras(int Horas) {
		this.Horas = Horas;
	}
}
