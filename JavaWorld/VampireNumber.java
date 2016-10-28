public class VampireNumber {

	public static void main(String[] args) {
		// find all vampire number less than 9999
		int p = 0;
		int total = 0;
		int w = 0;
		System.out.println("Vampire number series:");
		for (int i = 10; i <= 99; i++) { 
			for (int j = 10; j <= 99; j++) {
				w = i * j;
				if (w >= 1000 && w <= 9999 && w%100 !=0) {
					total++;
					System.out.printf("%d ", w);
					if ((p++)%10 == 0) {
						System.out.println("next 10:");
					}
				}
			}
		}
		System.out.println("Total " + total + "vampire number with 4 digits.");
	}

}
