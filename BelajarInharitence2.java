package belajarinharitence2;

import java.util.Scanner;

public class BelajarInharitence2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Bola bola = new Bola();
        Balok balok = new Balok();
        Kubus kubus = new Kubus();
        LimasSegitiga lt = new LimasSegitiga();
        BangunRuang Bangunruang = new BangunRuang();
        
        System.out.println("1. Volume Bola");
        System.out.println("2. Luas Permukaan bola");
        System.out.println("3. Volume Kubus");
        System.out.println("4. Luas Permukaan Kubus");
        System.out.println("5. Volume Balok");
        System.out.println("6. Luas Permukaan Balok");
        System.out.println("7. Volume Limas Segitiga");
        System.out.println("8. Luas Permukaan Limas Segitiga");
        System.out.print("Yang ingin dihitung : ");
        int pilih = scanner.nextInt();
        
        switch(pilih) {
            case 1:
                System.out.print("Masukkan Jari jari : ");
                bola.r = scanner.nextFloat(); 
                bola.volume();
                break;
                
            case 2:
                System.out.print("Masukkan Jari jari : ");
                bola.r = scanner.nextFloat();
                bola.Lpermukaan();
                break;
                
            case 3:
                System.out.print("Masukkan Sisi : ");
                kubus.sisi = scanner.nextFloat();
                kubus.volume();
                break;
                
            case 4:
                System.out.print("Masukkan Sisi : ");
                kubus.sisi = scanner.nextFloat();
                kubus.Lpermukaan();
                break;
                
            case 5:
                System.out.print("Masukkan Panjang : ");
                balok.p = scanner.nextFloat();
                System.out.print("Masukkan Lebar : ");
                balok.l = scanner.nextFloat();
                System.out.print("Masukkan Tinggi : ");
                balok.t = scanner.nextFloat();
        }
    }
}