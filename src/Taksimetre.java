import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int baz = 10, km;

        double kmfiyat= 2.2 , toplamtutar;

        Scanner inp = new Scanner(System.in);

        System.out.println("Km Değerini Giriniz: ");
        km = inp.nextInt();

        toplamtutar = baz + km * kmfiyat;

       double durum;

        durum = toplamtutar>20 ? toplamtutar : 20;

        System.out.println(durum +" TL ");


    }
}
