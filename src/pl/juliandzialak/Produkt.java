package pl.juliandzialak;

public class Produkt {
    char[] nazwa;

    Produkt(char[] nazwa){
        this.nazwa = nazwa;
    }

    void wyswietl(){
        for (char c : nazwa){
            System.out.print(c);
        }
        System.out.println();
    }
}
