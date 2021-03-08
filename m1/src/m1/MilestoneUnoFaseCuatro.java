package m1;

public class MilestoneUnoFaseCuatro {

	public static void main(String[] args) {
		
		String nombre = "Noelia";
        String apellido1 = "Marquez";
        String apellido2 = "Fideo";
        String denominacion = apellido1 + " " + apellido2 + ", " + nombre;        

        int dia = 18;
        int mesv = 9;
        int anyo = 1995;
        String mes = String.format("%02d", mesv);
        String fecha = dia + "/" + mes + "/" + anyo;

        boolean isLeapYear = ((anyo % 4 == 0) && (anyo % 100 != 0) || (anyo % 400 == 0));
        String bisiesto = "Mi año de nacimiento es bisiesto";
        String noBisiesto = "Mi año de nacimiento no es bisiesto";

        if (isLeapYear) {
            System.out.println("Mi nombre es " + denominacion + "\nNací el " + fecha + "\n" + bisiesto);
        } else {
            System.out.println("Mi nombre es " + denominacion + "\nNací el " + fecha + "\n" + noBisiesto);
        }
        
	}
}
