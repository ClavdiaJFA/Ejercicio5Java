
public class Triángulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Crear un programa donde se introduzcan los tres ángulos internos de un 
	 * triángulo y se determine si el triángulo es válido o no.
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
			System.out.println("Tu triángulo es válido");
		} else  {
			System.out.println("Tu triángulo es inválido");
		}
		


	}

}
