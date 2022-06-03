import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;
        int total = 0;

        do {
            System.out.print("Lutfen Bir Sayi Giriniz : ");
            n = inp.nextInt();
            if (n % 2 == 1) {
                total += n;
            }
        } while (n > 0);

        System.out.print("Girilen Sayilarin Icerisindeki Tek Sayilarin Toplami : " + total);
    }
}
