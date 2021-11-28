package com.company;

public class Osoba extends Ksiegarnia{

    String imie;
    String nazwisko;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void kup(Ksiazka ksiazka) {
        if (ksiazka.liczba_ksiazek<=0) {
            throw new ArithmeticException("Nie da sie kupic - brak ksiazek");
        }
        ksiazka.liczba_ksiazek-=1;
        System.out.println("Kupiono jeden "+ksiazka.tytul+" pozostalo w ksiegarni "+ksiazka.liczba_ksiazek);

    }
    public void rozdaj(Ksiazka ksiazka){
        if(ksiazka.liczba_ksiazek>0){
            super.rozdaj(ksiazka);
        }
    }
}
