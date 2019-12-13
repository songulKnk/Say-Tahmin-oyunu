import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max, min'den büyük olmalýdýr ");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min; 
	}

	public static void main(String[] args) {

		int min, max, tahmin, randomSayi;
		Scanner input = new Scanner(System.in);
		System.out.print("Tuttuðum sayýyý bulabilecek misin?\n" + "Aralýk girin ( 100 999 gibi) : ");
		min = input.nextInt();
		max = input.nextInt();
		getRandomNumberInRange(min, max); // min ile max arasýnda random sayý oluþmasý için fonk çaðýrdýk

		System.out.print("Tahmin et:");
		tahmin = input.nextInt();
		randomSayi = getRandomNumberInRange(min, max); // fonksiyondan dönen deðeri direk kullanamýyoruz
														// bu yüzden yeni bir deðiþken tanýmlayýp dönen deðeri buna
														// atadýk

		while (1 < 2) { // sürekli dönsün, bilince aþaðýda breakla çýkýcak

			if (tahmin < randomSayi) {
				System.out.print("Eksik söyledin\nTahmin et:");
				tahmin = input.nextInt();
			}

			else if (tahmin > randomSayi) {
				System.out.print("Fazla söyledin\nTahmin et:");
				tahmin = input.nextInt();
			}

			else {
				System.out.println("Bravo bildin! Tuttuðum sayý " + randomSayi + " idi. \nGüle güle.. ");
				break;

			}
		}

	}
}
