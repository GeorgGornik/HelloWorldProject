package basics;

public class DasKleine1x1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		for(int i = 1; i <= 10; i++) {
			System.out.println((0+i)+ "er"); 
			for(int x = 1; x <= 10; x++) {
			
				System.out.print("\t" + (i*x)); 
				
			}
			System.out.println(); 
		}
	}

}
