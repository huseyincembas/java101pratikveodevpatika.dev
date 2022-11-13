import java.util.Scanner;
public class UcgeninAlani {
    public static void main(String[] args) {
        double ilkKenar, ikinciKenar, ucuncuKenar, u, alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. kenarın uzunluğunu giriniz: ");
        ilkKenar = inp.nextDouble();

        System.out.print("2. kenarın uzunluğunu giriniz: ");
        ikinciKenar = inp.nextDouble();

        System.out.print("3. kenarın uzunluğunu giriniz: ");
        ucuncuKenar = inp.nextDouble();

        u = (ilkKenar + ikinciKenar + ucuncuKenar) / 2;
        alan = Math.sqrt(u*(u-ilkKenar)*(u-ikinciKenar)*(u-ucuncuKenar));

        System.out.print("Üçgenin Alanı: " + alan);
    }
}