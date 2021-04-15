package pl.juliandzialak.shop;

public class Sklep {
    Produkt[] produkty;
    int index = 0;

    Sklep(int iloscProduktow){
        produkty = new Produkt[iloscProduktow];
    }

    void dodaj(Produkt produkt){
        produkty[index++] = produkt;
    }

    void wyswietlProdukty(){
        for (int i = 0; i < produkty.length && produkty[i] != null; i++) {
            produkty[i].wyswietl();
        }
    }
}
