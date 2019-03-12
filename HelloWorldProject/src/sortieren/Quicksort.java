package sortieren;

public class Quicksort {
	//
	static int[] zahlen = { 4, 2, 5, 9, 6, 10, 9, 7 };
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int n = zahlen.length; n > 1; --n) {
		}
		
		quicksort(0, zahlen.length -1);
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
		
		
		
		return i;

	}

}
