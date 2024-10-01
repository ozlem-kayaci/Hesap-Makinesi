import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        while (devam) {
            // Kullanıcıdan sayıları al
            System.out.print("1. sayiyi giriniz: ");
            int s1 = scanner.nextInt();
            System.out.print("2. sayiyi giriniz: ");
            int s2 = scanner.nextInt();

            // İşlem seçimi
            System.out.print("\nYapmak istediğiniz işlemi seçiniz \n1) Toplama \n2) Çıkarma \n3) Çarpma \n4) Bölme\nSeçim: ");
            int secim = scanner.nextInt();

            // Sonuç değişkeni
            int sonuc = 0;
            boolean hataVarMi = false;

            // switch-case yapısıyla işlemi seç
            switch (secim) {
                case 1:
                    sonuc = s1 + s2;
                    System.out.println(s1 + " + " + s2 + " = " + sonuc);
                    break;
                case 2:
                    sonuc = s1 - s2;
                    System.out.println(s1 + " - " + s2 + " = " + sonuc);
                    break;
                case 3:
                    sonuc = s1 * s2;
                    System.out.println(s1 + " * " + s2 + " = " + sonuc);
                    break;
                case 4:
                    if (s2 != 0) {
                        sonuc = s1 / s2;
                        System.out.println(s1 + " / " + s2 + " = " + sonuc);
                    } else {
                        System.out.println("Hata: Sıfıra bölme yapılamaz.");
                        hataVarMi = true;
                    }
                    break;
                default:
                    System.out.println("Hatalı seçim! Lütfen 1-4 arası bir değer giriniz.");
                    hataVarMi = true;
                    break;
            }

            // Kullanıcıya devam etmek isteyip istemediğini sor
            if (!hataVarMi) {
                System.out.print("\nBaşka bir işlem yapmak ister misiniz? (Evet için 'E', Hayır için 'H'): ");
                char devamSecim = scanner.next().charAt(0);
                if (devamSecim == 'H' || devamSecim == 'h') {
                    devam = false;
                }
            }
        }

        // Program bittiğinde kullanıcıya veda mesajı
        System.out.println("Hesap makinesi kapatılıyor...");
        scanner.close();
    }
}
