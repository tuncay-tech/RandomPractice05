import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        // İki basamaklı iki doğal sayının birler basamağındaki
        // rakamların toplamı 10 ve onlar basamağındaki rakamları aynı ise
        // bu iki doğal sayıya bağdaşık sayı denir. Klavyeden girilen iki
        // doğal sayının bağdaşık sayı olup/olmadığını bulan ve de bağdaşık
        // sayı ise “Bagdasik sayilardir.” değilse “Bagdasik sayilar degil.”
        // ibaresini ekrana yazan programı Java dilinde yazınız.
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi 1 giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("Sayi 2 giriniz: ");
        int sayi2 = input.nextInt();
        if (sayi1 >= 10 && sayi1 <= 99 && sayi2 >= 10 && sayi2 <= 99) {
            int sayi1_birler = sayi1 % 10;
            int sayi2_birler = sayi2 % 10;
            if ((sayi1_birler + sayi2_birler) == 10) {
                int sayi1_onlar = (sayi1 - sayi2_birler) / 10;
                int sayi2_onlar = (sayi2 - sayi2_birler) / 10;
                if (sayi1_onlar == sayi2_onlar) {
                    System.out.println("Bagdasik sayilardir.");
                } else {
                    System.out.println("Bagdasik sayilar degildir.");
                }
            } else {
                System.out.println("Bagdasik sayilar degildir.");
            }
        } else {
            System.out.print("iki basamakli sayi giriniz");
        }

    }
}
