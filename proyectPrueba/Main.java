package proyectPrueba;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Juan","Galvis","1104544247","321964800");
		mostrarPersona(p1);
	}

	public static void mostrarPersona(Persona p){
		System.out.println("Nombre"+ p.getNombre());
		System.out.println("Apellido"+ p.getApellido());
		System.out.println("CC"+ p.getCedula());
		System.out.println("Telefono"+ p.getTelefono());
	}
}
