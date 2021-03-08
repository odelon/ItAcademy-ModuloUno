package m1;

public class MilestoneUnoFaseUno {

	public static void main(String[] args) {
		
		String nombre = "Noelia";
        String apellido1 = "Marquez";
        String apellido2 = "Fideo";

        int dia = 18;
        int mess = 9;
        int anyo = 1996;
        String mes = String.format("%02d", mess);

      System.out.println(apellido1 + " " + apellido2 + ", "  + nombre);
      System.out.println(dia + "/" + mes + "/" + anyo);

	}
}
