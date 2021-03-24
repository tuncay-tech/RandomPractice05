import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("1.kelimeyi giriniz : ");
        String kelime1 = klavye.nextLine();
        System.out.print("2.kelimeyi giriniz : ");
        String kelime2 = klavye.nextLine();
        System.out.print("3.kelimeyi giriniz : ");
        String kelime3 = klavye.nextLine();

        int a = kelime1.length();
        int b = kelime2.length();
        int c = kelime3.length();

        if ((a > b) && (a > c)) {
            System.out.println("1.kelime en uzundur, kelime uzunluğu : " + kelime1.length());
        }
        if ((b > a) && (b > c)) {
            System.out.println("2.kelime en uzundur, kelime uzunluğu : " + kelime2.length());
        }
        if ((c > a) && (c > b)) {
            System.out.println("3.kelime en uzundur, kelime uzunluğu : " + kelime3.length());
        }
        if (a == b && a != c) {
            System.out.println("1. ve 2. kelime uzunlukları eşittir : " + kelime1.length());
        }
        if (a == c && a != b) {
            System.out.println("1. ve 3. kelime uzunlukları eşittir : " + kelime1.length());
        }
        if (b == c && b != a) {
            System.out.println("2. ve 3. kelime uzunlukları eşittir : " + kelime2.length());
        }
        if ((a == b) && (a == c) && (b == c)) {
            System.out.println("Tüm kelime uzunluk sayıları eşittir : " + kelime1.length());
        }
    }
    }
