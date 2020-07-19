package JavaClases;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] miMatriz = new int[5];
		
		miMatriz[0] = 250;
		miMatriz[1] = 251;
		
		for(int i =0; i< miMatriz.length; i++) {
			System.out.println(miMatriz[i]);
		}*/
		int[][] matriz = new int[5][];
		
		matriz[0] = new int[5];
		matriz[1] = new int[5];
		matriz[2] = new int[5];
		matriz[3] = new int[5];
		matriz[4] = new int[5];
		
		
		for(int i = 0; i<matriz.length; i++) {
			matriz[0][i] = i * 2;
			System.out.print(matriz[0][i]);
			
		}
	}
}
