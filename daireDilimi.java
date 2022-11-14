import java.util.Scanner;
public class daireDilimi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pi = 3.14, r, acı, sonuc;

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = inp.nextDouble();
        System.out.print("Dairenin merkez açısını giriniz: ");
        acı = inp.nextDouble();

        sonuc = (pi*r*r*acı)/360;
        System.out.print("Daire diliminin alanı: " + sonuc);
    }
}