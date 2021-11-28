package com.company;
public class Main {

    public static void main(String[] args) {
        Ksiegarnia ks1 = new Ksiegarnia("Sklep z ksiazkami");
        Podrecznik p1= new Podrecznik("Sztuka kochania","Nauka o zyciu",1,321);
        Powiesc p2= new Powiesc("W dzicz","Podroznicza",4,543);
        Osoba k1 = new Osoba();
        Osoba k2 = new Osoba();
        k1.kup(p1);
        ks1.zamow(p1,4.4);
        k1.kup(p2);
        ks1.zamow(p2,4.1);

        Powiesc p3 = new Powiesc(new Osoba("Jan","Kowalski"),"Nowa powiesc","Nowela",3,312);

        k1.rozdaj(p2);

    }
}
