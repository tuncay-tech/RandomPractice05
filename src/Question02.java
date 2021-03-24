import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. kelimeyi giriniz: ");
        String kelime1 = input.nextLine();
        System.out.print("2. kelimeyi giriniz: ");
        String kelime2 = input.nextLine();
        System.out.print("3. kelimeyi giriniz: ");
        String kelime3 = input.nextLine();

        int String1 = kelime1.length();
        int String2 = kelime2.length();
        int String3 = kelime3.length();

        if ((String1 > String2) && (String1 > String3)) {
            System.out.println("en uzun kelime : " + kelime1.length());
        }
        if ((String2 > String1) && (String2 > String3)) {
            System.out.println("en uzun kelime : " + kelime2.length());
        }
        if ((String3 > String1) && (String3 > String3)) {
            System.out.println("en uzun kelime : " + kelime3.length());
        }
        if ((String1 == String2) && (String2 != String3)) {
            System.out.println("1. kelime ve 2. kelime eşit uzunluktadır" + kelime1.length());
        }
        if ((String1 == String3) && (String1 != String2)) {
            System.out.println("1. ve 3. kelime eşit uzunluktadır." + kelime1.length());
        }
        if ((String2 == String3) && (String1 != String2)) {
            System.out.println("2. ve 3. kelime eşit uzunluktadır." + kelime2.length());
        }
        if ((String1 == String2) && (String1 == String3) && (String2 == String3)) {
            System.out.println("bütün kelimelerin uzunlukları eşittir" + kelime1.length());
        }
    }
}
