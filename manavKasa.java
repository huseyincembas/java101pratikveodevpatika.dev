import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplamFiyat;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        System.out.print("Aldığınız armut kaç kilo: ");
        armutKilo = inp.nextDouble();
        System.out.print("Aldığınız elma kaç kilo: ");
        elmaKilo = inp.nextDouble();
        System.out.print("Aldığınız domates kaç kilo: ");
        domatesKilo = inp.nextDouble();
        System.out.print("Aldığınız muz kaç kilo: ");
        muzKilo = inp.nextDouble();
        System.out.print("Aldığınız patlıcan kaç kilo: ");
        patlicanKilo = inp.nextDouble();

        toplamFiyat = (armut*armutKilo) + (elma*elmaKilo) + (domates*domatesKilo) + (muz*muzKilo) + (patlican*patlicanKilo);
        System.out.print("Toplam Fiyat: " + toplamFiyat + " TL");

    }
}