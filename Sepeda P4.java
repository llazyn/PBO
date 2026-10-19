
package Pertemuan4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Sepeda spd = new Sepeda();

        System.out.print("Masukkan Merk Sepeda\t: ");
        spd.merk = in.nextLine();

        spd.Jtempuh = 0;

        System.out.println("Sepeda " + spd.merk
                + " Memiliki jarak awal : " + spd.Jtempuh);

        int pilihan;
        do {
            System.out.println("\n\nMenu:");
            System.out.println("Maju (1)");
            System.out.println("Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Keluar (0)");

            System.out.print("Pilihan : ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    spd.Maju();
                    break;

                case 2:
                    spd.Mundur();
                    break;

                case 3:
                    spd.berhenti();
                    break;

                case 0:
                    System.out.println("Udahan Sepedahannya");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        in.close();
    }
}

class Sepeda {
    String merk;
    int Jtempuh;

    void Maju() {
        Jtempuh += 10;
        System.out.println("- Bergerak Maju 10 Km");
        System.out.println("- Sepeda " + merk
                + ", Jarak tempuh " + Jtempuh + " Km");
    }

    void Mundur() {
        Jtempuh -= 5;
        System.out.println("- Bergerak Mundur 5 Km");
        System.out.println("- Sepeda " + merk
                + ", Jarak tempuh " + Jtempuh + " Km");
    }

    void berhenti() {
        System.out.println("- Berhenti");
        System.out.println("- Jarak tempuh terakhir sepeda "
                + merk + " adalah " + Jtempuh + " Km");
    }
}
