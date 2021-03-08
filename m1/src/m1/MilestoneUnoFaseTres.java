package m1;

public class MilestoneUnoFaseTres {

	public static void main(String[] args) {
		
		int anyo = 1996;
        int contador = 0;

        for (int i=1948; i < anyo; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                System.out.println((++contador % 1 == 0)? i + "\n": i + " ");
            }
        }

        boolean isLeapYear = ((anyo % 4 == 0) && (anyo % 100 != 0) || (anyo % 400 == 0));
        String bisiesto = "Este año, " + anyo + ", es un año bisiesto";
        String noBisiesto = "Este año, " + anyo + ", no es un año bisiesto";

        if (isLeapYear) {
            System.out.println(bisiesto);
        } else {
            System.out.println(noBisiesto);
        }
        
	}
}
