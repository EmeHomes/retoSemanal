
public class Kilometro0 extends Coche {
	int Km; //Esta variable indica el número de Kilómetros
	
	public Kilometro0(String matricula, String modelo, String color, int Km) {
		super(matricula, modelo, color);
		this.Km = Km;
	}
	
	public int getKm () {
		return Km;
	}
	public void setKm (int Km) {
		this.Km = Km;
	}
	
	public String getInfo() {
		String mensaje = "Esta es la matrícula contenida: " + this.matricula + 
						 " Este es el modelo contenido: " + this.modelo +
		 				 " Este es el color contenido: " + this.color +
		 				 " Estos son los Kilómetros contenidos: " + this.Km;
		return mensaje;
	}
}
