package pl.juliandzialak;

import pl.juliandzialak.invoice.Invoice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Metoda startowa....");

        int wiek = 22;
        char[] imie = {'M','a','r','e','k'};


        int wiek2 = 66;
        char[] imie2 = {'M','a','r','i','a'};


        Osoba os1;
        os1 = new Osoba();
        os1.wiek = 23;
        os1.imie = imie;
        System.out.println(os1.wiek);
        System.out.println(os1.imie);
        // metoda nic nie zwracajaca, nic nie przyjmuje (wywołania)
        os1.powitaj();

        Osoba os2 = new Osoba();
        os2.imie = imie2;
        System.out.println(os2.wiek);
        System.out.println(os2.imie);
        os2.powitaj();

        System.out.println("----------------------------------------");
        Samochod prywatny = new Samochod();
        Samochod sluzbowy = new Samochod();
        Samochod zony = new Samochod();

        char[] bmw = {'b','m','w'};
        prywatny.rocznik = 1999;
        prywatny.marka = bmw;
        prywatny.cena = 22222;

        char[] fiat = {'f','i','a','t'};
        sluzbowy.rocznik = 2001;
        sluzbowy.marka = fiat;

        zony.rocznik = 1990;
        zony.marka = bmw;
        zony.cena = 111154;

        System.out.println("----- prywatny -------");
        prywatny.info();
        System.out.println("----- sluzbowy -------");
        sluzbowy.info();
        System.out.println("----- zony -------");
        zony.info();

        sluzbowy = prywatny;

        System.out.println("===================================");

        System.out.println("----- prywatny -------");
        prywatny.info();
        System.out.println("----- sluzbowy -------");
        sluzbowy.info();
        System.out.println("----- zony -------");
        zony.info();

        // porównywaniu obiektów ?
        Samochod kolegi = new Samochod();
        kolegi.marka = bmw;
        kolegi.rocznik = 1990;
        System.out.println("----- kolegi -------");
        kolegi.info();

        System.out.println();
        // czy samochó kolegi i żony to są te same auta?
        if(kolegi == zony){
            System.out.println("Tak. Żony i kolegi to te same auta");
        } else {
            System.out.println("Nie. Żony i kolegi to inne auta.");
        }

        // czy samochó służbowy i prywatny to te same auta?
        if(sluzbowy == prywatny){
            System.out.println("Tak. sluzbowy i prywatny to te same auta");
        } else {
            System.out.println("Nie. sluzbowy i prywatny to inne auta.");
        }

        // ile lat ma samochó służbowy?
        int ileLat = sluzbowy.ileLatMaSamochod();
        System.out.println("Samochód służbowy ma "+ileLat+" lat.");


        // No dobra... może jakiś bonus?
        double cenaSluzbowegoPoObnizce = sluzbowy.ilePoObnizce(0.2);
        System.out.println("Cena samochodu służbowego po oniżce 20%: "+cenaSluzbowegoPoObnizce);

        // No dobra... może jakiś bonus?
        cenaSluzbowegoPoObnizce = sluzbowy.ilePoObnizce(0.1);
        System.out.println("Cena samochodu służbowego po oniżce 10%: "+cenaSluzbowegoPoObnizce);

        cenaSluzbowegoPoObnizce = sluzbowy.ilePoObnizce(0.8);
        System.out.println("Cena samochodu służbowego po oniżce 80%: "+cenaSluzbowegoPoObnizce);

        sluzbowy.obnizCeneOKwote(2000);
        sluzbowy.info();

        //metoda która ma ustawić nową ceną na 5000.
        sluzbowy.cenaNa5Tys();

        // ktoś wie żę obecna cena to 5 tys zł i... chece obniżyć o 2000zł, ale

        sluzbowy.cenaNa3Tys();

        sluzbowy.obnizCeneOKwote(2000);

        sluzbowy.info();


        // konstruktor - inicjalizacja obiektu - ustawienie początkowych wartości
        Osoba o10 = new Osoba(22);
        char[] imie11 = {'K','a','r','o','l'};
        Osoba o11 = new Osoba(44, imie11);

        char[] adres = {'Z','i','e','l','o','n','a'};
        Osoba o12 = new Osoba(44, imie11, adres);

        // this - umożliwia dostęp do przesłoniętej zmiennej
        Math math = new Math();
        int x = 3;
        int y = 1;
        int sum = math.sum(x, y);
        System.out.println("Suma: "+sum);

        long l5 = 51;
        long l6 = 55;
        long longSum = math.sum(l5, l6);
        System.out.println("Suma: "+longSum);

        longSum = math.sum(l5, l6, 4);
        System.out.println("Suma: "+longSum);


        Invoice.Item item = new Invoice().new Item();
        Invoice i = new Invoice();
        Invoice.Item item2 = i.new Item();
    }
}
