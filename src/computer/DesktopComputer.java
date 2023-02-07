package computer;

import component.PowerSupply;
import component.RAM;
import component.Storage;
import component.VideoCard;

public class DesktopComputer extends Computer {
    private PowerSupply powerSupply;

    public DesktopComputer(Process process, VideoCard videoCard, RAM ram, Storage storage, PowerSupply powerSupply) {
        this.process = process;
        this.videoCard = videoCard;
        this.ram = ram;
        this.storage = storage;
        this.powerSupply = powerSupply;
    }

    public DesktopComputer() {
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }
}
