import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max, min'den b�y�k olmal�d�r ");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min; 
	}

	public static void main(String[] args) {

		int min, max, tahmin, randomSayi;
		Scanner input = new Scanner(System.in);
		System.out.print("Tuttu�um say�y� bulabilecek misin?\n" + "Aral�k girin ( 100 999 gibi) : ");
		min = input.nextInt();
		max = input.nextInt();
		getRandomNumberInRange(min, max); // min ile max aras�nda random say� olu�mas� i�in fonk �a��rd�k

		System.out.print("Tahmin et:");
		tahmin = input.nextInt();
		randomSayi = getRandomNumberInRange(min, max); // fonksiyondan d�nen de�eri direk kullanam�yoruz
														// bu y�zden yeni bir de�i�ken tan�mlay�p d�nen de�eri buna
														// atad�k

		while (1 < 2) { // s�rekli d�ns�n, bilince a�a��da breakla ��k�cak

			if (tahmin < randomSayi) {
				System.out.print("Eksik s�yledin\nTahmin et:");
				tahmin = input.nextInt();
			}

			else if (tahmin > randomSayi) {
				System.out.print("Fazla s�yledin\nTahmin et:");
				tahmin = input.nextInt();
			}

			else {
				System.out.println("Bravo bildin! Tuttu�um say� " + randomSayi + " idi. \nG�le g�le.. ");
				break;

			}
		}

	}
}
