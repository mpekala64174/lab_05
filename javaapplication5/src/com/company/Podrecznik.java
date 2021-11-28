package com.company;

public class Podrecznik extends Ksiazka{
    String rodzaj_podrecznik;

    public Podrecznik() {
    }

    public Podrecznik(String tytul, String rodzaj_podrecznik, int liczba_ksiazek, int liczba_stron) {
        this.tytul=tytul;
        this.rodzaj_podrecznik=rodzaj_podrecznik;
        this.liczba_ksiazek=liczba_ksiazek;
        this.liczba_stron=liczba_stron;
    }
}
