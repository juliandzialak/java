package pl.juliandzialak;

public class Samochod {
    int rocznik;
    char[] marka;
    double cena;

    // wyswiet wszytko o samochodzie
    void info(){
        System.out.println("Rocznik: "+rocznik);

        System.out.print("Marka: ");
        for(char c : marka){
            System.out.print(c);
        }
        System.out.println();

        System.out.println("Cena: "+cena);
    }

    int ileLatMaSamochod(){
        return 2020-rocznik;
    }

    double ilePoObnizce(double procent) {
        return cena - cena*procent;
    }

    /*
    typ/void nazwa (parametry){
        instrukcje
    }
   */

    void obnizCeneOKwote(double kwota){
        cena -= kwota;
    }

    // metoda któa ustawia cenę na 5tys.
    void cenaNa5Tys(){
        cena = 5000;
    }

    void cenaNa3Tys(){
        cena = 3000;
    }

}
