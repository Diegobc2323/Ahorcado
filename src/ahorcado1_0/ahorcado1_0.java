package ahorcado1_0;

import java.util.Scanner;

public class ahorcado1_0 {

	public static void inicializarVectores(String vAciertos[], String vFallos[], String vPalabraSecreta[], String palabraSecreta) {
		
		for (int i = 0; i < palabraSecreta.length(); i++) {
			vPalabraSecreta[i] = palabraSecreta.substring(i,i+1);
		}
		
		for (int i = 0; i < palabraSecreta.length(); i++) {
			vAciertos[i] = "_";
		}
		
		
		for (int i = 0; i < vFallos.length; i++) {
			
			vFallos[i] = "_";
		}
		
	}
	
	public static void imprimirFallosAciertos(String vAciertos[], String vFallos[]) {
		
		System.out.print("\nFallos: ");
		for (int i = 0; i < vFallos.length; i++) {
			System.out.print(vFallos[i]+" ");	
		}
		
		
		System.out.print("\nAciertos: ");
		for (int i = 0; i < vAciertos.length; i++) {
			System.out.print(vAciertos[i]+" ");	
		}
		
	}
	
	public static int comprobarLetraIntroducida(String letra, String[] vPalabraSecreta, String vAciertos[], String vFallos[], int vidas) {
		
		boolean acierto=false, letraRepetida=false;
		
		for (int i = 0; i < vFallos.length; i++) {
			if (vFallos[i].equalsIgnoreCase(letra)) {
				System.out.println("Esta letra ya se ha introducido y no esta en la palabra");
				letraRepetida=true;
				break;
			}
		}
		
		if (letraRepetida==false) {
			for (int i = 0; i < vPalabraSecreta.length; i++) {
				if (vPalabraSecreta[i].equalsIgnoreCase(letra)) {
					vAciertos[i]=letra.toLowerCase();
					acierto=true;
				}
			}
		}
		
		if (acierto==false && letraRepetida==false) {
			vidas--;
			for (int i = 0; i < vFallos.length; i++) {
				if (vFallos[i].equals("_")) {
					vFallos[i] = letra;
					break;
				}
			}
		}
		return vidas;
		
	}
	
	public static boolean heGanado(String vAciertos[]) {

		
		
		for (int i = 0; i < vAciertos.length; i++) {
			if (vAciertos[i].equals("_")) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int vidas = 7;
		String palabraSecreta = "palabra", letra="";
			
		
		//crear vectores
		String vFallos[] = new String[vidas];
		String vPalabraSecreta[] = new String[palabraSecreta.length()];
		String vAciertos[] = new String[vPalabraSecreta.length];
		
		
		
		inicializarVectores(vAciertos, vFallos, vPalabraSecreta, palabraSecreta);
					
		
		
		do {
			
			System.out.println("Dime una letra");
			letra = leer.nextLine();
			
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\n");
			
			vidas = comprobarLetraIntroducida(letra, vPalabraSecreta, vAciertos, vFallos, vidas);
			imprimirFallosAciertos(vAciertos, vFallos);
			
			
			System.out.println("\n");
			
		}while ( heGanado(vAciertos)==false && vidas!=0);
		
		
		if (heGanado(vAciertos)==true) {
			System.out.println("Felicidades has ganado");
		}else {
			System.out.println("Has perdido, mejor vete al parchis que se te dara mejor (espero)");
		}
		
		
	}

	

	

}
