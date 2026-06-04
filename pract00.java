import java.util.Scanner;

public class pract00 {
      static Scanner input = new Scanner(System.in);

      static void cetakGaris() {
            for (int i = 1; i <= 30; i++) {
                  System.out.print("=");

            }
      }

      static void tampilkanMahasiswa() {
            System.out.println("Nama");
            String namaGweh = input.nextLine();
            System.out.println("NIM");
            String nimGweh = input.nextLine();
            System.out.println("IPK");
            Double ipkGweh = input.nextDouble();

            System.out.println("\u001B[32m");
            cetakGaris();
            System.out.println();
            System.out.println("KARTU MAHASISWA");
            cetakGaris();
            System.out.println();
            System.out.println("Nama: " + namaGweh);
            System.out.println("NIM: " + nimGweh);
            System.out.println("IPK: " + ipkGweh);
            cetakGaris();
      }

      static void cetakTabel() {
            System.out.println("Inputin angka");
            int angka = input.nextInt();

            for (int i = 1; i <= angka; i++) {
                  System.out.println(angka + "*" + i + " = " + (angka * i));
            }
      }

      public static void main(String[] args) {

            int ver = 1;
            do{

            System.out.println("Welkam");
            System.out.println("1. Tampilkan  Mahasiswa");
            System.out.println(`);
            int pilihan;
            pilihan = input.nextInt();

            switch(pilihan){
                  case 1:
                  tampilkanMahasiswa();
                  break;

                  case 2:
                  System.out.println();
                  cetakTabel();
            }

            ver = input.nextInt();
      } while (ver == 1);


            // System.out.println();
            // cetakTabel();
      }
}
