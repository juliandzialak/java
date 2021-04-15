package pl.juliandzialak.shop;

public class SklepPrzyklad {
    public static void main(String[] args) {
        Sklep sklep = new Sklep(10);

        char[] jablko = {'j','a','b','l','k','o'};
        sklep.dodaj(new Produkt(jablko));
        char[] gruszka = {'g','r','u','s','z','k','a'};
        sklep.dodaj(new Produkt(gruszka));

        sklep.wyswietlProdukty();
    }
}
