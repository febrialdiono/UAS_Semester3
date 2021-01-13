package Soal1;

import java.util.Scanner;

public class MenghitungNilaiIpk {

    public static void main(String[] args) {
        double totn = 0, ipk, jums = 0, jumn = 0, tot = 0;
        String p;
        int po;

        Scanner inp = new Scanner(System.in);
        System.out.print(" NIM :");
        String m = inp.nextLine();
        System.out.println("===============");

        Scanner input = new Scanner(System.in);
        System.out.print(" NAMA :");
        String nm = input.nextLine();
        System.out.println("===============");

        Scanner input1 = new Scanner(System.in);
        System.out.println(" JURUSAN :");
        String jrsan = input1.nextLine();
        System.out.println("===============");

        Scanner input2 = new Scanner(System.in);
        System.out.println(" FAKULTAS :");
        String fklts = inp.nextLine();
        System.out.println("===============");

        Scanner input3 = new Scanner(System.in);
        int i = 1;
        float n, jum;
        System.out.print(" Banyak Mata Kuliah Yang Diambil");
        n = input3.nextFloat();

        while (i <= n) {
            System.out.println("");
            System.out.println(" Matkul ke : " + i);
            Scanner input4 = new Scanner(System.in);
            String mk = input4.nextLine();
            
            Scanner input5 = new Scanner(System.in);
            System.out.print("SKS : ");
            int sk = input5.nextInt();

            Scanner input6 = new Scanner(System.in);
            System.out.print(" nilai :");
            Double nil = input6.nextDouble();
            if (nil >= 85) {
                p = "A";
                po = 3;
            } else if (nil >= 75) {
                p = "B";
                po = 1;
            } else if (nil >= 65) {
                p = "C";
                po = 2;
            } else if (nil > 50) {
                p = "D";
                po = 1;
            } else {
                p = "E";
                po = 1;
            }

            System.out.println(" predikat " + p);
            tot = po * sk;
            System.out.println(" Total Point : " + tot);
            totn += tot;
            jums += sk;
            jumn += nil;
            i++;
        }
        System.out.println(" ");
        System.out.println(" Toyal nilai :" + jumn);
        System.out.println(" Total Point :" + tot);
        System.out.println(" total sks :" + jums);
        ipk = totn / jums;
        System.out.println(" IPK :" + ipk);

        if (ipk > 3.25) {
            System.out.println(" ANDA MENDAPAT BEASISWA");
        } else {
            System.out.println(" ANDA TIDAK MENDAPAT BEASISWA");
        }
    }
}
