package sortieren;

public class Quicksort {
	//
	static int[] zahlen = { 4, 2, 5, 9, 6, 10, 9, 7 };
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i : zahlen)
			System.out.println(i);

		System.out.println("--------------------------------");

		quicksort(0, zahlen.length - 1);
		for (int i : zahlen)
			System.out.println(i);
		
	}

	static void quicksort(int links, int rechts) {

		// falls links < rechts dann

		if (links < rechts) {

			int teiler = teile(links, rechts);

			quicksort(links, teiler - 1);

			quicksort(teiler + 1, rechts);

		}

	}

	private static int teile(int links, int rechts) {
		int i = links;
		int j = rechts - 1;
		int pivot = zahlen[rechts];

		// Suche von links ein Element, welches größer als das Pivotelement ist
		do {

			while (i < j && zahlen[i] < pivot) {
				i = i + 1;

			}

			// Suche von rechts ein Element, welches gleich oder kleiner als das
			// Pivotelement ist

			while (j > i && zahlen[j] >= pivot) {
				j = j - 1;
			}

			if (i < j) {
				int help = zahlen[i];
				zahlen[i] = zahlen[j];
				zahlen[j] = help;
			}
		} while (i < j);

		if (zahlen[i] > pivot) {
			int help = zahlen[i];
			zahlen[i] = pivot;
			zahlen[rechts] = help;
		}

		return i;

	}

}
