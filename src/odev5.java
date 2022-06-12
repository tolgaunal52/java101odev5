import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14, r, a, h, alan, cevre, dilim, al;

        System.out.println("Hosgeldiniz Daire Olculerini Ogrenmek icin Istenilen Verileri Sisteme Girin");
        System.out.print("\nLutfen Dairenin Yari Capini Giriniz : ");
        r = input.nextDouble();

        alan = pi * (Math.pow(r,2));
        System.out.println("\nDairenin Alani : " + alan + " br");

        cevre = 2 * pi * r ;
        System.out.println("\nDairenin Cevresi : " + cevre + " br");

        System.out.print("\nDaire Diliminin Alan Olcusu icin ALFA Acisini Giriniz : ");
        al = input.nextDouble();

        dilim = (pi*(Math.pow(r,2))*al)/360;
        System.out.println("Daire Diliminin Alan Olcusu : " + dilim + " R");





    }
}
