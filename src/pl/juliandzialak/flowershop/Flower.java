package pl.juliandzialak.flowershop;

public class Flower {
    private String name;
    private String color;
    private String type;

    public Flower(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public void info(){
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Type: "+type);
    }
}
