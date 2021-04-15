package pl.juliandzialak.window;

public class WindowsApp {
    public static void main(String[] args) {
        WindowRepo windowRepo = new WindowRepo();

        char[] name = {'a','b','c'};
        Producer x = new Producer(name, 12411231);
        Window window = new Window(22.5, 12,123, x);
        windowRepo.add(window);

        char[] n2 = {'z','a','z'};
        x = new Producer(n2, 62342132);
        window = new Window(22.5, 512,123, x);
        windowRepo.add(window);

        char[] n3 = {'x','x'};
        x = new Producer(n3, 7862341);
        window = new Window(123, 11,51, x);
        windowRepo.add(window);

        int height = 12131;
        Window w = windowRepo.findWindow(height);

        if(w != null) {
            System.out.println(w.producer.name);
        } else {
            System.out.println("Not found.");
        }
    }

}
