package pl.juliandzialak.window;

public class Window {
    double weight;
    int height;
    int width;
    Producer producer;

    Window(double weight, int height, int width, Producer producer) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.producer = producer;
    }
}
