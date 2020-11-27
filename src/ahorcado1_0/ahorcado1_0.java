package ahorcado1_0;

import java.util.Random;
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
	
	public static void imprimirMuneco(int vidas, String palabraSecreta) throws InterruptedException {
		// TODO Auto-generated method stub
		
		switch (vidas) {
			case 7:
				System.out.println("_____________________________________");
				break;
			case 6:
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("_____________________________________");
				break;
			case 5:
				System.out.println("__________________");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|          ");
				System.out.println("|          ");
				System.out.println("|          ");
				System.out.println("|          ");
				System.out.println("|          ");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("_____________________________________");
				break;
			case 4:
				System.out.println("__________________");
				System.out.println("|                |");
				System.out.println("|          ______|______");
				System.out.println("|         |             |");
				System.out.println("|         |   O     O   |");
				System.out.println("|         |      L      |");
				System.out.println("|         |    _____    |");
				System.out.println("|         |_____________|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("_____________________________________");
				break;
			case 3:
				System.out.println("__________________");
				System.out.println("|                |");
				System.out.println("|          ______|______");
				System.out.println("|         |             |");
				System.out.println("|         |   O     O   |");
				System.out.println("|         |      L      |");
				System.out.println("|         |    _____    |");
				System.out.println("|         |_____________|");
				System.out.println("|                |");
				System.out.println("|                |    ");
				System.out.println("|                |   ");
				System.out.println("|                |  ");
				System.out.println("|                | ");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|              ");
				System.out.println("|             ");
				System.out.println("|            ");
				System.out.println("|           ");
				System.out.println("|          ");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				break;
			case 2:
				System.out.println("__________________");
				System.out.println("|                |");
				System.out.println("|          ______|______");
				System.out.println("|         |             |");
				System.out.println("|         |   O     O   |");
				System.out.println("|         |      L      |");
				System.out.println("|         |    _____    |");
				System.out.println("|         |_____________|");
				System.out.println("|                |");
				System.out.println("|                |    ");
				System.out.println("|                |   ");
				System.out.println("|                |  ");
				System.out.println("|                | ");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|               / \\");
				System.out.println("|              /   \\");
				System.out.println("|             /     \\");
				System.out.println("|            /       \\");
				System.out.println("|           /         \\");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("_____________________________________");
				break;
			case 1:
				System.out.println("__________________");
				System.out.println("|                |");
				System.out.println("|          ______|______");
				System.out.println("|         |             |");
				System.out.println("|         |   O     O   |");
				System.out.println("|         |      L      |");
				System.out.println("|         |    _____    |");
				System.out.println("|         |_____________|");
				System.out.println("|                |	  ");
				System.out.println("|                |    / ");
				System.out.println("|                |   / ");
				System.out.println("|                |  /");
				System.out.println("|                | / ");
				System.out.println("|                |/");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|                |");
				System.out.println("|               / \\");
				System.out.println("|              /   \\");
				System.out.println("|             /     \\");
				System.out.println("|            /       \\");
				System.out.println("|           /         \\");
				System.out.println("|");
				System.out.println("|");
				System.out.println("|");
				System.out.println("_____________________________________");
				break;
			case 0:
				int tiempo = 0;
				do {
					Thread.sleep(1000);
					tiempo+= 1;
					if (tiempo%2==0) {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println("__________________");
						System.out.println("|                |");
						System.out.println("|          ______|______");
						System.out.println("|         |             |");
						System.out.println("|         |   X     X   |");
						System.out.println("|         |      L      |	  	mori por tu culpa");
						System.out.println("|         |    _____    |");
						System.out.println("|         |_____________|");
						System.out.println("|                |       ");
						System.out.println("|           \\    |    /");
						System.out.println("|            \\   |   /");
						System.out.println("|             \\  |  /");
						System.out.println("|              \\ | /");
						System.out.println("|               \\|/");
						System.out.println("|                |");
						System.out.println("|                |");
						System.out.println("|                |");
						System.out.println("|                |");
						System.out.println("|               / \\");
						System.out.println("|              /   \\");
						System.out.println("|             /     \\");
						System.out.println("|            /       \\");
						System.out.println("|           /         \\");
						System.out.println("|");
						System.out.println("|");
						System.out.println("|");
						System.out.println("_____________________________________");
						
						System.out.println("\n\nHas perdido, la palabra era "+palabraSecreta+", mejor vete al parchis que se te dara mejor (espero)");
						
					}else {
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
						System.out.println("__________________");
						System.out.println("|                |");
						System.out.println("|          ______|______");
						System.out.println("|         |             |");
						System.out.println("|         |   X     X   |");
						System.out.println("|         |      L      |	 	gracias por nada");
						System.out.println("|         |    _____    |");
						System.out.println("|         |_____________|");
						System.out.println("|                |       ");
						System.out.println("|                |   ");
						System.out.println("|                |   ");
						System.out.println("|                |  ");
						System.out.println("|                | ");
						System.out.println("|               /|\\");
						System.out.println("|              / | \\");
						System.out.println("|             /  |  \\");
						System.out.println("|            /   |   \\");
						System.out.println("|           /    |    \\");
						System.out.println("|               / \\");
						System.out.println("|              /   \\");
						System.out.println("|             /     \\");
						System.out.println("|            /       \\");
						System.out.println("|           /         \\");
						System.out.println("|");
						System.out.println("|");
						System.out.println("|");
						System.out.println("_____________________________________");
						
						System.out.println("\n\nHas perdido, la palabra era "+palabraSecreta+", mejor vete al parchis que se te dara mejor (espero)");
						
					}
					
				} while (tiempo<10);
				break;
			}
	}
	
	public static String palabraAleatoria() {
		
		
		int pos = 0;
		
		Random r = new Random();
		
		String[] vPalabras = {"Juan", "Pepe" , "palabra", "perro", "adrian", "amarillo", "cubata", "rojo", "espada"};
		pos = r.nextInt(vPalabras.length);
		
		return vPalabras[pos];
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int vidas = 7;
		String palabraSecreta = palabraAleatoria(), letra="";
			
		
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
			imprimirMuneco(vidas,palabraSecreta);
			imprimirFallosAciertos(vAciertos, vFallos);
			
			
			System.out.println("\n");
			
		}while ( heGanado(vAciertos)==false && vidas!=0);
		
		
		if (heGanado(vAciertos)==true) {
			System.out.println("Felicidades has ganado");
		}
		
		
	}

	

	

	

}
