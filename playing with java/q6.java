package fila;



//questao 6 e 7
public class q6 {
	public static void main(String[] args) {
		int[][] matriz = { { 4, 3, 2, 1 }, { 1, 8, 3, 2 }, { 9, 1, 4, 8 }, { 8, 3, 2, 1 } };
		int totalM = 0;
		for (int i = 0; i < 4; i++) {
			int[] set = new int[4];
			int totalP = 0;
			for (int x = 0; x < 4; x++) {
				set[x] = matriz[i][x];
				totalP += matriz[i][x];
				totalM += matriz[i][x];
			}
			selectionSort(set);
			for (int x = 0; x < 4; x++) {
				matriz[i][x] = set[x];
				System.out.println(totalP);
			}
		}
		System.out.println(totalM);

	}

	private static void selectionSort(int[] set) {
		for (int y = 0; y < set.length - 1; y++) {
			int menor = y;
			for (int z = menor + 1; z < set.length; z++) {
				if (set[z] < set[menor]) {
					menor = z;
				}
			}
			if (menor != y) {
				int t = set[y];
				set[y] = set[menor];
				set[menor] = t;
			}
		}
	}
}
