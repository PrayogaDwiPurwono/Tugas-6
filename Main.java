package com.Tugas6;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("NAMA : Prayoga Dwi Purwono");
        System.out.println("NIM  : 215150700111021\n");

        Scanner scan = new Scanner(System.in);

        Manusia manusia1 = new Manusia("Kaka", "135791113", true, true);
        Manusia manusia2 = new Manusia("Koko", "246810121", true, true);
        Manusia manusia3 = new Manusia("Kiki", "123456789", false, false);

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Prayoga", "01040304", false, false, "215150707111021", 3.5);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Ferdinand", "23568910", false, true, "215150707111022", 3.6);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Habibie", "25679876", true, false, "215150707111024", 3.7);
        MahasiswaFilkom mhs4 = new MahasiswaFilkom("Kukuh", "12347890", true, true, "215150707111025", 3.9);

        Pekerja pekerja_1 = new Pekerja("Budi", "224466889", true, true, 8, 21, "123456789101");
        Pekerja pekerja_2 = new Pekerja("Ahmad", "988776655", true, false, 7, 23, "234567891011");
        Pekerja pekerja_3 = new Pekerja("Caca", "121314156", false, true, 7 , 18, "345678910112");
        Pekerja pekerja_4 = new Pekerja("Salma", "242526289", false ,false, 6, 24, "122134435665");
        Pekerja pekerja_5 = new Pekerja("Bob", "343536378", true, true, 7, 23, "1221344435665");

        Manajer manajer_1 = new Manajer("Melissa Lawrence", "352215040202", false, false, 9, 19, "123456789111", 1800);
        Manajer manajer_2 = new Manajer("Aurel Van", "354515089922", false, true, 11, 21, "098765432112", 1120);
        Manajer manajer_3 = new Manajer("Bobby Han", "356788942020", true, false, 8, 22, "234598761234", 1950);

        ArrayList<Manusia> listManusia = new ArrayList<Manusia>();
        ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();
        ArrayList<Manajer> listManajer = new ArrayList<Manajer>();
        ArrayList<MahasiswaFilkom> listMahasiswaFilkom = new ArrayList<MahasiswaFilkom>();

        listManusia.add(manusia1);
        listManusia.add(manusia2);
        listManusia.add(manusia3);

        listPekerja.add(pekerja_1);
        listPekerja.add(pekerja_2);
        listPekerja.add(pekerja_3);
        listPekerja.add(pekerja_4);
        listPekerja.add(pekerja_5);

        listManajer.add(manajer_1);
        listManajer.add(manajer_2);
        listManajer.add(manajer_3);

        listMahasiswaFilkom.add(mhs1);
        listMahasiswaFilkom.add(mhs2);
        listMahasiswaFilkom.add(mhs3);
        listMahasiswaFilkom.add(mhs4);

        System.out.println("--> Data Manusia\n");
        listManusia.toString();
        System.out.println("=================================================\n");
        System.out.println("--> Data Pekerja\n");
        listPekerja.toString();
        System.out.println("=================================================\n");
        System.out.println("--> Data Manajer\n");
        listManajer.toString();
        System.out.println("=================================================\n");
        System.out.println("--> Data Mahasiswa Filkom\n");
        listMahasiswaFilkom.toString();
        System.out.println("=================================================");

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Total Manusia          : " + listManusia.size());
        System.out.println("Total Pekerja          : " + listPekerja.size());
        System.out.println("Total Manajer          : " + listManajer.size());
        System.out.println("Total Mahasiswa Filkom : " + listMahasiswaFilkom.size());
        System.out.println("---------------------------");
    }
}

//Prayoga Dwi Puwrwono
//215150707111021
