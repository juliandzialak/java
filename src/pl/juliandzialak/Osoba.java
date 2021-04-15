package pl.juliandzialak;

class Osoba {
    // pola
    int wiek;
    char imie[];
    char nazwisko[];
    char adres[];

    Osoba(){}

    Osoba(int wiek){
        this.wiek = wiek;
    }

    Osoba(int nowyWiek, char[] noweImie){
        wiek = nowyWiek;
        imie = noweImie;
    }

    Osoba(int nowyWiek, char[] noweImie, char nowyAdres[]){
        wiek = nowyWiek;
        imie = noweImie;
        adres = nowyAdres;
    }

    // metody
    // nic nie zwraca
    // nic nie przyjmuje
    // metoda która wyświetli powitanie wg. wzoru "Witaj imie";
    void powitaj(){
        System.out.print("Witaj ");
        for(char c : imie){
            System.out.print(c);
        }
        System.out.println();
    }
}
