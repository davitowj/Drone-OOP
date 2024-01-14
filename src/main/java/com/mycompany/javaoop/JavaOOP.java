package com.mycompany.javaoop;
import java.util.Scanner;

class JavaOOP {

    // atribut
    static int energi = 15;
    static int ketinggian;
    static int kecepatan;
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        JavaOOP func = new JavaOOP();

        System.out.println("=== Operasikan drone ini ===");
        while (energi != 0) {
            System.out.println("Energi drone = " + energi);
            System.out.println("1. Terbang"
                    + "\n2. Turun"
                    + "\n3. Belok"
                    + "\n4. Maju"
                    + "\n5. Mundur");
            System.out.print("Pilihan : ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    func.terbang();
                    break;

                case 2:
                    func.turun();
                    break;

                case 3:
                    func.belok();
                    break;

                case 4:
                    func.maju();
                    break;

                case 5:
                    func.mundur();
                    break;

                default:
                    break;
            }
            if (energi == 0) {
                System.out.println("Energi drone habis, drone jatuh");
                return;
            }
        }

        System.out.print("Energi drone habis");

    }

    // method
    void terbang() {
        energi--;
        if (energi > 10) {
            // terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Dorne terbang...");
        } else {
            System.out.println("Energi lemah: Drone nggak bisa terbang");
        }
    }

    void matikanMesin() {
        if (ketinggian > 0) {
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }

    void turun() {
        // ketinggian berkurang, karena turun
        if (ketinggian == 0) {
            System.out.println("Drone sudah di tanah");
            return;
        }
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }

    void belok() {
        energi--;
        System.out.println("Drone belok");
        // belok ke mana? perlu dicek :)
    }

    void maju() {
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }

    void mundur() {
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}
