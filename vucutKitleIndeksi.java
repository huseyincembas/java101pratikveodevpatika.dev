import java.util.Scanner;
public class vucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kilo, boy, vucutKitleIndeksi;

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kilo = inp.nextDouble();
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();

        vucutKitleIndeksi = kilo / (boy*boy);
        System.out.print("Vücut kitle indeksiniz: " + vucutKitleIndeksi);
    }
}