
public class Coche {
	
	String matricula;
	String modelo;
	String color;

	public Coche(String matricula, String modelo, String color) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.color =color;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor (String color) {
		this.color = color;
	}
	
	public String getInfo() {
		String mensaje = "Esta es la matrícula contenida: " + this.matricula + 
						 " Este es el modelo contenido: " + this.modelo +
		 				 " Este es el color contenido: " + this.color;
		return mensaje;
	}
}
