package com.company;

public class Powiesc extends Ksiazka{
    String rodzaj_powiesc;
    public Powiesc() {
    }

    public Powiesc(String tytul, String rodzaj_powiesc, int liczba_ksiazek, int liczba_stron) {
        this.tytul=tytul;
        this.rodzaj_powiesc=rodzaj_powiesc;
        this.liczba_ksiazek=liczba_ksiazek;
        this.liczba_stron=liczba_stron;
    }
    public Powiesc(Osoba autor, String tytul, String rodzaj_powiesc, int liczba_ksiazek, int liczba_stron){
        this.autor=autor;
        this.tytul=tytul;
        this.rodzaj_powiesc=rodzaj_powiesc;
        this.liczba_ksiazek=liczba_ksiazek;
        this.liczba_stron=liczba_stron;
    }
}
