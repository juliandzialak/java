package pl.juliandzialak.flowershop;

public class AppStart {
    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();

        Flower f1 = new Flower("Bratek", "czerwony", "B");
        Flower f2 = new Flower("Stokrotka", "czarny", "A");
        Flower f3 = new Flower("Róża", "zielony", "C");

        flowerShop.addFlower(f1);
        flowerShop.addFlower(f2);
        flowerShop.addFlower(f3);

        flowerShop.displayFlowers();
    }
}
