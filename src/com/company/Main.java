package com.company;

/**
 * @author
 * NAMA                 : Joseph Armando Carvallo
 * KELAS                : PBO2
 * NIM                  : 10117077
 * Deskripsi Program    : Menggunakan konstruktor berparameter yang isinya setNamaVariabel,
 *                        jadi, isinya bukan " this.namaVariabel=parameterInput " tapi -> "
 *                        setNamaVariabel(parameterInput); " supaya fungsi setter-nya terpakai
 **/

public class Main {
    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+warnaKoordinat.getX()+", y : "+warnaKoordinat.getY());
    }
}