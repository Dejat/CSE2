//Tyler DeJarnett

public class Root {
public static void main(String[] args) {
	int num = 1000;
	int nothing = 0;
	int won = 0;
	int profits = 0;
	while (num > 0) {
		int spins = 100;
		int betNum = (int) (Math.random() * 100);
		int cameUp = 0; 
		while (betNum > 38) {
			betNum = (int) (Math.random() * 100);
		}
		while (spins > 0) {
			int landed = (int) (Math.random() * 100);
			while (betNum > 38) {
				landed = (int) (Math.random() * 100);
			}
			if (betNum == landed) {
				cameUp += 1;
			}
			spins--;
		}
		if (cameUp == 0) {
			nothing++;
		} else if (cameUp == 1) {
			profits += 36;
		} else if (cameUp >= 3) {
			profits += cameUp * 36;
		}
		num--;
	}
	won = 1000 - nothing;
	System.out.println("Lost: " + nothing);
	System.out.println("Won: " + won);
	System.out.println("Profit: $" + profits);
}
    
}
