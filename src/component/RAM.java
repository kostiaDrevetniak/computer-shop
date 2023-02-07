package component;

public class RAM extends Component {
    private int memorySpeed;
    private byte density;

    public RAM(String name, String producer, double price, int memorySpeed, byte density) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.memorySpeed = memorySpeed;
        this.density = density;
    }

    public RAM() {
    }

    public int getMemorySpeed() {
        return memorySpeed;
    }

    public void setMemorySpeed(int memorySpeed) {
        this.memorySpeed = memorySpeed;
    }

    public byte getDensity() {
        return density;
    }

    public void setDensity(byte density) {
        this.density = density;
    }
}
