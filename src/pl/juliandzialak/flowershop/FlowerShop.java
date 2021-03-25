package pl.juliandzialak.flowershop;

import java.util.ArrayList;

public class FlowerShop {
    private ArrayList<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public void displayFlowers(){
        for(Flower flower : flowers){
            flower.info();
        }
    }
}
