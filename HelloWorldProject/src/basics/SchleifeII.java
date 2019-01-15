package basics;

public class SchleifeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // vor der Schleife
		System.out.println("vor");
		// während der schleife
		for(int i = 0; i < 3; i++) {
			System.out.println("während");
		}
		// nach der Sdchleife
		System.out.println("nach");
		//
		// innere und äußere Schleife
		for(int i = 0; i < 3; i++) {
			System.out.println("wie oft hier");
			for (int x = 0; x < 4; x++) {
				System.out.println("wie oft?");
			}
			//
			System.out.println("wie oft hier nach" + i);
		}
		
	}

}
