package forLoop;

public class forLoop {

	public static void main(String[] args) {
		
		for (int c = 0; c <= 12; c++) {
			System.out.printf("%5d", c);
		}
		System.out.println(" ");
		System.out.println("_________________________________________________________________");
		//System.out.println(" ");
		
	    for (int a = 1; a <= 12; a++) {
	    	System.out.println();
	    	System.out.printf("%5s", a + " | ");
	        for (int b = 1; b <= 12; b++) {
	            System.out.printf("%5d", (a*b));
	        }
	        System.out.println();
	    }

	}

}
