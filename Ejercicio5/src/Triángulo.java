
public class Tri�ngulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Crear un programa donde se introduzcan los tres �ngulos internos de un 
	 * tri�ngulo y se determine si el tri�ngulo es v�lido o no.
	 */
		Scanner leerang1 = new Scanner(System.in);
		System.out.println("Ingrese el primer valor");
		float ang1 = leerang1.nextInt();
		
		Scanner leerang2 = new Scanner(System.in);
		System.out.println("Ingrese el segundo valor");
		float ang2 = leerang2.nextInt();
		
		Scanner leerang3 = new Scanner(System.in);
		System.out.println("Ingrese el tercer valor");
		float ang3 = leerang3.nextInt();
		
		float triangulo = ang1 + ang2 + ang3;
		
		if (triangulo == 180) {
			System.out.println("Tu tri�ngulo es v�lido");
		} else  {
			System.out.println("Tu tri�ngulo es inv�lido");
		}
		


	}

}
