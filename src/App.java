import java.util.*;


public class App {
	

	public static void main(String[] args) {
		/* Schreiben Sie ein Programm, das dem Benutzer auffordert eine ganze Zahl einzugeben. 
		 * Danach sollen alle möglichen Teiler dieser Zahl ausgegeben werden. 
		 * Wenn keine ganze Zahl (Integer) eingegeben wurde soll eine Fehlermeldung erscheinen und 
		 * der Benutzer wird noch einmal aufgefordert eine Zahl einzugeben.
		*/
		int ganzzahl = 0;

		System.out.println("Willkommen beim Ganzzahlteiler :)");
		
		berechnung(ausgabe());

	}
	

	static int ausgabe() {
		Scanner einlesen = new Scanner(System.in);
		
		int eingabe = 0;
		
			try {
				System.out.print("Bitte geben Sie eine ganze Zahl ein:");
				eingabe = einlesen.nextInt();
			}catch (Exception e) {
				System.out.println("Bitte nur Ganzzahlen eingeben!");
				ausgabe();
			}
		return eingabe;
		
	}
	
	static void berechnung(int usrEingabe) {
		int zahl = 0;
		int[] divisor = null;
		
		divisor = new int[usrEingabe];
		
		for(int i=1; i<=usrEingabe; i++) {
			if((usrEingabe%i) == 0) {
				int j = i;
				j--;
				divisor[j] = i;
			}
		}
		
		for(int i=0; i<divisor.length ;i++) {
			int x = divisor[i];
			if(x!=0) {
				System.out.println(x +" ist ein Teiler von: "+ usrEingabe);
			}
		}
	}
}
