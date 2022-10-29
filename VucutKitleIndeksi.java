import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double K,B,F;
        int a=1;
        while (a>0) {
            System.out.println("Lütfen kilonuzu giriniz:     ");
            K = inp.nextDouble();
            System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :    ");
            B = inp.nextDouble();
            F = K / (B * B);
            System.out.println("Vücut Kitle İndeksiniz:    " + F);
            System.out.println("Çıkmak için 0 e basınız.");
            a= inp.nextInt();
        }
    }
}
