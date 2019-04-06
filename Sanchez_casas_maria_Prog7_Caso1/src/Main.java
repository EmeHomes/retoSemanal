import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion = menu();

		switch(opcion) {
			case 1: nuevo();
				break;
			case 2: kilometro0();
				break;
			case 3: segundaMano();
				break;
			default: System.out.println("El número introducido no es válido, intentalo de nuevo");
		}
	}
	
	public static int menu() {
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Introduce una clase de vehículo: ");
		System.out.println("Para un COCHE NUEVO introduce 1");
		System.out.println("Para un coche con KILOMETRO CERO introduce 2");
		System.out.println("Para un coche de SEGUNDA MANO introduce 3");
		
		int x = in.nextInt();
		
		System.out.println("El número introducido es: " +x);

		return x;
		
	}
	public static void nuevo() {
		Scanner in = new Scanner(System.in); 

		System.out.println("Introduce una matrícula");
		String matricula = in.nextLine();
	    
	    System.out.println("Introduce un modelo");
		String modelo = in.nextLine();
		
		System.out.println("Introduce un color");
		String color = in.nextLine();
		
		System.out.println("Introduce un tipo");
		String tipoVehiculo = in.nextLine();
		
		Nuevo n1 = new Nuevo(matricula, modelo, color, tipoVehiculo);

		System.out.println(n1.getInfo());
		
		in.close();
	}
	public static void kilometro0() {
		Scanner in = new Scanner(System.in); 

		System.out.println("Introduce una matrícula");
		String matricula = in.nextLine();
	    
	    System.out.println("Introduce un modelo");
		String modelo = in.nextLine();
		
		System.out.println("Introduce un color");
		String color = in.nextLine();
		
		System.out.println("Introduce un tipo");
		String tipoVehiculo = in.nextLine();
		
		System.out.println("Introduce un kilometraje");
		int Km = in.nextInt();
		
		Kilometro0 k1 = new Kilometro0(matricula, modelo, color, tipoVehiculo, Km);
	    
		System.out.println(k1.getInfo());
		
		in.close();
	}
	public static void segundaMano() {
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Introduce una matrícula");
		String matricula = in.nextLine();
	    
	    System.out.println("Introduce un modelo");
		String modelo = in.nextLine();
		
		System.out.println("Introduce un color");
		String color = in.nextLine();
		
		System.out.println("Introduce un tipo");
		String tipoVehiculo = in.nextLine();
		
		System.out.println("Introduce un kilometraje");
		int Km = in.nextInt();
		
		in.nextLine();
		System.out.println("Introduce un antiguo propietario del vehículo");
		String exPropietario = in.nextLine();
		
		SegundaMano s1 = new SegundaMano(matricula, modelo, color, tipoVehiculo, Km, exPropietario);
	    
		System.out.println(s1.getInfo());
		
		in.close();
	}
}