package component;

public class VideoCard extends Component {
    private int memorySpeed;
    private byte memorySize;

    public VideoCard(String name, String producer, double price, int memorySpeed, byte memorySize) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.memorySpeed = memorySpeed;
        this.memorySize = memorySize;
    }

    public VideoCard() {
    }

    public int getMemorySpeed() {
        return memorySpeed;
    }

    public void setMemorySpeed(int memorySpeed) {
        this.memorySpeed = memorySpeed;
    }

    public byte getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(byte memorySize) {
        this.memorySize = memorySize;
    }
}
