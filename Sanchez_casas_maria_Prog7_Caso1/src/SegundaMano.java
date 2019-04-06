
public class SegundaMano extends Coche{
	
	int Km; //Esta variable indica el n�mero de Kil�metros
	String exPropietario; //Esta variable indica el nombre del antiguo propietario
	
	public SegundaMano(String matricula, String modelo, String color, int Km, String exPropietario) {
			super(matricula, modelo, color);
			this.Km = Km;
			this.exPropietario = exPropietario;
	}
	
	public int getKm () {
		return Km;
	}
	public void setKm (int Km) {
		this.Km = Km;
	}
	public String getexPropietario () {
		return exPropietario;
	}
	public void setExPropietario (String exPropietario) {
		this.exPropietario = exPropietario;
	}
	
	public String getInfo() {
		String mensaje = "Esta es la matr�cula contenida: " + this.matricula + 
						 " Este es el modelo contenido: " + this.modelo +
		 				 " Este es el color contenido: " + this.color +
		 				 " Estos son los Kil�metros contenidos: " + this.Km +
		 				 " Este es el nombre del antiguo propietario: " + this.exPropietario;
		return mensaje;
	}
	

}
