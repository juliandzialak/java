package pl.juliandzialak;

public class WindowRepo {
    Window[] windows = new Window[10];
    int index = 0;

    void add(Window window){
        windows[index++] = window;
    }

    Window findWindow(int height){
        for (int i = 0; i < index; i++) {
            if(windows[i].height == height){
                return windows[i];
            }
        }
        return null;
    }
}
