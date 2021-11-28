package com.company;

public class Ksiegarnia {
    int liczba_ksiazek;
    String nazwa_sklepu;

    public Ksiegarnia() {
    }

    public Ksiegarnia(String nazwa_sklepu){
        this.nazwa_sklepu=nazwa_sklepu;
    }

    public void zamow(Ksiazka ksiazka,double m){
        int n=(int)m;
        ksiazka.liczba_ksiazek+=n;
        System.out.println("Zamowiono "+n+" ksiazek o tytule "+ksiazka.tytul+" jest ich teraz "+ksiazka.liczba_ksiazek);
    }
    public void rozdaj(Ksiazka ksiazka){
        ksiazka.liczba_ksiazek=0;
        System.out.println("Rozdano ksiazki! "+ksiazka.tytul);
        System.out.println("Jest ich teraz "+ksiazka.liczba_ksiazek);
    }
}
