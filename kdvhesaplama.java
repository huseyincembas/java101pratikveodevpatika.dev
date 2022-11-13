import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double fiyat;
        System.out.print("Fiyat giriniz: ");
        fiyat = inp.nextDouble();
        System.out.println("KDV'siz Fiyat: " + fiyat);

        boolean kdv = fiyat < 1000;
        System.out.println(kdv ? "KDV = 0.18" : "KDV = 0.08");

        boolean kdvfiyat = fiyat < 1000;
        System.out.println(kdvfiyat ? "KDV Tutarı: " + fiyat*0.18 : "KDV Tutarı: " + fiyat*0.08);

        boolean toplam = fiyat < 1000;
        System.out.print(toplam ? "KDV'li Fiyat: " + (fiyat+(fiyat*0.18)) : "KDV'li Fiyat: " + (fiyat+(fiyat*0.08)));

    }
}