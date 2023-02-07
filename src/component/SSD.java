package component;

public class SSD extends Storage {
    private int writeSped;
    private int readSped;

    public SSD(String name, String producer, double price, int memorySize, String formFactor, int writeSped, int readSped) {
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.memorySize = memorySize;
        this.formFactor = formFactor;
        this.writeSped = writeSped;
        this.readSped = readSped;
    }

    public int getWriteSped() {
        return writeSped;
    }

    public void setWriteSped(int writeSped) {
        this.writeSped = writeSped;
    }

    public int getReadSped() {
        return readSped;
    }

    public void setReadSped(int readSped) {
        this.readSped = readSped;
    }
}
