import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alınır
        System.out.println("Bir sayı girin:");
        int sayi = scanner.nextInt();

        // Faktöriyel hesaplama için değişken tanımlanır ve 1'e eşitlenir
        long faktoriyel = 1;

        // 1'den başlayarak girilen sayıya kadar olan her sayı çarpılarak faktöriyel hesaplanır
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        // Sonuç ekrana yazdırılır
        System.out.println(sayi + "! = " + faktoriyel);
    }
}
