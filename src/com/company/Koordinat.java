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

public class Koordinat {
    protected int x;
    protected int y;

    public Koordinat(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
