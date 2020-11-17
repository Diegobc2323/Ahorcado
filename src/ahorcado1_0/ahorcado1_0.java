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
	
	public static void comprobarLetraIntroducida(String letra, String[] vPalabraSecreta, String vAciertos[], String vFallos[]) {
		
		boolean bandera=false;
		
		for (int i = 0; i < vPalabraSecreta.length; i++) {
			if (vPalabraSecreta[i].equals(letra)) {
				vAciertos[i]=letra;
			}
		}
		//ESTAMOS AQUI
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int vidas = 7;
		String palabraSecreta = "manue";
		
		
		
		//crear vectores
		String vFallos[] = new String[vidas];
		String vPalabraSecreta[] = new String[palabraSecreta.length()];
		String vAciertos[] = new String[vPalabraSecreta.length];
		String letra; 
		
		System.out.println("Dime una letra");
		letra = leer.nextLine();
		
		
		
		inicializarVectores(vAciertos, vFallos, vPalabraSecreta, palabraSecreta);
		imprimirFallosAciertos(vAciertos, vFallos);
		comprobarLetraIntroducida(letra, vPalabraSecreta, vAciertos, vFallos);				
		/*
		do
			
			
			
			
			vidas--;
		while(vidas!=0);
		*/
		
		
	}

	

}
