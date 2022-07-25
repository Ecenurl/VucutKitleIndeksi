import java.util.Scanner;

public class VucutKitleHesap {

    public static void main(String[] args) {

        double kilo,boy,indeks;
        Scanner sc= new Scanner(System.in);
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        boy=sc.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo=sc.nextDouble();

        indeks=kilo/(boy*boy);
        System.out.print("Vucut Kitle indeksiniz: " +indeks);
    }
}
