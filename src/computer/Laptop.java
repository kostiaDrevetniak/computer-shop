package computer;

import component.Display;
import component.RAM;
import component.Storage;
import component.VideoCard;

public class Laptop extends Computer {
    private Display display;

    public Laptop(Process process, VideoCard videoCard, RAM ram, Storage storage, Display display) {
        this.process = process;
        this.videoCard = videoCard;
        this.ram = ram;
        this.storage = storage;
        this.display = display;
    }

    public Laptop() {
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}
