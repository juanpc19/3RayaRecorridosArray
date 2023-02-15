
public class Ejemplos {

	public static void main(String[] args) {
		
		char tabla[][] = {
				{ '0', 'x', 'x' },
				{ 'x', '0', 'x' },
				{ 'x', 'x', '0' } };

		/*
		 * print normal (filas columnas)for (int i = 0; i < tabla.length; i++) {
		 * 
		 * for (int j = 0; j < tabla[0].length; j++) {
		 * 
		 * System.out.println(tabla[i][j]);
		 * 
		 * } }
		 */
		
		/*
		//print inverso (columnas filas)
		 for (int j = 0; j < tabla.length; j++) {
			for (int i = 0; i < tabla[0].length; i++) {
				 System.out.println(tabla[i][j]);
			}
			}
		*/
		
		 // print en diagonal de arriba izquierda a abajo derecha con for 
		 
		/*for (int i = 0; i < tabla.length; i++) {
		  
		 for (int j = i; j <= i; j++) {
		  
		 System.out.println(tabla[i][j]);
		 
		 } }
		 */
		
		 /*
		  * print en diagonal de arriba izquierda a abajo derecha con for pero invirtiendo i j por las risas
		 for (int i = 0; i < tabla.length; i++) {
		  
		  for (int j = i; j <= i; j++) {
		  
		  System.out.println(tabla[j][i]);
		  
		  } }
		 */

		
		/* 
		 // print en diagonal de arriba derecha a abajo izquierda con for 
		  
		  for (int i = 0, j = tabla[0].length - 1; i < tabla.length; i++) { 
			  
			  j = j - i;
			  System.out.println(tabla[i][j]);
			  j = tabla[0].length - 1 ;
		  }
		  
		 // print en diagonal de arriba derecha a abajo izquierda con while 
		 * 
		 * int i = 0;
		 * int j = 0; 
		 * 
		 * while (i < tabla.length) {
		 * 
		 * j = tabla[0].length - 1;
		 * 
		 * j = j - i; System.out.println(tabla[i][j]);
		 * 
		 * i++; 
		 * }
		 */
		
	}

}
