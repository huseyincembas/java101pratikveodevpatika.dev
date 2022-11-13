import java.util.Scanner;
public class notortalamasipratik {
    public static void main(String[] args) {
        int mat, fiz, kim, turk, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kim = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turk = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        double sonuc = (mat + fiz + kim + turk + tarih + muzik) / 6.0;
        System.out.println("Genel Ortalamanız: " + sonuc);

        int a = 60;
        String durum = (sonuc >= a) ? "Geçtiniz" : "Kaldınız";
        System.out.print(durum);


    }
}