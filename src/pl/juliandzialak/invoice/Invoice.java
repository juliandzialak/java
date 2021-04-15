package pl.juliandzialak.invoice;

public class Invoice {
    private int number;
    private Item[] items;

    public class Item {                      // klasa wewnętrzna
        private int ordinalNumber;
        private double price;
    }
}